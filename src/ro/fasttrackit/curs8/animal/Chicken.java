package ro.fasttrackit.curs8.animal;

public class Chicken implements Interface{
    @Override
    public String walk() {
        return "walk like a chicken" ;
    }

    @Override
    public String talk() {
        return "cotcodac cotcodac";
    }

    @Override
    public String eat() {
        return "corn";
    }
}
