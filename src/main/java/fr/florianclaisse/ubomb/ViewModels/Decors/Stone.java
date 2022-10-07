package fr.florianclaisse.ubomb.ViewModels.Decors;

import fr.florianclaisse.ubomb.Models.Position;

public class Stone extends Decor {

    public Stone(Position position) {
        super(position);
    }

    @Override
    public boolean isWalkable() { return false; }
}
