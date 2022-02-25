import java.util.Scanner;

public class GitExercise {


    Scanner in = new Scanner(System.in);
    String greetings;
    void greet() {
        System.out.print("Indtast venligst dit navn: ");
        greetings = in.nextLine();
        System.out.println("Hej! "+ greetings);

    }

    void askAboutAge() {

        int age;

        System.out.print("Hvor gammel er du? ");
        age = in.nextInt();
        System.out.println("Du er "+ age + " år gammel");
    }

    void go() {
        greet();
        askAboutAge();
    }

    public static void main(String[] args) {

        new GitExercise().go();
        System.out.println("It Works!");
    }
}
