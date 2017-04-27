package model;

import java.util.List;

/**
 * chorCore
 * <p>
 * Created by Kyle on 4/27/2017.
 */
public class DatabaseHolder {
    List<User> allUsers;
    List<Group> allGroups; //groups also have tasks

    public List<User> getAllUsers() {
        return allUsers;
    }

    public List<Group> getAllGroups() {
        return allGroups;
    }

    public void addUser(User user) {
        allUsers.add(user);
    }

    public void addGroup(Group group) {
        allGroups.add(group);
    }

    public void removeUser(User user) {
        allUsers.remove(user);
    }

    public void removeGroup(Group group) {
        allGroups.remove(group);
    }

    public User getUser(long ID)
    {
        for (User u: allUsers)
        {
            if (u.getUserID() == ID)
                return u;
        }
        return null;
    }

    public Group getGroup(long ID){
        for (Group g: allGroups)
        {
            if (g.getGroupID() == ID)
                return g;
        }
        return null;
    }
}
