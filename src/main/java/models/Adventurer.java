package models;

public class Adventurer {
    private Vector2 position;

    public Adventurer(Vector2 firstPosition) {
        this.position = firstPosition;
    }

    public Vector2 getPosition() {
        return this.position;
    }

    /**
     * @param direction Caractère symbole de la direction N,O,S,E
     * @throws IllegalArgumentException si le symbole est invalide
     * @return Vector2 La position si l'aventurier se déplaçait dans une direction
     */
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
            default: throw new IllegalArgumentException("Direction illégale " + direction);
        }
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }
}
