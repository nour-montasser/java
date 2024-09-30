import javax.print.DocFlavor;

public class Zoo {

    Animal[] animals;
    String name, city;
    int nbrAnimals = 0;
    static final int nbrCages = 25;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;

    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + nbrCages + " N° animals: " + nbrAnimals);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + nbrCages + " N° animals: " + nbrAnimals;
    }

    boolean addAnimal(Animal animal) {
        if(nbrAnimals==nbrCages)
            return false;
        if(searchAnimal(animal)==-1) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;

        } return true;
    }

    void showAnimals() {
        for (int i = 0; i < nbrAnimals;i++)
            System.out.println(animals[i]);
    }

    int searchAnimal(Animal animal)
    {
        for(int i = 0; i < nbrAnimals;i++)
        {
            if(animals[i].name.equals(animal.name))
                return i;
        }return -1;
    }

    boolean removeAnimal(Animal animal)
    {
        if(searchAnimal(animal)==-01)
            return false;
        else{
            animals[searchAnimal(animal)] = null;
        }for(int i=searchAnimal(animal);i<nbrAnimals;i++) {
             animals[i] = animals[i + 1];
        }
        this.nbrAnimals--;
        return true;
    }
    boolean isZooFull() {
        return nbrAnimals == nbrCages;
    }
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }
}