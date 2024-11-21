package OOPS.L5.Nested_Interfaces;

class First {
    public interface InnerFirst {
    
        boolean isInt(int a ) ; 
    }
}


class Seconds implements First.InnerFirst {

    @Override
    public boolean isInt(int a) {
        return (a > 0) ; 
    }
   
    
}

public class  Main {
    public static void main(String[] args) {
        Seconds obj = new Seconds() ; 
        System.out.println(obj.isInt(8));
    }

    
}