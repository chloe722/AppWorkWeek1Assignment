package foo;

/**
 * Created by Chloe on 2/11/2018.
 */

public class Human {

    private String name;
    public final static int FIRE_BOW = 0x01;
    public final static int ICE_BOW = 0x02;

    public Human(){

    }

    public void attack(){
        System.out.println("Fist Attack!");
    }
}
