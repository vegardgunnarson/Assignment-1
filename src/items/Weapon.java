package items;

import enumerators.Slot;
import enumerators.WeaponType;

public class Weapon extends Item{
    WeaponType type;
    int dps;
    double attackSpeed;
    int damage;
    Slot slot;


    public Weapon(String name, int reqLevel, WeaponType type) {
        super(name, reqLevel);
        this.slot = Slot.WEAPON;
        this.type = type;
        attackSpeed = 1;
        damage = 5;

    }
    public WeaponType getType() {
        return type;
    }
    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }
    public int getDps(){
        return (int)(this.damage*this.attackSpeed);
    }

}
