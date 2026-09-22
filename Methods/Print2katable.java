import java.util.Scanner;

public class Print2katable {
    static int n=0;

    static void Print2katable() 
            {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a new number:");
              n = sc.nextInt();
                for(int i=1;i<=10;i++){
                    int ans =n*i;
                    System.out.println("->" + ans);
                }
                sc.close();
            }
    static void Franklou(){
        if(n >= 2){
            System.out.println("hahhhhhhhhhh");
        }else{
            System.out.println("noooooooooooooooooooooooo");
        }
    }
     public static void main(String[] args){
        System.out.println("hi");
        System.out.println("---------------------------------------------");
        Print2katable();
        Franklou();
        System.out.println("bye");
    }
} 