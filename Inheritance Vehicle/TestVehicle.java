import java.util.*;
class TestVehicle{
public static void main(String []args){

    Scanner scan =new Scanner(System.in);
    System.out.println("Select one of the two 2-bike,4-car");
    int ch=scan.nextInt();
    
    switch(ch)
    {
    case 2:
    Bike b=new Bike();
    b.Display();
    break;

    case 4:
    Car b1=new Car();
    b1.Display();
    break;

    }

}
}
