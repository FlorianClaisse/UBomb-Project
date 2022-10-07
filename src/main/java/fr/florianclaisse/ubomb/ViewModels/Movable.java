package fr.florianclaisse.ubomb.ViewModels;

import fr.florianclaisse.ubomb.Models.Direction;

public interface Movable {
    boolean canMove(Direction direction);
    void doMove(Direction direction);
}
