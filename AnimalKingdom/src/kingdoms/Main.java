package kingdoms;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static List<Animal> filteredList = new ArrayList<>();
    public static void filterAnimal(List<Animal> animals, CheckAnimal tester)
    {
        filteredList.clear();
        for(Animal v: animals)
        {
            if(tester.test(v))
            {
                filteredList.add(v);
//                System.out.println(v);
            }

        }
    }
    public static void main(String[] args)
    {
        System.out.println("Start of Animal Kingdoms App");
        //create the arrayList
    List<Animal> myList = new ArrayList<>();
    myList.add(new Mammal("Panda", 1869));
    myList.add(new Mammal("Zebra", 1778));
    myList.add(new Mammal("Koala", 1816));
    myList.add(new Mammal("Sloth", 1804));
    myList.add(new Mammal("Armadillo", 1758));
    myList.add(new Mammal("Raccoon", 1758));
    myList.add(new Mammal("Bigfoot",2021));
    myList.add(new Bird("Pigeon", 1837));
    myList.add(new Bird("Peacock", 1821));
    myList.add(new  Bird("Toucan", 1758));
    myList.add(new Bird("Parrot", 1824));
    myList.add(new Bird("Swan", 1758));
    myList.add(new Fish("Salmon",1758));
    myList.add(new Fish("Catfish", 1817));
    myList.add(new Fish("Perch", 1758));

    myList.sort((a1,a2)-> a1.getName().compareToIgnoreCase(a2.getName()));
    System.out.println("Animals Alphabetical");
    myList.forEach(animal->System.out.println(animal.getName()));
    myList.sort((a1,a2)->a2.getYear() - a1.getYear());
    System.out.println("animals in descending year");
    myList.forEach(a->System.out.println(a.getName() + " " + a.getYear()));
    System.out.println("animals by mode of movement");
    myList.sort((a1,a2)->a1.move().compareToIgnoreCase(a2.move()));
    myList.forEach(a->System.out.println(a.getName() + " " + a.move()));
    System.out.println("Animals the have Lungs");
    filterAnimal(myList, a-> (a.breathe()=="Lungs"));
    filteredList.forEach(a->System.out.println(a.getName() + " " + a.breathe()));
    System.out.println("Animals with lungs and were named in 1758");
    filterAnimal(myList, a-> (a.breathe()=="Lungs")&&a.getYear()==1758);
    System.out.println(filteredList);
    System.out.println("Animals that have lungs and lay eggs");
    filterAnimal(myList, a->(a.breathe()=="Lungs" && a.reproduce()=="Eggs"));
    System.out.println(filteredList);
    System.out.println("Animals alphabetical that were named in 1758");
    filterAnimal(myList, a->a.getYear()==1758);
    filteredList.sort((a1,a2) ->a1.getName().compareToIgnoreCase(a2.getName()));
    System.out.println(filteredList);
    System.out.println("Mammals alphabetical");
    filterAnimal(myList, a->((a instanceof Mammal)));
    filteredList.sort((a1,a2) ->a1.getName().compareToIgnoreCase(a2.getName()));
    System.out.println(filteredList);
    }
}