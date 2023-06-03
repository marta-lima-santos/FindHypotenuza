import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        double z; //Hypotenuse result
        Scanner newz = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = newz.nextDouble();
        System.out.println("Enter side y: ");
        y = newz.nextDouble();
        z = Math.sqrt((x*x)+(y*y)); //the formula

        System.out.println("The hypotenuse is: "+z);
        }
    }
