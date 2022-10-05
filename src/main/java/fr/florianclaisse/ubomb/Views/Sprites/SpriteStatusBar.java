package fr.florianclaisse.ubomb.Views.Sprites;

import fr.florianclaisse.ubomb.Views.Images.ImageFactory;
import fr.florianclaisse.ubomb.Views.Images.ImageResource;
import javafx.scene.Group;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import static fr.florianclaisse.ubomb.Views.Images.ImageResource.*;

public class SpriteStatusBar {

    public static final int height = 55;

    private final DropShadow dropShadow = new DropShadow();
    private final HBox hBox = new HBox();

    private final Text lives = new Text();
    private final Text availableBombs = new Text();
    private final Text bombRange = new Text();
    private final Text keys = new Text();
    private final HBox level = new HBox();
    private final int gameLevel = 1;

    public SpriteStatusBar(Group root, int sceneWidth, int sceneHeight) {
        // Set Level Text
        this.level.getStyleClass().add("level");
        this.level.getChildren().add(new ImageView(ImageFactory.shared.loadDigit(1)));

        this.dropShadow.setRadius(5.0);
        this.dropShadow.setOffsetX(3.0);
        this.dropShadow.setOffsetY(3.0);
        this.dropShadow.setColor(Color.color(0.5f, 0.5f, 0.5f));

        HBox live = this.statusGroup(ImageFactory.shared.load(HEART), this.lives);
        HBox bombs = this.statusGroup(ImageFactory.shared.load(BANNER_BOMB), this.availableBombs);
        HBox range = this.statusGroup(ImageFactory.shared.load(BANNER_RANGE), this.bombRange);
        HBox key = this.statusGroup(ImageFactory.shared.load(KEY), this.keys);

        HBox allStatus = new HBox();
        allStatus.getStyleClass().add("status");
        allStatus.setSpacing(40.0);
        allStatus.getChildren().addAll(live, bombs, range, key);

        this.hBox.getStyleClass().add("statusBar");
        this.hBox.getChildren().addAll(this.level, allStatus);
        this.hBox.relocate(0, sceneHeight);
        this.hBox.setPrefSize(sceneWidth, height);

        root.getChildren().add(this.hBox);
    }

    // TODO: implement
    public void update() {

    }

    private HBox statusGroup(Image image, Text text) {
        text.getStyleClass().add("number");
        text.setFill(Color.BLACK);
        text.setEffect(this.dropShadow);
        text.setCache(true);

        ImageView imageView = new ImageView(image);

        HBox group = new HBox();
        group.setSpacing(4);
        group.getChildren().addAll(imageView, text);

        return group;
    }

    private void updateLevel(int n) {
    }
}
