package lab6;

public class Point2D {
    protected float x;
    protected float y;

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public  Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY(float[] XY) {
        XY = new float[2];
        XY[0] = this.x;
        XY[1] = this.y;
      return XY;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
