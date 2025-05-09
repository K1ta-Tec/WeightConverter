package practiceTwo;
import java.util.Scanner;

public class weightConversion {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newSize;
        int change;

        System.out.println("1: Enter the weight in kgs");
        System.out.println("2: Enter the weight in lbs");

        //prompt
        System.out.println("Choose/Change the option: ");
        change = scanner.nextInt();

        if(change == 1){
            System.out.println("What is the weight in lbs ?");
            weight = scanner.nextDouble();
            newSize = weight * 0.453592;
            System.out.printf("The new weight is %.2f", newSize);
        }

        else if (change == 2){
            System.out.println("What is the weight in kgs ?");
            weight =scanner.nextDouble();
            newSize = weight * 2.20462;
            System.out.printf("The new weight is %.2f ", newSize);
        }

        else{
            System.out.println("System error! ");
        }



        scanner.close();
    }




}
