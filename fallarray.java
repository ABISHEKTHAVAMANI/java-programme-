import java.util.ArrayList;
class fallarray {
    public static void main (String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        arr.add(6);
        arr.add(99);
        arr.add(42);
        arr.add(17);
        System.out.println(arr); 
        arr.remove(1);
        System.out.println(arr);
        arr.add(1, 88);
        System.out.println(arr);
        arr.set(2, 55);
        System.out.println(arr);


        
         
        }
    }
    

