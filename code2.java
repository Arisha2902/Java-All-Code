import java.util.Scanner;

public class code2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max =Math.max( Math.max(a,b),c);
        System.out.println("maximum number is " + max);

        int sum = 0;
        int n = a;
        for( int i = 0;  i < n;i++){
           sum = sum + i;

        }
        System.out.println("sum is" + sum);

        if ( a > b){
            if (a > c){
                System.out.println(a);
            }
            else{
                System.out.println(c);
            }
        }
        else{
            if ( b > c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }

    }
    
}
