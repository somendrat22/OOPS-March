import javax.print.Doc;

public class OnlineDoctor implements Doctor {

    public void curePatient(){
        System.out.println("Hey I am Online Curing Patient");
    }

    @Override
    public void getPatientList() {

    }

    @Override
    public void giveMedicines() {

    }
}
