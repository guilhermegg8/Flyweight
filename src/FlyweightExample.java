public class FlyweightExample {
    public static void main(String[] args) {
        CharacterFlyweightFactory factory = new CharacterFlyweightFactory();

        CharacterFlyweight characterA = factory.getCharacterFlyweight('A');
        characterA.printCharacter();

        CharacterFlyweight characterB = factory.getCharacterFlyweight('B');
        characterB.printCharacter();

        CharacterFlyweight characterA2 = factory.getCharacterFlyweight('A');
        characterA2.printCharacter();

        CharacterFlyweight characterA3 = factory.getCharacterFlyweight('A');
        characterA3.printCharacter();


        // As duas instâncias de 'A' são o mesmo objeto Flyweight compartilhado
        System.out.println("characterA == characterA2: " + (characterA == characterA2));
    }
}
