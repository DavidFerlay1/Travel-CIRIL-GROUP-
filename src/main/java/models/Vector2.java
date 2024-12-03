package models;

public class Vector2 {
    public final int x;
    public final int y;

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || this.getClass() != obj.getClass())
            return false;

        Vector2 v = (Vector2) obj;
        return v.x == this.x && v.y == this.y;
    }
}
