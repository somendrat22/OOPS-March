
// If any abstract method is present in class so we have to make that class also abstract
public abstract class Car {
    String name;
    String engine;
    int wheels = 4;


    public void accelerate(){

        System.out.println("accelerate car");
    }


    public void applyBreaks(){
        System.out.println("apply brakes Car");
    }

    // Abstrcat methods are those methods which does not have implementation
    public abstract void useSteringWheel();

    public void playRadio(){
        System.out.println("Playing radio");
    }

}
