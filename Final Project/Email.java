public class Email implements Message {
    String Header;
    String Contents;
    String Signature;
    String Author;

    public Email(String header, String contents, String signature, String author) throws ClassCastException {
        this.Header = header;
        this.Contents = contents;
        this.Signature = signature;
        this.Author = author;
    }

    @Override
    public String MakeHeader() { //Method doesn't have a problem with String header in VSCode
        return Header;
    }

    @Override
    public String MakeContents() { //Method doesn't have a problem with String header in VSCode
        return Contents;
    }

    @Override
    public String MakeSignature() { //Method doesn't have a problem with String header in VSCode
        return Signature + "\nFrom: " + Author;
    }

}
