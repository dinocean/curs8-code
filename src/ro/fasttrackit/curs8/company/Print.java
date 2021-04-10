package ro.fasttrackit.curs8.company;

public class Print implements InterfaceCompany {
    private String print;

    public Print (String print){
        this.print = print;
    }


    @Override
    public void send(String advertise) {
        System.out.println("Print the advertising  message for posters " + print + advertise );
    }
}
