package JavaBasics ; 
import java.util.Scanner ; 

public class TemperatureConversion {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("please enter temperature in c");
            
            float tempC = in.nextFloat() ; 
            float tempF = ( tempC * 9/5) + 32 ; 
            System.out.println(tempF);
        }

    }
}
