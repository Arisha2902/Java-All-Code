import java.util.Scanner;


public class switch1 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter operator");
        char op = sc.next().trim().charAt(0);

        System.out.println("enter a ");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();

        switch(op){
            case '+' :
                System.out.println("+");
                
                break;
            case '-':
                System.out.println("-");
                break;

        }
 
        int day  = sc.nextInt();
        switch(day){
            case 0,2,4,6,8 ->   System.out.println("even");
            case 1,3,5,7,9 ->   System.out.println("odd");
        }
    }
    
}
