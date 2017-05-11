package message;

/**
 * The message class to be sent over the network
 *
 * @author Kyle Rosenthal
 * @version 1
 */
public class Message {
   public MessageType type;
}
enum MessageType {
   LOGIN, USER_ACTION, GROUP_ACTION, TASK_ACTION
}
