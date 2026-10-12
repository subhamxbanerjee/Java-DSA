
public class TwoDArray {
    public static void main(String[] args) {
        int arr [][]={ {1,2,3}, {1,2,3}};
      /*   int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++){
                int value=arr[i][j];
                sum=sum+value;
            }
        }
        System.out.println(sum); */


        //multiply 2d array

          /* int mul =1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++){
                int value=arr[i][j];
                mul=mul*value;
            }
        }
        System.out.println(mul); */
        //max value
        int maxvalue=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] >maxvalue){
                    maxvalue =arr[i][j];
                }
            }
        }
        System.out.println(maxvalue);
    }
}

        