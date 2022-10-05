package fr.florianclaisse.ubomb.Utils;

public enum EntityCode {
    Empty('_'),
    Box('B'),
    Heart('H'),
    Key('K'),
    Monster('M'),
    DoorPrevOpened('V'),
    DoorNextOpened('N'),
    DoorNextClosed('n'),
    Stone('S'),
    Tree('T'),
    Princess('W'),
    BombRangeInc('>'),
    BombRangeDec('<'),
    BombNumberInc('+'),
    BombNumberDec('-');

    private final char code;

    EntityCode(char code) { this.code = code; }

    public static EntityCode fromCode(char c) throws IllegalArgumentException {
        return valueOf(String.valueOf(c));
    }

    public char getCode() { return this.code; }

    @Override
    public String toString() {
        return "EntityCode{" + "code=" + code + '}';
    }
}
