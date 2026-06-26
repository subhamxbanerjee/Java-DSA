import java.util.*;
class IFELSELOOP {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the number1");
    int n1 =sc.nextInt();
    System.out.println("enter the number2");
        int n2 =sc.nextInt();
        if(n1 ==n2)
        {
            System.out.println("both n1 and n2 are equal numbers");
        }
        else if(n1>n2){
            System.out.println("n1 is greater than n2");
        }
        else{
            System.out.println("n1 is lesser than n2");
        }
    }
}
