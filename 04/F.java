import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
         for(int i=1;i<=num;i++){
            System.out.println(i);
        }
         if(num >10){
            System.out.println("value should be equal or lesser than 10");
        }
        else{
            System.out.println("invalid number");
        }
    }
}
