import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    public DnDCharacter() {
        strength = ability(rollDice());
        dexterity = ability(rollDice());
        constitution = ability(rollDice());
        intelligence = ability(rollDice());
        wisdom = ability(rollDice());
        charisma = ability(rollDice());
        hitpoints = 10 + modifier(constitution);
    }

    int ability(List<Integer> scores) {
        int result = 0;
        for (int i : scores){
            result +=i;
        }
        int min = Collections.min(scores);
        return result - min ;
    }

    List<Integer> rollDice() {
        List<Integer> results = new ArrayList<>() ;
        for (int i = 0 ; i <4; i++){
            results.add((int)(Math.random()*6+1));
        }
        return results;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10)/ 2.0) ;
    }

    int getStrength() {
        return strength;
    }
    int getDexterity() {
        return dexterity;
    }
    int getConstitution() {
        return constitution;
    }
    int getIntelligence() {
        return intelligence;
    }
    int getWisdom() {
        return wisdom;
    }
    int getCharisma() {
        return charisma;
    }
    int getHitpoints() {
        return hitpoints;
    }
}
