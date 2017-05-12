package message;

/**
 * chorCore
 * <p>
 * Created by Kyle on 5/11/2017.
 */
public class LoginReply extends Message {
    public LoginReply(long userID, MessageType type) {
        super(userID, type);
    }
}
