package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatique{
    private float swimmingDepth;

    public Penguin() {}

    public Penguin(String family, String name, int age, boolean isMammal,String Habitat,float swimmingDepth) {
        super(family, name, age, isMammal, Habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
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
                ", swimmingDepth=" + swimmingDepth +
                '}';
    }


}
