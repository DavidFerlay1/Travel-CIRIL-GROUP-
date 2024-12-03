package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {

    public static final String mapSrc = "src/test/resources/carte.txt";

    @Test
    public void testLoadMapSuccess() {
        Map map = new Map(mapSrc);
        assertTrue(map.isTilesetReady(), "isTilesetReady devrait renvoyer true");
    }

    @Test
    public void testLoadMapFailed() {
        Map map = new Map("foobar");
        assertFalse(map.isTilesetReady(), "isTilesetReady devrait renvoyer false");
    }

    @Test
    public void testCollision() {
        Map map = new Map(mapSrc);
        assertTrue(map.collides(new Vector2(0, 0)), "La collision devrait renvoyer true");
        assertFalse(map.collides(new Vector2(3, 0)), "La collision devrait renvoyer false");
    }
}
