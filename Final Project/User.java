import java.util.ArrayList;

public class User implements Receiver {
    int UserID;
    ArrayList<Message> Inbox = new ArrayList<>();
    String authorName;

    public User(int id, String name) {
        this.UserID = id;
        this.authorName = name;
    }

    @Override
    public void DraftEmail(String header, String content, String signature) throws ClassCastException {
        Email email = new Email(header, content, signature, authorName);
        Inbox.add(email);
    }

    @Override
    public void ShowEmail() {
        for (Message msg : Inbox) {
            System.out.println("Header: ", msg.MakeHeader());
            System.out.println("Content: ", msg.MakeContents());
            System.out.println("Signature: ", msg.MakeSignature());
            System.out.println("-----------");
        }
    }

    @Override
    public void UpdateConnect(Message message) {
        Inbox.add(message);
    }

}
