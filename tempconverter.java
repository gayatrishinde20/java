
import java.util.Scanner;

public class tempconverter{
    
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the temperature value:");

    Double temp=sc.nextDouble();
     
    System.out.println("enter the unit (C for Celsius, F for Fahrenheit):");
    char unit = sc.next().charAt(0);

    if(unit == 'C')
    {
        double Fahrenheit = (temp * 9/5)+32;
        System.out.printf("%.2f°C is equal to %.2f°F%n", temp,Fahrenheit);

    }
    else if(unit == 'F')
    {
        double Celsius = (temp - 32) *5 / 9;
        System.out.printf("%.2f°F is equal to %.2f°C%n", temp,Celsius);
    }

    else {
        System.out.println("Not valid unit");
    }

    sc.close();
    }
    }


    