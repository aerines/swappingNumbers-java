
import java.util.Scanner;

class swappingNumbers {

    public static void main (String[] args) {
        int x;
        int y;
        int z;
        System.out.println("Insert two numbers");
        Scanner number = new Scanner(System.in);
        x = number.nextInt();
        y = number.nextInt();
        System.out.println("Original: "+ x + y);
        z = x;
        x = y;
        y = z;
        System.out.println("Reversed: "+ x + y);
    }
}