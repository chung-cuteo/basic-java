package UdemyCourse.OOPAdvance.Inheriance;

public class Sharp {
    private int x, y;
    private String color;

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Move it");
    }

    public void draw(){
        System.out.println("draw");
    }
}
