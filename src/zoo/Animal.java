package zoo;
import java.util.concurrent.ThreadLocalRandom;

public class Animal {
    public static final int up = 0, right = 1, down = 2, left = 3, border = 20;
    private final String name;
    private boolean alive;
    protected int x;
    protected int y;
    protected int direction;

    public Animal(String name) {
        this.name = name;
        this.alive = true;
        this.x = ThreadLocalRandom.current().nextInt(0, border + 1);
        this.y = ThreadLocalRandom.current().nextInt(0, border + 1);
        this.direction = ThreadLocalRandom.current().nextInt(0, 4);
        Main.grid[this.x][this.y] = this;
    }

    public void turnLeft(){
        this.direction++;
        this.direction %= 4;
    }

    public void turnRight(){
        this.direction--;
        this.direction += 4;
        this.direction %= 4;
    }

    public void forward(){
        int step = 1;
        if(this.direction == up){
            if(y+step <= 50) y += step;
            else {
                turnLeft();
                forward();
            }
        }
        else if(this.direction == right){
            if(x+step <= 50) x += step;
            else {
                turnLeft();
                forward();
            }
        }
        else if(this.direction == down){
            if(y-step >= 0) y -= step;
            else {
                turnLeft();
                forward();
            }
        }
        else {
            if(x-step >= 0) x -= step;
            else {
                turnLeft();
                forward();
            }
        }
    }

    boolean isAlive(){
        return this.alive;
    }

    public String getName() {
        return name;
    }

    void die(){
        this.alive = false;
    }

    void kill(Animal prey){
        prey.die();
    }
}
