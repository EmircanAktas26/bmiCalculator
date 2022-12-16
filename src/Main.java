import java.sql.SQLOutput;
import java.util.Scanner;

/*
 *@Author Emircan Aktaş - 16.Dec.2022
 */
public class Main {
    public static void main(String[] args) {

        /*
        *formula : weight / (height*height);
         */

        Scanner inp = new Scanner(System.in);

        double height, weight,convertHeight,bmi;

        System.out.print("Your height(cm) :");
        height = inp.nextDouble();
        System.out.print("Your weight :");
        weight = inp.nextDouble();

        convertHeight = height/100;     //Convert cm to m;

        bmi = (weight / (convertHeight * convertHeight));

        System.out.println("Your bmi :" +bmi);


    }
}