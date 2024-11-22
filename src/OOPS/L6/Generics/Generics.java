package OOPS.L6.Generics;
// What is the Generics ?
// 
public class Generics {

    public static class Box<T> { // `T` is the type placeholder
        private T item;
    
        public void setItem(T item) {
            this.item = item;
        }
    
        public T getItem() {
            return item;
        }
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");
        System.out.println(stringBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println(intBox.getItem());
    }
           
}
