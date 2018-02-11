package foo;

/**
 * Created by Chloe on 2/11/2018.
 */

public class Foo {
    public static void main(String[] arg){
       Human h = new Human();
       h.attack();

       Hunter hunter = new Hunter();
       hunter.attack();

       Warrior warrior = new Warrior();
       warrior.attack();
    }
}
