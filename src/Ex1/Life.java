package Ex1;

import java.text.NumberFormat;

//Xuan Tri Nguyen
//3013888576
//COMP228_Sec011
//Lab3_Ex1
//Duedate: Oct 18, 2024
public class Life extends Insurance {
    public Life() {
        this.type = "Life Insurance";
    }

    @Override
    void setInsuranceCost() {
        this.monthlyCost = 26;
    }

    @Override
    void displayInfo() {
        System.out.println("Insurance Type: " + getType());
        String usLifeInsuranceMonthlyCost = NumberFormat.getCurrencyInstance().format(getMonthlyCost());
        System.out.println("Monthly Cost: $" + usLifeInsuranceMonthlyCost);
    }
}