package model;

import model.Group;

import java.io.Serializable;
import java.util.ArrayList;
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
    int vacationDays;

    public User(String name, byte[] hashPass) {
        this.name = name;
        this.hashPass = hashPass;
        userID = curID;
        curID++;
        vacationDays = 0;
        groups = new ArrayList<>();
    }

    public long getUserID() {
        return userID;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof User)
            return ((User)o).userID == userID;
        return false;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }
}
