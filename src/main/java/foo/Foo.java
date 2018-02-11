package foo;

/**
 * Created by Chloe on 2/11/2018.
 */

public class Foo {
    public static void main(String[] arg){
       Human h = new Human("David");
       h.attack();

       Hunter hunter = new Hunter("Robin", Weapon.FIRE_BOW);
       hunter.attack();

       Warrior warrior = new Warrior("Austin", Weapon.ICE_BLADE);
       warrior.attack();

       Mege mege = new Mege("Melisa", Weapon.STAFF);
       mege.attack();


    }
}