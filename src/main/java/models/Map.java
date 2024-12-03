package models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Map {
    private final List<String> tiles = new ArrayList<>();

    public Map(String filePath) {
        this.loadTiles(filePath);
    }

    // Chargement du tileset depuis un chemin vers un fichier texte

    /**
     * @param filePath chemin du fichier contenant la ma
     */
    private void loadTiles(String filePath) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            this.tiles.addAll(lines);
            System.out.println("Carte chargée");
        } catch (IOException exception) {
            System.out.println("Fichier de carte introuvable");
        }
    }

    /**
     *
     * @param position la position à vérifier
     * @return true si collision ou hors map, false sinon
     */
    public boolean collides(Vector2 position) {
        try {
            return this.tiles.get(position.y).charAt(position.x) == '#';
        } catch (IndexOutOfBoundsException exception) {
            return true;
        }
    }

    /**
     *
     * @return true si la map contient des tiles, false sinon
     */
    public boolean isTilesetReady() {
        return !this.tiles.isEmpty();
    }
}
