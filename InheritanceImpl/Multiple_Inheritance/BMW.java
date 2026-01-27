package InheritanceImpl.Multiple_Inheritance;

public class BMW implements Car,Vehicle{


    @Override
    public void wheels() {
        System.out.println("BMW has 4 wheels");
    }

    @Override
    public void travel() {
        System.out.println("BMW travels in very high speed");
    }

    public static void main(String [] args){

        BMW bmw = new BMW();
        bmw.wheels();
        bmw.travel();
    }
}
