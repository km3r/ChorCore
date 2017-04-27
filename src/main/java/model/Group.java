package model;

import java.util.List;

/**
 * chorCore
 * <p>
 * Created by Kyle on 4/20/2017.
 */
public class Group {
    private static long curID = 0;
    private List<User> members;
    private List<Task> tasks;
    private String name;
    private long groupID;

    public Group(String name) {
        this.name = name;
        groupID = curID;
        curID++;
    }

    public long getGroupID() {
        return groupID;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
