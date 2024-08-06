package conditional;
import java.util.Scanner;
public class profit_loss {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price : ");
        int cp = sc.nextInt();
        System.out.println("Enter a selling price: ");
        int sp = sc.nextInt();

        if(sp>cp){
            System.out.print("Your are in a profit and Your profit is: ");
            System.out.println(sp-cp);
        }
        else{
            System.out.print("You are facing a  loss , Your loss is: ");
            System.out.println(cp-sp);
        }

    }
}
