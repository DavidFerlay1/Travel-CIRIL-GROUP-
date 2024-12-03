package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdventurerTest {
    @Test
    public void testMovementSimulation() {
        Adventurer adventurer = new Adventurer(new Vector2(0, 0));
        assertEquals(new Vector2(0, -1), adventurer.simulateMovement('N'), "La simulation de mouvement au nord a échoué");
        assertEquals(new Vector2(0, 1), adventurer.simulateMovement('S'), "La simulation de mouvement au sud a échoué");
        assertEquals(new Vector2(1, 0), adventurer.simulateMovement('E'), "La simulation de mouvement à l'est a échoué");
        assertEquals(new Vector2(-1, 0), adventurer.simulateMovement('O'), "La simulation de mouvement à l'ouest a échoué");
        assertThrows(IllegalArgumentException.class, () -> adventurer.simulateMovement('X'), "La direction est invalide, doit lever une IllegalArgumentException");
    }
}
