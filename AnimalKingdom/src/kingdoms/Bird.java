package kingdoms;

public class Bird extends Animal
{
    public Bird(String name, int year)
    {
        super(name, year);
    }
    public String reproduce()
    {
        return "Eggs";
    }

    public String move()
    {
        return "Fly";
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