package UdemyCourse.OOPAdvance.SuperKey;

public class Sharp {
    private int x, y;
    private String color;

    public Sharp(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void draw() {
        System.out.printf("draw %d, %d , %s",  x , y, color);
    }
}
