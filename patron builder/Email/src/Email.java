import java.util.List;

public class Email {
    private List<String> recipients;
    private String subject;
    private String body;
    private List<String> attachments;

    Email(EmailBuilder builder) {
        this.recipients = builder.getRecipients();
        this.subject = builder.getSubject();
        this.body = builder.getBody();
        this.attachments = builder.getAttachments();
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    @Override
    public String toString() {
        return "Email{" +
                "recipients=" + recipients +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", attachments=" + attachments +
                '}';
    }

    public static EmailBuilder builder() {
        return new EmailBuilder();
    }
}