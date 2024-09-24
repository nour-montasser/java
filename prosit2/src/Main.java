import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*ZooManagement zm = new ZooManagement();

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number of cages");

        int numberOfCages = sc.nextInt();

        System.out.println("Insert the name of the zoo");

        String nameOfZoo = sc.next();

        zm.nbrCages = numberOfCages;
        zm.zooName = nameOfZoo;*/



        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();

        Zoo notMyZoo = new Zoo("zooooo", "tunis",25);
        Animal dog = new Animal("Canine", "dogg", 2, true);

        notMyZoo.displayZoo();
        System.out.println(notMyZoo);
        System.out.println(lion);

       // zm.displayInformation();
    }
}
