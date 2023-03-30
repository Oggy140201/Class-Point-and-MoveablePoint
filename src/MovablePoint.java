public class MovablePoint  extends  Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(){
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed,float ySpeed){
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public float getXSpeed(){
        return xSpeed;
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }

    public float getYSpeed(){
        return  ySpeed;
    }

    public void getYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }

    public void getSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public  float[] getSpeed(){
        float get[] = {this.xSpeed,this.ySpeed};
        return get;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public MovablePoint move(){
        super.setX(x + xSpeed);
        super.setX(y + ySpeed);
        return this;
    }
}
