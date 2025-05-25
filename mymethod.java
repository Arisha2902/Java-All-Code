import java.util.Scanner;
public class mymethod {

    public static void even(int nums){
        if (nums % 2 == 0) {
            System.out.println("The number " + nums + " is even.");
        } else {
            System.out.println("The number " + nums + " is odd.");
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        even(num);
        scan.close();
    } 
}
