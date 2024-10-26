package tn.esprit.gestionzoo.entities;

public class Aquatique extends Animal {
    protected String habitat;

    public Aquatique() {}
    public Aquatique(String family, String name, int age, boolean isMammal,String Habitat) {
        super(family, name, age, isMammal);
        this.habitat = Habitat;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString()
    {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat =" + habitat +
                '}';
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
    @Override
    public boolean equals(Object a)
    {
        if (this == a) return true;
        if (a == null) return false;
        if (a instanceof Aquatique) {
            return name.equals(((Aquatique)a).name) && age == ((Aquatique)a).age && habitat.equals(((Aquatique)a).habitat);
        }return false;

    }

}
