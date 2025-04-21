import java.util.Scanner; 


class Email implements Message{
    private String Header, Contents, Signature, Author;

    public Email (String Header, String Contents,
    String Signature, String Author){
        this.Header = Header;
        this.Contents = Contents;
        this.Signature = Contents;
        this.Author = Contents;
    }

    @Override
    public void MakeHeader(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter New Header");

        String Header = myObj.nextLine();
        System.out.println("Header now is:" + Header);
    }

    @Override
    public void MakeContents(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter New Contents");

        String Contents = myObj.nextLine();
        System.out.println("Contents are now:" + Contents);
    }

    @Override
    public void MakeSignature(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter New Signature");

        String Signature = myObj.nextLine();
        System.out.println("Signature is now:" + Signature);
    }

}
