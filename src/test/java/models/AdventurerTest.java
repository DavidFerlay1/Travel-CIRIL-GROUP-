package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AdventurerTest {
    @Test
    public void testMovementSimulation() {
        Adventurer adventurer = new Adventurer(new Vector2(0, 0));
        assertEquals(new Vector2(0, -1), adventurer.simulateMovement('N'), "La simulation de mouvement au nord a échoué");
        assertEquals(new Vector2(0, 1), adventurer.simulateMovement('S'), "La simulation de mouvement au sud a échoué");
        assertEquals(new Vector2(1, 0), adventurer.simulateMovement('E'), "La simulation de mouvement à l'est a échoué");
        assertEquals(new Vector2(-1, 0), adventurer.simulateMovement('O'), "La simulation de mouvement à l'ouest a échoué");
        assertNull(adventurer.simulateMovement('X'), "Le retour devrait être Null car la direction est invalide");
    }
}
