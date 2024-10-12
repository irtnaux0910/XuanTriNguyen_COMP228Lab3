package Ex2;
//Xuan Tri Nguyen
//3013888576
//COMP228_Sec011
//Lab3_Ex2
//Duedate: Oct 18, 2024
public class PartTimeGameTester extends GameTester{

    private int hours;

    public PartTimeGameTester(String name, boolean jobType, int hours)
    {
        super(name, jobType);
        this.hours = hours;
    }

    @Override
    public double salary()
    {
        return this.hours * 20;
    }
}
