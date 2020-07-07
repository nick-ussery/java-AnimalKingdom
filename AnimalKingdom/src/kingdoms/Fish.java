package kingdoms;

public class Fish extends Animal
{
    public Fish(String name, int year)
    {
        super(name, year);
    }
    public String reproduce()
    {
        return "Eggs";
    }

    public String move()
    {
        return "Swim";
    }

    public String breathe()
    {
        return "Gills";
    }

    @Override
    public String toString()
    {
        return "Animal: " + name + " Movement: " + move() + " Breathes with:  " + breathe() + " Reproduces by " + reproduce();
    }
}