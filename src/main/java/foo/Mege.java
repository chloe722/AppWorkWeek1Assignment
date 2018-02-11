package foo;

/**
 * Created by Chloe on 2/11/2018.
 */

public class Mege extends Human {

    private int weapon;

    Mege(String name){
        this(name, Weapon.STAFF);
    }

    Mege(String name, int weapon){
        super(name);
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        if (weapon == Weapon.FIRE_STAFF){
            System.out.println("Fire ball! Make it burn!");
        }else if(weapon == Weapon.ICE_STAFF){
            System.out.println("Frostbolt!!");
        }else if (weapon == Weapon.STAFF){
            System.out.println(("Arcane Missiles!!!"));
        }else{
            System.out.println("Where is my staff?! I dont know how to use this weapon.");
        }


    }
}
