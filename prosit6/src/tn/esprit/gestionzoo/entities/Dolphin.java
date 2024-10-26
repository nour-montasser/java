package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatique{
    private float swimmingSpeed;

    public Dolphin() {}
    public Dolphin(String family, String name, int age, boolean isMammal,String Habitat,float swimmingSpeed) {
        super(family, name, age, isMammal, Habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
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
                ", swimmingSpeed=" + swimmingSpeed +
                '}';
    }

    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

}
