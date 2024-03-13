import java.util.ArrayList;
import java.util.List;

public class Bank {
    String bankName;
    List<String> accountHolders;
    int totalBalance; // During the object creation at that time memory will get allocated

    static int a; // When program will run at that time memory allocation will happen

    static {
        System.out.println("Hey");
    }

    public Bank() {
        this(5, 4);
    }

    public Bank(int a, int b){
        this(5, 6, 7);

    }

    public Bank(int a, int b, int c){

    }


    public Bank(String bankName, List<String> accountHolders, int totalBalance){
        // Parametrized Constructor

        System.out.println("Parametrized constructor");
    }

    public void takeDeposit(int amount){
        // add amount in db
    }

    public void giveLoan(int amount){
        // check db are we havin money
    }



    public void createAccount(String userDetails){

    }

    public void createAccount(String userDetails, String kycDetails){

    }


}
