package ro.fasttrackit.curs8.company;

public class Facebook implements InterfaceCompany {
    private String facebook;

    public Facebook(String facebook){
        this.facebook = facebook;
    }

    @Override
    public void send(String advertise) {
        System.out.println("Send advertising message to " + facebook + advertise);
    }
}
