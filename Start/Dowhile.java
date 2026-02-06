import java.util.*;
public class Dowhile {
    public static void main(String[] args) {
        double finalscore;
        Scanner marks = new Scanner(System.in);
        boolean result;
        do {
            System.out.println("Enter maths marks:");
            int maths = marks.nextInt();

            System.out.println("Enter phy marks:");
            int phy = marks.nextInt();

            System.out.println("Enter chem marks:");
            int chem = marks.nextInt();

            finalscore = (maths + phy + chem) / 3.0;

            if (finalscore > 90) {
                System.out.println("Excellent");
            } else if (finalscore > 50 && finalscore <= 90) {
                System.out.println("Good");
            } else {
                System.out.println("To improve");
            }

            System.out.println("Do you want to continue? (true/false)");
            result = marks.nextBoolean();

        } while (result);

    }
}