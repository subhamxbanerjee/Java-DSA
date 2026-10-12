import java.util.ArrayList;
public class Mein{
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.get(1));
        //other operations
        //1->size of list
        System.out.println(list.size());
        //2->update element
        list.set(1,25);
        //remove
        list.remove(0);
        System.out.println(list.size());
        //check element
        System.out.println(list.contains(30));
        //empty or not
        System.out.println(list.isEmpty());
        //loop
        for(int num:list){
            System.out.println(num);
        }
        System.out.println(list);
    }
}