package ro.fasttrackit.curs8.company;

public class ContactPage {
    private String[] advertising;

    public ContactPage(String[] advertising) {
        this.advertising = advertising;
    }

    public void sendAdvertising(InterfaceCompany platform) {
        for (String adv : advertising) {
            platform.send("advertise " + adv);
        }
    }
}
