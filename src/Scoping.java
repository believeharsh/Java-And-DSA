public class Scoping {
    public static void main(String[] args) {
        int a = 40 ; 
        int b = 59; 
        String name = "Rahul Yadav"; 
        {
            a = 50 ; 
            System.out.println(a);
            name = "Harsh Dahiya";

             // here we are not changing the string's value rahter we are channging the reference of the 'name' . earlier it was pointing out to "Rahul Yadav" Now it is pointing to "Harsh Dahiya"; 
             
            System.out.println(name);
            b = 49; 
            System.out.println(b);


        }
    }
}
