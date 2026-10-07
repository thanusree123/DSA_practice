interface Camera{
    void takephoto();
}
interface Musicplayer{
    void playmusic();
}
interface Gps{
    void getcoordinates();
}
class smartphone implements Camera,Musicplayer,Gps{
    @Override
    public void takephoto(){
        System.out.println("Taking a 4K high-resolution photo...");

    }
    @Override
    public void playmusic(){
        System.out.println("Playing your favorite playlist...");

    }
    @Override
    public void getcoordinates(){
        System.out.println("GPS Location: 17.3850° N, 78.4867° E");

    }

}
public class multipleinheritance {
    public static void main(String args[]){
    smartphone sp=new smartphone();
    sp.takephoto();
    sp.playmusic();
    sp.getcoordinates();

    }
}
