public class NotificationDemo {

    public static void main(String[] args) {

        NotificationSender email = new EmailSender();
        email.send("hari@gmail.com", "Welcome to Java!");

        NotificationSender sms = new SmsSender();
        sms.send("9876543210", "Your OTP is 1234");

        NotificationSender push = new PushSender();
        push.send("Hari's Phone", "You have a new message");
    }
}