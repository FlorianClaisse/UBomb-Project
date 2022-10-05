package fr.florianclaisse.ubomb.Utils;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.BitSet;

import static javafx.scene.input.KeyCode.*;

public final class KeyboardInput {

    private final BitSet keyboardBitSet = new BitSet();

    private final Scene scene;

    public KeyboardInput(Scene scene) {
        this.scene = scene;
        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> keyboardBitSet.set(event.getCode().ordinal(), true));
        scene.addEventFilter(KeyEvent.KEY_RELEASED, event -> keyboardBitSet.set(event.getCode().ordinal(), false));
    }

    public void clear() { this.keyboardBitSet.clear(); }
    public boolean is(KeyCode keyCode) { return this.keyboardBitSet.get(keyCode.ordinal()); }

    public boolean isMoveUp() { return this.is(UP) && !this.is(DOWN); }
    public boolean isMoveDown() { return this.is(DOWN) && !this.is(UP); }
    public boolean isMoveRight() { return this.is(RIGHT) && !this.is(LEFT); }
    public boolean isMoveLeft() { return this.is(LEFT) && !this.is(RIGHT); }

    public boolean isBomb() { return this.is(SPACE); }
    public boolean isKey() { return this.is(ENTER); }

    public boolean isExit() { return this.is(ESCAPE); }
}
