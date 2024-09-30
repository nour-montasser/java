public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

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

        
    }

}
