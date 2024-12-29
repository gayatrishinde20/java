
import java.util.Random;
import java.util.Scanner;


public class Passwordgenerator{
    static void password(int length){
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialchar = "<>,.?/{]+_-)(*&^$!@#=";
        String combination = upper+lower+num+specialchar;
        char passChar[] = combination.toCharArray();
        char result[] = new char[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            
            result[i] = passChar[random.nextInt(combination.length())];
            System.out.print(result[i]);
        }
        System.out.println("\n");
    }
    

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("enter the password length:");
        int length = scanner.nextInt();
        password(length);
        
        }
        
        
    }
