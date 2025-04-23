import java.util.ArrayList;

public class EmailManager extends User{
    private ArrayList Receiver;
    private ArrayList connectedUsers; 

    public void AddUsers(String UserID) {
        if (connectedUsers.contains(UserID)) {
            System.out.println("User" + UserID + "already exists");
        } else {
            connectedUsers.add(UserID);
            System.out.println("Added" + UserID);
        }
    }

    public void RemoveUser(String UserID) {
        if (connectedUsers.contains(UserID)) {
            connectedUsers.remove(UserID);
            System.out.println("User" + UserID + "removed");
        } else {
            System.out.println("User" + UserID + "not found");
        }
    }

    public void SendEmail(){
        //TODO: Make method
    }

    public void GetUsers(){
        System.out.println(new ArrayList<>(connectedUsers));
    }
}
