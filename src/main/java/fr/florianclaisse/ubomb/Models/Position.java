package fr.florianclaisse.ubomb.Models;

import java.util.Objects;

public final class Position {

    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position position) {
        this(position.x, position.y);
    }

    public final Position nextPosition(Direction direction) {
        return this.nextPosition(direction, 1);
    }

    public final Position nextPosition(Direction direction, int delta) {
        return switch (direction) {
            case UP -> new Position(this.x, this.y - delta);
            case RIGHT -> new Position(this.x + delta, this.y);
            case DOWN -> new Position(this.x, this.y + delta);
            case LEFT -> new Position(this.x - delta, this.y);
        };
    }

    public int getX() { return this.x; }
    public int getY() { return this.y; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return this.x == position.x && this.y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }

    @Override
    public String toString() {
        return "Position{x=" + this.x + ", y=" + this.y + '}';
    }
}
