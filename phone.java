import java.util.*;
class phone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your task: ");
        String a = sc.nextLine();
        chotti b = new chotti();
        b.call(a);
    }
}
class chotti{
    void call(String a){
        if(a.isBlank()){
            System.out.println(" Empty task");
        return;
    }
    else{
        System.out.println("ented task: "+a);
        System.out.println("tnx for entring your task");
    }
    }
}
