package ro.fasttrackit.curs8.company;

public class Main {
    public static void main(String[] args) {
        String [] advertising = {
                " Buna ziua tuturor ,",
                " Astazi va vom prezenta ,",
                " Noul nostru produs performant de sport ,",
                " Pentru a exersa acasa in timpul pandemiei ."
        };

        ContactPage contactPage = new ContactPage(advertising);

        contactPage.sendAdvertising(new Facebook("Mot Demetrius "));
        contactPage.sendAdvertising(new Email("nike_demi@yahoo.com "));
        contactPage.sendAdvertising(new Print("Xerox "));
    }
}
