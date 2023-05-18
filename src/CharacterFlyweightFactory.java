import java.util.HashMap;
import java.util.Map;

public class CharacterFlyweightFactory {
    private Map<Character, CharacterFlyweight> flyweights;

    public CharacterFlyweightFactory() {
        flyweights = new HashMap<>();
    }

    public CharacterFlyweight getCharacterFlyweight(char character) {
        if (flyweights.containsKey(character)) {
            return flyweights.get(character);
        } else {
            CharacterFlyweight flyweight = new CharacterFlyweight(character);
            flyweights.put(character, flyweight);
            return flyweight;
        }
    }
}
