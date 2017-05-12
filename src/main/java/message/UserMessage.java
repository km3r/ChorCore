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

   public UserMessage(long userID, MessageType type) {
      super(userID, type);
   }
}

enum UserMessageType {
   CREATE, UPDATE, ADD_GROUP, LEAVE_GROUP
}
