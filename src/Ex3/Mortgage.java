package Ex3;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

//Xuan Tri Nguyen
//3013888576
//COMP228_Sec011
//Lab3_Ex3
//Duedate: Oct 18, 2024
abstract class Mortgage implements MortgageConstants {

    static Locale usa = new Locale("en", "US");
    Currency dollars = Currency.getInstance(usa);
    static NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
    private int mortgageNumber;
    private String customerName;
    private double mortgageAmount;
    private double interestRate;
    private int term;

    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term)
    {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        if(mortgageAmount > maxMortgageAmt)
        {
            this.mortgageAmount = maxMortgageAmt;
        }
        else
        {
            this.mortgageAmount = mortgageAmount;
        }
        this.interestRate = interestRate;

        if(term != shortTerm && term != mediumTerm && term != longTerm) {
            this.term = shortTerm;
        }
        else {
            this.term = term;
        }
    }

    public void getMortgageInfo()
    {
        System.out.println(" Bank Name : "+ bankName);
        System.out.println(" Mortgage Number : "+ mortgageNumber);
        System.out.println(" Customer Name : "+ customerName);
        System.out.println(" Mortgage Amount : "+ dollarFormat.format(mortgageAmount));
        System.out.println(" Interest rate : "+ interestRate+" % " );
        System.out.println(" Term : "+term);
        double amount_owed = mortgageAmount + (mortgageAmount*interestRate*term)/100;
        System.out.println(" Total amount owed after "+term+" years : "+dollarFormat.format(amount_owed));
    }
}
