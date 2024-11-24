package OOPS.L6.Generics_With_Interfaces;

public class Main {
    // Define a generic interface
    interface DataStorage<T> {
        void addData(T data);

        T getData();
    }

    // Implementing the generic interface
    static class StringStorage implements DataStorage<String> {
        private String data;

        @Override
        public void addData(String data) {
            this.data = data;
        }

        @Override
        public String getData() {
            return data;
        }
    }

    // Another implementation for Integer type
    static class IntegerStorage implements DataStorage<Integer> {
        private Integer data;

        @Override
        public void addData(Integer data) {
            this.data = data;
        }

        @Override
        public Integer getData() {
            return data;
        }
    }

    // Main class to test the generic interface

    public static void main(String[] args) {
        // Using the String implementation

        DataStorage<String> stringStorage = new StringStorage();
        stringStorage.addData("Hello, Generics!");
        System.out.println("String Data: " + stringStorage.getData());

        // Using the Integer implementation
        DataStorage<Integer> integerStorage = new IntegerStorage();
        integerStorage.addData(123);
        System.out.println("Integer Data: " + integerStorage.getData());
    }

}
