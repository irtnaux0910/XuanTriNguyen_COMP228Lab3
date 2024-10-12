package Ex2;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

//Xuan Tri Nguyen
//3013888576
//COMP228_Sec011
//Lab3_Ex2
//Duedate: Oct 18, 2024
public class Driver {

    public static void main(String[] args) {

        String name;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = input.nextLine();


        System.out.println("Hi" +" "+ name +", " + "What is your game tester job type? " +
                "\n1. Full-time Game Tester" +
                "\n2. Part-time Game Tester" +
                "\n3. Exit");
        System.out.println();
        System.out.print("Enter your Choice: ");

        int ch = input.nextInt();

        if(ch == 1)
        {

            // creating object of FullTimeGameTester class
            FullTimeGameTester o = new FullTimeGameTester(name, true);

            // display the Full-time salary
            String usFullTimeSalary = NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(o.salary());
            System.out.println(name + ", " + "Your salary as a Full-time Game Tester is: " + usFullTimeSalary);
        }

        else if (ch == 2)
        {

            // asking for number of hours in case of part-time tester
            System.out.print("Enter number of hours you have worked: ");
            int h = input.nextInt();

            // creating object of PartTimeGameTester class
            PartTimeGameTester o = new PartTimeGameTester(name, false, h);

            // display the Part-time salary
            String usPartTimeSalary = NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(o.salary());
            System.out.println();
            System.out.println(name + ", " + " Your salary as a Part-time Game Tester is: " + usPartTimeSalary);
        }
        else if (ch == 3){
            System.out.println("Thank you for using the application");
            System.exit(0);
        }
        else {
            System.out.println("Invalid choice");
        }

        input.close();

    }

}
