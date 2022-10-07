package fr.florianclaisse.ubomb.ViewModels.Decors;

import fr.florianclaisse.ubomb.Models.Position;
import fr.florianclaisse.ubomb.ViewModels.GameEntity;

public abstract class Decor implements GameEntity {

    private final Position position;

    public Decor(Position position) {
        this.position = position;
    }

    public Position getPosition() { return this.position; }

    public abstract boolean isWalkable();
}
