import java.util.Scanner;

public class Stugracalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of grades");
        int numgrade = scanner.nextInt();

        double[] grade = new double[numgrade];
        double sum = 0;

 for(int i = 0; i < numgrade; i++) {

    System.out.print("enter grade" + (i+1) + ":");
    grade[i]=scanner.nextDouble();
    sum += grade[i]; 
 }
 double avg = sum/numgrade;

System.out.printf("average grades is: %.2f%n",avg);

 scanner.close();

    }
}
