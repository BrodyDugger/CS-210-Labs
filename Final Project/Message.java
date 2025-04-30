public interface Message {
    void MakeHeader();
    void MakeContents();
    void MakeSignature();
}