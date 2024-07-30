
public class NotifierTest {
    public static void main(String[] args) {
       
        Notifier emailNotifier = new EmailNotifier();

        
        emailNotifier.send("Hello, this is an email notification.");

       
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        
        smsNotifier.send("Hello, this is an SMS notification.");

        
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

       
        slackNotifier.send("Hello, this is a Slack notification.");
    }
}