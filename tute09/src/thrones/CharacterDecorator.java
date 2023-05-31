package thrones;

import java.util.List;

public class CharacterDecorator implements CharacterBehaviour {

    private CharacterBehaviour character;

    public CharacterDecorator(CharacterBehaviour character) {
        this.character = character;
    }

    @Override
    public int getHealthPoints() {
        return this.character.getHealthPoints();
    }

    @Override
    public void damage(int points) {
        this.character.damage(points);
    }

    @Override
    public void attack(Character victim) {
        this.character.attack(victim);
    }

    @Override
    public boolean canMove(int dx, int dy) {
        return this.character.canMove(dx, dy);
    }

    @Override
    public MoveResult makeMove(int x, int y, List<Character> characters) {
        return this.character.makeMove(x, y, characters);
    }


}
