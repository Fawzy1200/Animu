package zoo;
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void forward(){
        int step = 1;
        if(this.direction == up){
            if(y+step <= 50){
                if(Main.grid[x][y+step] == null || !Main.grid[x][y+step].getClass().equals(Dog.class)) y += step;
                else {
                    turnRight();
                    turnRight();
                }
            }
            else{
                turnLeft();
                forward();
            }
        }
        else if(this.direction == right){
            if(x+step <= 50){
                if(Main.grid[x+step][y] == null || !Main.grid[x+step][y].getClass().equals(Dog.class)) x += step;
                else {
                    turnRight();
                    turnRight();
                }
            }
            else{
                turnLeft();
                forward();
            }
        }
        else if(this.direction == down){
            if(y-step >= 0){
                if(Main.grid[x][y-step] == null || !Main.grid[x][y-step].getClass().equals(Dog.class)) y -= step;
                else {
                    turnRight();
                    turnRight();
                }
            }
            else{
                turnLeft();
                forward();
            }
        }
        else{
            if(x-step >= 0){
                if(Main.grid[x-step][y] == null || !Main.grid[x-step][y].getClass().equals(Dog.class)) x -= step;
                else {
                    turnRight();
                    turnRight();
                }
            }
            else{
                turnLeft();
                forward();
            }
        }
        if(Main.grid[x][y] != null) this.kill(Main.grid[x][y]);
        Main.grid[x][y] = this;
    }
}