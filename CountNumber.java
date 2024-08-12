import com.sun.source.tree.ReturnTree;

public class CountNumber {
    static int count = 0 ;
    CountNumber (){
        count++;
    }
    static void displayCount(){
        System.out.println("all number counted " + count );
    }
    public static void main(String[] args) {
        CountNumber obj1 = new CountNumber();
        CountNumber obj2 = new CountNumber();
        CountNumber obj3 = new CountNumber();
        CountNumber obj4 = new CountNumber();
        CountNumber obj5 = new CountNumber();
        CountNumber.displayCount();
    }
}
