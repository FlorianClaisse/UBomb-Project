package fr.florianclaisse.ubomb.ViewModels.Decors;

import fr.florianclaisse.ubomb.Models.Position;

public class Tree extends Decor {

    public Tree(Position position) {
        super(position);
    }

    @Override
    public boolean isWalkable() { return false; }
}
