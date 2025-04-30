public interface Receiver {
    void DraftEmail(String header, String content, String signature);
    void ShowEmail();
    void UpdateConnect(Message message);
}