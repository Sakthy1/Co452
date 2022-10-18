package Week1;

import helpers.InputReader;
public class Week1 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        /*
        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);

        int height = InputReader.getInt("Enter Height: ");
        int length = InputReader.getInt("Enter Length: ");

        int area = height * length;

        System.out.println(area);

        int number1=InputReader.getInt("enter your first number");
        int number2=InputReader.getInt("enter your second number");
        int average= (number1+number2)/2;
        System.out.println("the average is"+average);

*/
        double total=0;

        int count=0;
        while(count<3)

        {
            total =total+InputReader.getDouble("Enter number:");
        count ++;
        }
        double average =total/(count+1);
        System.out.println("the average is"+average );







    } 

}