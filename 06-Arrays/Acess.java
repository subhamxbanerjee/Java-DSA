public class Acess{
    public static void main(String args[]) {
        int arr []=new int [5];
        int brr[]={10,20,30,40,50};
        
        /* System.out.println("value at 0 index " + brr[0]);
        System.out.println("value at 1 index " + brr[1]);
        System.out.println("value at 2 index " + brr[2]); */
        int n=brr.length;
        System.out.println("the values of the indices are as");
        for (int i=0;i<=n-1;i++){
            System.out.println(i + "->" + brr[i]);
        }
    }
}