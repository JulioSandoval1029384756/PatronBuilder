public class EmailBuilderExample {
    public static void main(String[] args) {
        Email email = Email.builder()
                .addRecipient("example1@mail.com")
                .addRecipient("example2@mail.com")
                .setSubject("Reunión de Proyecto")
                .setBody("Por favor, asistan a la reunión el próximo martes a las 10:00 am.")
                .addAttachment("agenda.pdf")
                .build();

        System.out.println(email);
    }
}
