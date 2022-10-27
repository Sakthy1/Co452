package Week4;

import Week3.Student;
import java.util.*;

public class Week04 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 4 Java Collections, Lists, Arrays ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        Student nick=new Student(022222, "nick");
        Student rayan=new Student(022222, "rayan");
        Student onkar=new Student(022222, "onkar");

        ArrayList<Student>students=new ArrayList<Student>();
        students.add(rayan);
        students.add(nick);
        students.add(onkar);

        for (Student student :students)
        {
            student.display();
        }
}
    }     
    
