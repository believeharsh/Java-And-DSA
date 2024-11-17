package OOPS.L2.StaticExamples;

public class UseHuman {
    public static void main(String[] args) {
        Human Harsh = new Human(21, 20000, false, "HarshDahihya");
        Human Satyam = new Human(20, 50000, true, "SatyamGarg");
        // Human Priya = new Human(20, 50000, true, "PriyaGarg");
        // Human Nishi = new Human(20, 50000, true, "NishiGarg");

        System.out.println(Harsh.age);
        System.out.println(Satyam.age);
        System.out.println(Human.population);
        // this.Nishi = Nishi ; this cannot be used inside a static methods

        UseHuman Greet = new UseHuman(); // for non-static method, we have to create an instance first then we can use them inside static method.
        Greet.greetings();

    }

    public void greetings() {

        System.out.println("hey, How are you doing??");
    }


    // We can easily use static method inside non-static method; java allows user to do that. 
    public void fun() {
        System.out.println("Hii, I'm static function fun");
        check();

    }

    public static void check() {
        System.out.println("hii i'm static function called check");
    }

}
