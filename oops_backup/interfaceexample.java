interface Vehicle{
    int max_speed=120;
    void startengine();
    void stopengine();
}
class Car implements Vehicle{
    @Override
    public void startengine(){
        System.out.println("car engine started ");
    }
    @Override
    public void stopengine(){
        System.out.println("car is stopped ");

    }
}
public class interfaceexample {
    public static void main(String args[]){
        Car mycar=new Car();
        mycar.startengine();
        mycar.stopengine();
    }

    
}
