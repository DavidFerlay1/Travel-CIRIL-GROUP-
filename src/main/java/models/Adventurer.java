package models;

public class Adventurer {
    private Vector2 position;

    public Adventurer(Vector2 firstPosition) {
        this.position = firstPosition;
    }

    public Vector2 getPosition() {
        return this.position;
    }

    // Génère une position en fonction de la direction qu'on veut prendre
    public Vector2 simulateMovement(char direction) {
        switch(Character.toUpperCase(direction)) {
            case 'S':
                return new Vector2(this.position.x, this.position.y + 1);
            case 'N':
                return new Vector2(this.position.x, this.position.y - 1);
            case 'E':
                return new Vector2(this.position.x + 1, this.position.y);
            case 'O':
                return new Vector2(this.position.x - 1, this.position.y);
            default: return null;
        }
    }

    // Applique la nouvelle position
    public void setPosition(Vector2 position) {
        this.position = position;
    }
}
