package OOPS.L1;

public class Myfile {
    public static void main(String[] args) {
        // Student[] students = new Student[5];
        // Student Harsh = new Student(11, "Harsh Dahiya", 90.4f);
        // Student Rahul = new Student(18, "Rahul Gehlot", 90.3f);

        // System.out.println(Harsh.rno);
        // System.out.println(Harsh.name);
        // System.out.println(Harsh.marks);

        // Student random = new Student(Harsh);
        // System.out.println(random.name);

        // Student random2 = new Student();
        // System.out.println(random2.name);

        Student first = new Student() ; 
        Student second = first ; 
        first.name = "WTF" ; 
        System.out.println(second.name) ; // Here first and second are both pointing to the same object so since we've changed the first name second will give the same result as first because both are pointing to the same objects. 


        // Here I've used this one to understand  the final keyword with primitive and objects. so when final is added with any primitive then we can't change it's value but if any object has final then we can change the value of object but can't reassign to that object. 
        final A one = new A("Harsh Dahiya") ;
        one.name = "Vaibhav Paraserf" ; 
        // one = new A("Hello") ; 
        
      
    }
    
}

class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }


    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

class A {
    final int num = 10 ; 
    String name ; 

    public A(String name){
        this.name = name ;
    }
}