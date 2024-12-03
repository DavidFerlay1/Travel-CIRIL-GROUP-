import models.Adventurer;
import models.Engine;
import models.Map;
import models.Vector2;

public class Main {
    public static void main(String[] args) {

        // Initialisation du processus avec un aventurier avec une position de départ x:3, y:0
        Adventurer adventurer = new Adventurer(new Vector2(3, 0));
        Engine engine = new Engine(new Map("src/main/resources/carte.txt"), adventurer);
        engine.process("SSSSEEEEEENN");

        // Recommencer le processus avec une position de départ x: 6, y: 7
        adventurer.setPosition(new Vector2(6, 7));
        engine.process("OONOOOSSO");
    }
}