package Ex1;
//Xuan Tri Nguyen
//3013888576
//COMP228_Sec011
//Lab3_Ex1
//Duedate: Oct 18, 2024
public abstract class Insurance {
    public String type;
    public double monthlyCost;

    public String getType() {
        return type;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    abstract void setInsuranceCost();
    abstract void displayInfo();
}