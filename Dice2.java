import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random random = new Random();

        // Simulate rolling two dice
        int die1 = random.nextInt(6) + 1; // Random number between 1 and 6 for first die
        int die2 = random.nextInt(6) + 1; // Random number between 1 and 6 for second die

        System.out.println("First die: " + die1);
        System.out.println("Second die: " + die2);

        int total = die1 + die2;
        System.out.println("Total: " + total);
    }
}
In this code, the Random class is used to generate random numbers. nextInt(6) generates random integers from 0 to 5, and by adding 1, it becomes a random number from 1 to 6, which is suitable for a six-sided die.

When you run this code, it will simulate rolling two dice and display the individual values of each die as well as their total. Each time you run the program, you will get different random numbers.





