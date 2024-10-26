package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("Cats","Simba",8,true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        myZoo.displayZoo();

        /*System.out.println(myZoo);
        System.out.println(dog);*/

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);

        myZoo.showAnimals();
        System.out.println(myZoo.searchAnimal(dog));

        System.out.println("---------------------------------------------------------");

        Terrestre cat = new Terrestre("family","name",5,true,5);

        Aquatique fish = new Aquatique("idk","fishou",4,false,"water");
        Dolphin dol = new Dolphin("idk","fishou",4,false,"water",4.5f);
        Penguin pen  = new Penguin("idk","fishou",4,false,"water",6.1f);

        System.out.println(dol);
        fish.swim();
        dol.swim();
        pen.swim();

        myZoo.addAquaticAnimal(fish);
        myZoo.addAquaticAnimal(dol);
        myZoo.addAquaticAnimal(pen);
        System.out.println("---------------------------------------------------------");
        for (int i=0;i< myZoo.getNbrAquatics();i++)
        {
            Aquatique[] a = myZoo.getAquaticAnimals();
            a[i].swim();

        }
        myZoo.displayNumberOfAquaticsByType();
        System.out.println(dol.equals(pen));



        
    }

}
