package fr.florianclaisse.ubomb.Views.Images;

import fr.florianclaisse.ubomb.Models.Direction;
import javafx.scene.image.Image;

import java.net.URL;

public final class ImageFactory {

    public static final ImageFactory shared = new ImageFactory();

    private final String filesURL;

    private ImageFactory() {
        URL filesURL = ImageFactory.class.getResource("/images/");
        if (filesURL != null) { this.filesURL = filesURL.toExternalForm(); }
        else { throw new NullPointerException("Impossible de trouver la ressource /images/"); }
    }

    public Image load(ImageResource resource) {
        return new Image(filesURL + resource.getFileName());
    }

    public Image loadPlayer(Direction direction) throws IllegalArgumentException {
        ImageResource resource = ImageResource.getPlayer(direction);
        return new Image(filesURL + resource.getFileName());
    }

    public Image loadMonster(Direction direction) throws IllegalArgumentException {
        ImageResource resource = ImageResource.getMonster(direction);
        return new Image(filesURL + resource.getFileName());
    }

    public Image loadBomb(int i) throws IllegalArgumentException {
        ImageResource resource = ImageResource.getBomb(i);
        return new Image(filesURL + resource.getFileName());
    }

    public Image loadDigit(int i) throws IllegalArgumentException {
        ImageResource resource = ImageResource.getDigit(i);
        return new Image(filesURL + resource.getFileName());
    }
}
