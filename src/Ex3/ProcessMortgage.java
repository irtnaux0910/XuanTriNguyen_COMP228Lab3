package Ex3;

import java.util.Scanner;
//Xuan Tri Nguyen
//3013888576
//COMP228_Sec011
//Lab3_Ex3
//Duedate: Oct 18, 2024
public class ProcessMortgage {

    public static void main(String[] args) {

        Mortgage mortgages[] = new Mortgage[3];
        double interestRate, mortgageAmount;
        int mortgageNumber, term;
        String customerName,mortgageType;

        Scanner scan = new Scanner(System.in);

        System.out.println(" CITYTORONTO BANK MORTGAGE SYSTEM");
        System.out.println(" -------------------------------- ");
        System.out.print(" Enter current interest rate : ");

        interestRate =scan.nextDouble();
        scan.nextLine();

        for(int i=0;i<mortgages.length;i++)
        {
            System.out.println();
            System.out.print(" Mortgage Type (Personal or Business) : ");
            mortgageType = scan.nextLine();
            while(!mortgageType.equalsIgnoreCase("Personal") && !mortgageType.equalsIgnoreCase("Business"))
            {
                System.out.print(" Invalid Mortgage type. Mortgage Type (Personal or Business) : ");
                mortgageType = scan.nextLine();
            }

            System.out.print(" Mortgage Number : ");
            mortgageNumber = scan.nextInt();

            scan.nextLine();

            System.out.print(" Customer Name : ");
            customerName = scan.nextLine();

            System.out.print(" Mortgage Amount : ");
            mortgageAmount = scan.nextDouble();

            System.out.print(" Term (1, 3 or 5) : ");
            term = scan.nextInt();

            scan.nextLine();

            if(mortgageType.equalsIgnoreCase("Personal"))
            {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, interestRate, term);
            }
            else {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, interestRate, term);
            }
            System.out.println();
        }

        System.out.println(" Details of Mortgages : ");
        System.out.println(" -------------------- ");

        for(int i=0;i<mortgages.length;i++)
        {
            mortgages[i].getMortgageInfo();

            System.out.println();
        }
        scan.close();
    }

}
