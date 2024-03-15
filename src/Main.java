import java.sql.SQLException;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) throws Exception{

        int num1 = 7;
        int num2 = 6;


        // throw : When we want to throw exception by ourself. So we use throw keyword

        // throws : When we have to declare that this particular method can throw exception.

        // For unchecked exception don't requires to use throws keyword.
        // If you are throwing checked exception at that time you need to explicity declare that this
        // method can throw exception
        // In the case when you throwing checked exception and you don't want to handle that
        // checked exception in that method then you need to use throws keyword in that method declaration
        // and whatever function is going to call that method it need to handle that exception

        try{
            hey();
        }catch (Exception e){

        }
         // If main method also don't want to handle excepetion by itself it is going to throw
        // to JVM

        fun1();

    }

    public static void fun1() {
        hey();
    }


    public static void hey() throws CredentialsNotExist{ //
        throw new CredentialsNotExist("Hey");
    } //
}