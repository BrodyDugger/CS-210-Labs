import java.util.ArrayList;

/**
 * Object that represents users of the messaging system.
 */
public class User
{
    // instance variables
    private int UserID;
    private ArrayList<Message> Inbox;

    /**
     * Constructor for objects of class User
     */
    public User(int UID)
    {
        // initialise instance variables
        this.UserID = UID;
        this.Inbox = new ArrayList<Message>();
    }
    
    public void UpdateConnect(){
        // interfaces with the Manager class to change whether or not this user is connected.
        System.out.println("Placeholder");
    }
    
    public void ShowMessage(int Order){
        // Shows the nth email in the user's inbox.
        if (Order < Inbox.size() && Order > 0){
            Message CurrentMessage = Inbox.get(Order);
            System.out.println("placeholder");
        }
        else{
            System.out.println("Order out of bounds - could not find message in inbox of the given order" );
        }
    }
    
    public void DeleteMessage(int Order){
        // Deletes the nth email in the user's inbox.
        if (Order < Inbox.size() && Order > 0){
        // Check to make sure the Order parameter is greater than zero and less than the size of the Inbox.
            Message CurrentMessage = Inbox.remove(Order);
            System.out.println("Deleted message");
        }
        else{
            System.out.println("Order out of bounds - could not find message in inbox of the given order" );
        }
    }
    
    public void DraftMessage(int RecipientID, String MessageType){
        // Creates and sends a message of the given type of the user with the given ID.
        switch (MessageType.toLowerCase()){
        // Proceed by cases based on which type of message the user specifies.
            case "email":
                System.out.print("placeholder");
            break;
            
            default:
                System.out.print("email type unrecognized");
            
        }
        }
        
    }
