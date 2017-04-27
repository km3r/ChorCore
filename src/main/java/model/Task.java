package model;

import java.util.Observable;

/**
 * chorCore
 * <p>
 * Created by Kyle on 4/27/2017.
 */
public class Task extends Observable {
    private static int curID = 0;
    private String name;
    private User assigned;
    private int taskID;

    public Task(String name, User assigned) {
        this.name = name;
        this.assigned = assigned;
        taskID = curID;
        curID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        notifyObservers();
        this.name = name;
    }

    public User getAssigned() {
        return assigned;
    }

    public void setAssigned(User assigned) {
        notifyObservers();
        this.assigned = assigned;
    }

    public int getTaskID() {
        return taskID;
    }
}
