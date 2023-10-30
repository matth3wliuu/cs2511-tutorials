package thrones;

public class DragonFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        System.out.println("A new dragon has been created");
        return new Dragon(super.getInitPosition(), super.getInitPosition());
    }
}
package thrones;

public class DragonFactory extends CharacterFactory {

    @Override
    public Character createCharacter() {
        return new Dragon(super.randomInt(), super.randomInt());
    }
}
