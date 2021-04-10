package ro.fasttrackit.curs8.company;

public class Email implements InterfaceCompany {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void send(String advertise) {
        System.out.println("Send advertise message to " + email + advertise);
    }
}
