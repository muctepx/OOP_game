package OOP.Other.Unit;

import java.util.ArrayList;

public abstract class Mag extends Human {
    protected int mana;
    protected int maxMana;
    public Mag(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
               int speed, int mana, int maxMana, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (!state.equals("Die") || mana <= 0) return;
        Human victim = findVeryIll(team1);
        victim.getDamage(damageMin);
        mana -= 1;


        // int a = boolean ? first : second;
        // float damage = (victim.defense - attack)>0 ? damageMin : (victim.defense - attack)<0 ? damageMax : (damageMin+damageMax)/2;
        // victim.getDamage(damage);
        // for (Human human: team1) {
        //     if (human.getInfo().toString().split(":")[0].equals("Фермер") && human.state.equals("Stand")) {
        //         human.state = "Busy";
        //         return;
        //     }
        // }
        // cartridges--;
    }
/**Поиск наиболее поврежденного персонажа (отношение текущего НР к своиму MaxHP) */
    protected Human findVeryIll(ArrayList<Human> team){
        double minHp = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            Human pers = team.get(i);
            if(minHp > pers.hp/pers.maxHp) {
                index = i;
                minHp = pers.hp/pers.maxHp;
            }
        }
        return team.get(index);
    }
}