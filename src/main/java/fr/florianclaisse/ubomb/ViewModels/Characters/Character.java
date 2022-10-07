package fr.florianclaisse.ubomb.ViewModels.Characters;

import fr.florianclaisse.ubomb.Models.Direction;
import fr.florianclaisse.ubomb.Models.Position;
import fr.florianclaisse.ubomb.ViewModels.GameEntity;
import fr.florianclaisse.ubomb.ViewModels.Movable;

public abstract class Character implements GameEntity, Movable {

    private boolean moveRequested = false;
    private boolean deleted = false;
    private boolean modified = false;

    private Position position;
    private Direction direction;

    public Character(Position position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public Character(Position position) {
        this(position, Direction.DOWN);
    }

    public void requestMove(Direction direction) {
        if (direction != this.direction) {
            this.direction = direction;
            this.modified = true;
        }
        this.moveRequested = true;
    }

    public void update(long now) {
        if (this.moveRequested && canMove(this.direction)) {
            this.doMove(this.direction);
        }
        this.moveRequested = false;
    }

    public void remove() { this.deleted = true; }

    public boolean isModified() { return this.modified; }
    public boolean isDeleted() { return this.deleted; }

    public Position getPosition() { return this.position; }
    public Direction getDirection() { return this.direction; }

    public void setModified(boolean modified) { this.modified = modified; }
    public void setPosition(Position position) {
        this.position = position;
        this.modified = true;
    }

    @Override
    public boolean canMove(Direction direction) { return true; }

    @Override
    public void doMove(Direction direction) {
        this.position = this.position.nextPosition(direction);
    }
}
