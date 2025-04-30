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
    public String MakeHeader() {
        return Header;
    }

    @Override
    public String MakeContents() {
        return Contents;
    }

    @Override
    public String MakeSignature() {
        return Signature + "\nFrom: " + Author;
    }

}
