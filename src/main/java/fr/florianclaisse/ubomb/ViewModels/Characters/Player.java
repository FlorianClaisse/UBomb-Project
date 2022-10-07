package fr.florianclaisse.ubomb.ViewModels.Characters;

import fr.florianclaisse.ubomb.Models.Position;

public final class Player extends Character {

    private int lives;

    public Player(Position position, int lives) {
        super(position);
        this.lives = lives;
    }

    public void takeDoor(int gotoLevel) { }
    public void takeKey() { }

    public boolean isWinner() { return false; }

    public int getLives() { return this.lives; }
}
