import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n =sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number to search:");
        int x =sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("elements found at index "+i);
                return;
            }
        }
        System.out.println("elements not found");
    }
    
}
