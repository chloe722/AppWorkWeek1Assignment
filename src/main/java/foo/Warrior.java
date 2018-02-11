package foo;

/**
 * Created by Chloe on 2/11/2018.
 */

public class Warrior extends Human {

    private int weapon;

    Warrior(String name){
        this(name, Weapon.BLADE);
    }

    Warrior(String name, int weapon){
        super(name);
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        if(weapon == Weapon.FIRE_BLADE){
            System.out.println("Fire Slash attack!");
        }else if (weapon == Weapon.ICE_BLADE){
            System.out.println("Ice Slash attack!");
        }else if (weapon == Weapon.BLADE){
            System.out.println("Slash attack!");
        }else {
            System.out.println("Whose weapon is this? I dont know how to use it!!");
        }
    }
}
