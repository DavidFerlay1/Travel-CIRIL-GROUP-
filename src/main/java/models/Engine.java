package models;

public class Engine {

    private final Map map;
    private final Adventurer adventurer;

    /**
     *
     * @param map La map référence
     * @param adventurer l'aventurier à déplacer
     */
    public Engine(Map map, Adventurer adventurer) {
        this.map = map;
        this.adventurer = adventurer;
    }

    /**
     * @param path String correspondant au chemin emprunté
     * Les caractères invalides seront ignorés dans le trajet
     */
    public void process(String path) {

        System.out.printf("POSITION DE DEPART: [X: %d, Y: %d]\n", this.adventurer.getPosition().x, this.adventurer.getPosition().y);

        for(char node : path.toCharArray()) {
            try {
                Vector2 position = this.adventurer.simulateMovement(node);
                if(map.collides(position)) {
                    System.out.printf("Impossible de se déplacer à l'emplacement [X: %d, Y: %d]\n", position.x, position.y);
                }
                else {
                    adventurer.setPosition(position);
                    System.out.printf("Nouvelle position: [X, %d, Y: %d]\n", position.x, position.y);
                }
            } catch (IllegalArgumentException exception) {
                System.out.printf("%s n'est pas une direction valide\n", node);
            }
        }

        System.out.printf("\n\nLa position finale de l'utilisateur est [X: %d, Y: %d]", adventurer.getPosition().x, adventurer.getPosition().y);
        System.out.println("\n-----------------------------------------------");
    }

}
