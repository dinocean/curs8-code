package ro.fasttrackit.curs8.animal;

public class Mouse implements Interface {
    @Override
    public String walk() {
        return "walk like a mouse";
    }

    @Override
    public String talk() {
        return "chit chit";
    }

    @Override
    public String eat() {
        return "cheese";
    }
}
