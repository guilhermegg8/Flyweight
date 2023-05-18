public class CharacterFlyweight {
    private char character;

    public CharacterFlyweight(char character) {
        this.character = character;
    }

    public void printCharacter() {
        System.out.println("Character: " + character);
    }
}
