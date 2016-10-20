import java.util.Scanner;

/**
 * Created by Brad on 10/19/2016.
 */
public class DogDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to build a dog.\nWhat breed do you want?");
        String breed = scanner.nextLine();

        System.out.println("What color do you want?");
        String color = scanner.nextLine();
        Dog dog = new Dog(breed, color);

        System.out.println(dog.getBreed() + "'s are very loyal creatures and his " + dog.getColor() +
                " fur really shows off his... unique, personality.");

        System.out.println("What is his name?");
        dog.setName(scanner.nextLine());

        System.out.println(dog.getName() + " is excited to meet you!\n" +
                "Your dog is a: " + dog.toString() +
                "\nTry asking him to sit or speak. He loves being told \"good dog\".");
        String command = scanner.nextLine();
        dog.acceptCommand(command);

        System.out.println("Your dog is happy to please you..." );
         dog.speak();
        dog.wagTail();
        System.out.println(dog.getName() + " wore himself out.");
        dog.sit();

        dog.pet();

        boolean ishappy = dog.feed("treats");
    }
}
