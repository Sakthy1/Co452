package Week3;

public class Student {
    private int id;
    private String name;

    //Constructor
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    //Print method
    public void display()
    {
        System.out.println("id"+this.id);
        System.out.println("name"+this.name);
    }
    
}
