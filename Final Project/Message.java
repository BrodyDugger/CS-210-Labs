public interface Message {
    String MakeHeader();
    String MakeContents();
    String MakeSignature();
}