import java.util.Scanner;

public class ChangeDifference {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Primul numar: ");
            double n1 = input.nextDouble();
            input.nextLine();
            System.out.println("Al 2-lea numar: ");
            double n2 = input.nextDouble();


            System.out.println(Math.abs(n1 - n2) < 0.01);
        }
    }


