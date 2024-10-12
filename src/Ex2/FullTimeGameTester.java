package Ex2;
//Xuan Tri Nguyen
//3013888576
//COMP228_Sec011
//Lab3_Ex2
//Duedate: Oct 18, 2024
public class FullTimeGameTester extends GameTester{

   public FullTimeGameTester(String name, boolean jobType)
    {
        super(name, jobType);
    }

    @Override
    public double salary()
    {
        return 3000;
    }
}
