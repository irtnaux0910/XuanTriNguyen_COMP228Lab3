package Ex1;

import java.text.NumberFormat;

//Xuan Tri Nguyen
//3013888576
//COMP228_Sec011
//Lab3_Ex1
//Duedate: Oct 18, 2024
public class Health extends Insurance {

    public Health() {
        this.type = "Health Insurance";
    }

    @Override
    void setInsuranceCost() {
        this.monthlyCost = 63;
    }

    @Override
    void displayInfo() {
        System.out.println("Insurance Type: " + getType());
        String usHealthInsuranceMonthlyCost = NumberFormat.getCurrencyInstance().format(getMonthlyCost());
        System.out.println("Monthly Cost: " + usHealthInsuranceMonthlyCost);
    }
}
