package controller;

import model.DatabaseHolder;
import model.Group;
import model.Task;
import model.User;

/**
 * chorCore
 * <p>
 * Created by Kyle on 4/27/2017.
 */
public class TaskEventFactory {

    public static TaskEvent getTaskEvent(DatabaseHolder holder, int taskID, int groupID, int userID) throws BadIDException {
        Group g = holder.getGroup(groupID);
        User u = holder.getUser(userID);
        if (g == null || u == null) throw new BadIDException();
        Task t = null;
        for (Task task : g.getTasks()) {
            if (task.getTaskID() == taskID) {
                t = task;
                break;
            }
        }
        if (t == null) throw new BadIDException();
        return new TaskEvent(t,g,u);
    }
}