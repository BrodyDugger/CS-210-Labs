public class Main {
    public static void main(String[] args) {
        EmailManager manager = new EmailManager();

        User alice = new User(1, "Alice");
        User bob = new User(2, "Bob");

        manager.AddUsers(alice);
        manager.AddUsers(bob);

        alice.DraftEmail("Meeting Update", "Meeting moved to 3 PM.", "Regards, Alice");
        manager.SendEmail(alice, bob, "Meeting Update", "Meeting moved to 3 PM.", "Regards, Alice");

        System.out.println("Bob's Inbox:");
        bob.ShowEmail();
        manager.RemoveUser(bob);
    }
}
