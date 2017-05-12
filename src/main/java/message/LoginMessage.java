package message;

/**
 * chorCore
 * <p>
 * Created by Kyle on 5/11/2017.
 */
public class LoginMessage extends Message{
    String userName;
    byte[] hashPass;

    public LoginMessage( String userName, byte[] hashPass) {
        super(0, MessageType.LOGIN);
    }
}
