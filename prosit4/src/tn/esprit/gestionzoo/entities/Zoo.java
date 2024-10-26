package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal[] animals;
    private String name, city;
    private int nbrAnimals = 0;
    private static final int nbrCages = 25;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null)
            this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getNbrAnimals() {
        return nbrAnimals;
    }
    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }
    public Animal[] getAnimals() {
        return animals;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }


    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + nbrCages + " N° animals: " + nbrAnimals);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + nbrCages + " N° animals: " + nbrAnimals;
    }

    public boolean addAnimal(Animal animal) {
        if(isZooFull())
            return false;
        if(searchAnimal(animal)==-1) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;

        } return true;
    }

    public void showAnimals() {
        for (int i = 0; i < nbrAnimals;i++)
            System.out.println(animals[i]);
    }

    public int searchAnimal(Animal animal)
    {
        for(int i = 0; i < nbrAnimals;i++)
        {
            if(animals[i].getName().equals(animal.getName()))
                return i;
        }return -1;
    }

    public boolean removeAnimal(Animal animal)
    {
        if(searchAnimal(animal)==-1)
            return false;
        else{
            animals[searchAnimal(animal)] = null;
        }for(int i=searchAnimal(animal);i<nbrAnimals;i++) {
             animals[i] = animals[i + 1];
        }
        this.nbrAnimals--;
        return true;
    }
    public boolean isZooFull() {
        return nbrAnimals == nbrCages;
    }
    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }
}