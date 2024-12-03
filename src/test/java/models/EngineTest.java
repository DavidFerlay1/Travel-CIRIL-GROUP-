package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EngineTest {
    @Test
    public void testProcess() {
        Adventurer adv = new Adventurer(new Vector2(3, 0));

        // Déplacement libre
        Engine engine = new Engine(new Map(MapTest.mapSrc), adv);
        engine.process("S");
        assertEquals(new Vector2(3, 1), adv.getPosition(), "Le retour devrait être [X: 3, Y: 1]");

        // Départ hors map (collision vers l'extérieur)
        adv.setPosition(new Vector2(-100, -100));
        engine.process("SSSSEEEEEENN");
        assertEquals(new Vector2(-100, -100), adv.getPosition(), "Le retour devrait être [X: -100, Y: -100]");

        // Collision arbre
        adv.setPosition(new Vector2(3, 0));
        engine.process("O");
        assertEquals(new Vector2(3, 0), adv.getPosition(), "Le retour devrait être [X: 3, Y: 0]");


    }
}
