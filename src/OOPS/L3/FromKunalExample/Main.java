package OOPS.L3.FromKunalExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Function");
        // Box box1 = new Box(4.5, 4.5, 4.5) ; 
        // System.out.println(box1.h + " " + box1.w + " " + box1.l);


        Box box2 = new Box();
        System.out.println(box2.h + " , " + box2.w + " , " + box2.l);

        BoxPrice box3 = new BoxPrice(1, 1, 1, 4, 5) ; 
        System.out.println(box3.cost);
    }
}
