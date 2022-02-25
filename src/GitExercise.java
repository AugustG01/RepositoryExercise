import java.util.Scanner;

public class GitExercise {


    Scanner in = new Scanner(System.in);
    String greetings;
    void greet() {
        System.out.print("Indtast venligst dit navn: ");
        greetings = in.nextLine();
        System.out.println("Hej! "+ greetings);

    }

    public static void main(String[] args) {

        new GitExercise().greet();
        System.out.println("It Works!");
    }
}
