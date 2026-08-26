class PushSender implements NotificationSender {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Push notification to " + recipient + ": " + message);
    }
}