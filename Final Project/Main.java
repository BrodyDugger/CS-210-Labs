public class Main {
    public static void main(String[] args) {
        EmailManager manager = new EmailManager();

        User alice = new User(1, "Alice");
        User bob = new User(2, "Bob");

        manager.AddUsers(alice);
        manager.AddUsers(bob);

        alice.DraftEmail("Meeting Update", "Meeting moved to 3 PM.", "Regards, Alice");
        manager.SendEmail(alice, bob, "Meeting Update", "Meeting moved to 3 PM.", "Regards, Alice");

        bob.DraftEmail("Re: Meeting Update", "Thanks for the update!", "Best, Bob");
        manager.SendEmail(bob, alice, "Re: Meeting Update", "Thanks for the update!", "Best, Bob");

        System.out.println("Bob's Inbox:");
        bob.ShowEmail();

        System.out.println("Alice's Inbox:");
        alice.ShowEmail();

        manager.RemoveUser(bob);
        manager.RemoveUser(alice);
    }
}
