package kingdoms;

public class Mammal extends Animal
{
    public Mammal(String name, int year)
    {
        super(name, year);
    }
    public String reproduce()
    {
        return "Live Births";
    }

    public String move()
    {
        return "Walk";
    }

    public String breathe()
    {
        return "Lungs";
    }

    @Override
    public String toString()
    {
        return "id:" + id + " Name:" + name + " yearNamed:" + year;
    }
}