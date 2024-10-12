package Ex2;
//Xuan Tri Nguyen
//3013888576
//COMP228_Sec011
//Lab3_Ex2
//Duedate: Oct 18, 2024
abstract class GameTester {

    //Tester's Name
    private String name;

    //Full-time or Part-time
    private boolean jobType;

    public GameTester(String name, boolean jobType)
    {
        this.name = name;
        this.jobType = jobType;
    }

    public abstract double salary();
}
