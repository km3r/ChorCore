package model;

import model.Group;

import java.io.Serializable;
import java.util.List;

/**
 * chorCore
 * <p>
 * Created by Kyle on 4/20/2017.
 */
public class User implements Serializable {
    private static long curID = 0;
    String name;
    long userID;
    byte[] hashPass;
    List<Group> groups;

    public User(String name, byte[] hashPass) {
        this.name = name;
        this.hashPass = hashPass;
        userID = curID;
        curID++;
    }

    public long getUserID() {
        return userID;
    }
}
