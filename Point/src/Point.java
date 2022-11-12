public class Point {
    private int x;
    private int y;

    private String p1;

    Point(int x, int y){
       this.x = x;
       this.y = y;
    }

    public String toString(){
        String p1 = ("(" + this.x + "," + this.y + ")");
        return p1;
    }

    public boolean equals(Point p2){
        return (this.x == p2.x) && (this.y == p2.y);
    }

    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
}
