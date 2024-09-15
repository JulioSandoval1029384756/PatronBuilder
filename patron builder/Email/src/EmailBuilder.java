import java.util.ArrayList;
import java.util.List;

public class EmailBuilder {
    protected List<String> recipients;
    protected String subject;
    protected String body;
    protected List<String> attachments;

    // Constructor del builder
    public EmailBuilder() {
        this.recipients = new ArrayList<>();
        this.attachments = new ArrayList<>();
    }

    public EmailBuilder addRecipient(String recipient) {
        this.recipients.add(recipient);
        return this;
    }

    public EmailBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public EmailBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public EmailBuilder addAttachment(String file) {
        this.attachments.add(file);
        return this;
    }

    // Getters del builder
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

    public Email build() {
        if (recipients.isEmpty()) {
            throw new IllegalStateException("Debe haber al menos un destinatario");
        }
        if (subject == null || subject.isEmpty()) {
            throw new IllegalStateException("El asunto no puede estar vacío");
        }
        if (body == null || body.isEmpty()) {
            throw new IllegalStateException("El cuerpo no puede estar vacío");
        }
        return new Email(this);
    }
}
