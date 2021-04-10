package ro.fasttrackit.curs8.animal;

public class Cat implements Interface {

    @Override
    public String walk() {
        return "walk like a cat";
    }

    @Override
    public String talk() {
        return "miau miau";
    }

    @Override
    public String eat() {
        return "wisckas";
    }
}
