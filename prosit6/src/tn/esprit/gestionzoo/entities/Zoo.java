package tn.esprit.gestionzoo.entities;

public class Zoo {

    private Animal[] animals;
    private String name, city;
    private int nbrAnimals = 0;
    private static final int nbrCages = 25;
    private Aquatique[] aquaticAnimals;
    private int nbrAquatics = 0;


    public Zoo() {
    }

    public Zoo(String name, String city) {
        aquaticAnimals = new Aquatique[10];
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
    public Aquatique[] getAquaticAnimals() {
        return aquaticAnimals;
    }
    public void setAquaticAnimals(Aquatique[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public void setNbrAquatics(int nbrAquatics) {
        this.nbrAquatics = nbrAquatics;
    }
    public int getNbrAquatics(){
        return nbrAquatics;
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

    public void addAquaticAnimal(Aquatique aquatic)
    {
        aquaticAnimals[nbrAquatics]=aquatic;
        nbrAquatics++;
    }

    public float maxPenguinSwimmingDepth()
    {
        float max=0f;
        Aquatique[] a=aquaticAnimals;
        for(int i = 0; i < nbrAquatics;i++) {
            if (a[i] instanceof Penguin && max>= ((Penguin) a[i]).getSwimmingDepth()) {
                max=((Penguin) a[i]).getSwimmingDepth();
            }

        }return max;
    }

    public void displayNumberOfAquaticsByType() {

        int p = 0;
        int d = 0;
        Aquatique[] a = aquaticAnimals;
        for (int i = 0; i < nbrAquatics; i++) {
            if (a[i].getClass() == Penguin.class) {
                p++;
            } else if (a[i].getClass() == Dolphin.class)
                d++;
        }
        System.out.println("Penguin: " + p + ", Dolphin: " + d);
    }


}