package foo;

/**
 * Created by Chloe on 2/11/2018.
 */

public class Hunter extends Human {

    private int weapon;

    Hunter(String name){
        this(name, Weapon.BOW);
    }

    Hunter(String name, int weapon){
        super(name);
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        if (weapon == Weapon.FIRE_BOW){
            System.out.println("Firing fire arrow!");
        }else if(weapon == Weapon.ICE_BOW){
            System.out.println("Firing ice arrow!");
        }else if (weapon == Weapon.BOW){
            System.out.println(("Firing arrow!"));
        }else{
            System.out.println("Oppos! I dont know how to use this weapon.");
        }


    }
}
