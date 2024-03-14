import java.util.ArrayList;

public class Main {
    static {
        System.out.println("Hey");
    }

    {
        System.out.println("Hey Instance");
    }

    Doctor doc = new Doctor() {
        @Override
        public void getPatientList() {

        }

        @Override
        public void giveMedicines() {

        }
    }


    public Doctor getDoctor(String pId){
        return patiient.getDoctor(); // new OfflineDoctor(), new Online
    }

    // It is able to test only mercedes car
    public static void carTesting(Car car){
        // You will be able to test mercedes as well as swift
        // abstract classes we use when we are not interested in implementation we are just interested in functionality
        // you can't create object of abstract classes
        car.useSteringWheel();
    }

    public void accessUser(User user){
        String email = user.getEmail();
    }
    public static void main(String[] args) {
       // Main m = new Main();
       // See with the eyes of reference
       // For methods it will be always bottom to up
       // Refernce will check it owns variable
        OfflineDoctor doc = getDoctor(); // offlineDoctor , OnlineDpoctor
        doc.giveMedicines();
        carTesting(new Mercedes());
        carTesting(new Swift());
        User user = new User("Somendra", "tiwarisomendra22@gmail.com", "123456");

    }

    // compile time polymorphism, method overlaoding
    public void fun(){
        Bank bank = new Bank();
        bank.createAccount("some");
        bank.createAccount("djfoemf", "dbeidnein");
    }

    public void fun(int a, int b){
        Mercedes m = new Mercedes();
        m.accelerate();
    }

    public void fun(int a, int b, int c){
        System.out.println("Hey");
        System.out.println("Hey");
    }
}