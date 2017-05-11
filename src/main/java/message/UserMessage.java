package message;

import model.User;

/**
 * (Short Description)
 *
 * @author Kyle Rosenthal
 * @version (AssignmentName)
 */
public class UserMessage  extends Message{
   User user;
}

enum UserMessageType {
   LOGIN, CREATE, UPDATE, ADD_GROUP, LEAVE_GROUP
}
