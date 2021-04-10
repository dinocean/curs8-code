package ro.fasttrackit.curs8.animal;

public class Duck implements Interface {
    @Override
    public String walk() {
        return "walk like a duck";
    }

    @Override
    public String talk() {
        return "mac mac";
    }

    @Override
    public String eat() {
        return "corn";
    }
}
