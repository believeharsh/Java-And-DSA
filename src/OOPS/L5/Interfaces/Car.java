package OOPS.L5.Interfaces;

public class Car implements Engine, Brake{
    @Override
        public
        void brake() {
            System.out.println("Car is breaking");
        }
        @Override
        public
        void start() {
            System.out.println("Car is Starting");
        }

        @Override
        public
        void stop() {
            System.out.println("Car is Stopping");
        }

        @Override
        public
        void acc() {
            System.out.println("Car is accelarating");
        }

        

}
