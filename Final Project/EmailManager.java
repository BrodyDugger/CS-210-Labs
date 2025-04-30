import java.util.ArrayList;

public class EmailManager {
    ArrayList<User> ConnectedUsers = new ArrayList<>();


    public void AddUsers(User user) {
        if (ConnectedUsers.contains(user)){
            System.out.println(user + " already exists");
        } else {
            ConnectedUsers.add(user);
            System.out.println(user + " added");
        }

    }

    public void RemoveUser(User user) {
        if (ConnectedUsers.contains(user) == false){
            System.out.println(user + " does not exist");
        } else {
            ConnectedUsers.remove(user);
            System.out.println(user + " removed");
        }
    }

    public void SendEmail(User sender, User receiver, String header, String content, String signature) throws ClassCastException {
        if (ConnectedUsers.contains(sender) && ConnectedUsers.contains(receiver)) {
            Email email = new Email(header, content, signature, sender.authorName);
            receiver.UpdateConnect(email);
        } else {
            System.out.println(sender + " or " + receiver + " doesn't exist");
        }
    }

    public ArrayList<User> GetUsers() {
        return ConnectedUsers;
    }
}