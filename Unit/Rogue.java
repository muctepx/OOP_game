package OOP.Other.Unit;


public class Rogue extends Warrior {
    int disguise;

    public Rogue(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int disguise, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.disguise = disguise;
    }

    public Rogue(String name, Vector2D coords) {
        super(name, 70.f, 70, 10, 2, 6, 7,
                6, coords.posX, coords.posY);
        this.disguise = 50;
    }

    public void steal(int disguise, Shooter Shooter) {
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Бандит: \t").append(Rogue.super.name)
                .append("\t| ATK:\t").append(Rogue.super.attack)
                .append("\t| HP:\t").append(Rogue.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Rogue.super.coords.posX).append(".").append(Rogue.super.coords.posY);
    }
}
