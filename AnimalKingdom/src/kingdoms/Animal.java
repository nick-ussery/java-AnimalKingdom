package kingdoms;

abstract class Animal
{
    private static int maxId =0;
    protected int id;
    int year;
    String name;
     void eat()
     {
         System.out.println(name+ " has eaten");
     }

    public Animal(String name, int year)
        {
            maxId++;
            this.id = maxId;
            this.name = name;
            this.year = year;
        }
    int getId()
        {
            return id;
        }
    String getName()
        {
            return name;
        }
    int getYear()
        {
            return year;
        }
//    abstract String getMove();
//    abstract String getReproduce();


}