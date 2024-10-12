package Ex3;
//Xuan Tri Nguyen
//3013888576
//COMP228_Sec011
//Lab3_Ex3
//Duedate: Oct 18, 2024
public class PersonalMortgage extends Mortgage {

    public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int term)
    {
        super(mortgageNumber,customerName,mortgageAmount,(interestRate+2),term);
    }
}
