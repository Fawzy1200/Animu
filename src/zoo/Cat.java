package zoo;
public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public void forward(){
        int step = 2;
        if(this.direction == up){
            if(y+step <= 50){
                if(Main.grid[x][y+step] == null || Main.grid[x][y+step].getClass().equals(Mouse.class)) {
                    Main.grid[x][y] = null;
                    y += step;
                }
                else {
                    turnLeft();
                    turnLeft();
                }
            }
            else{
                turnLeft();
                forward();
            }
        }
        else if(this.direction == right){
            if(x+step <= 50){
                if(Main.grid[x+step][y] == null || Main.grid[x+step][y].getClass().equals(Mouse.class)) {
                    Main.grid[x][y] = null;
                    x += step;
                }
                else {
                    turnLeft();
                    turnLeft();
                }
            }
            else{
                turnLeft();
                forward();
            }
        }
        else if(this.direction == down){
            if(y-step >= 0){
                if(Main.grid[x][y-step] == null || Main.grid[x][y-step].getClass().equals(Mouse.class)) {
                    Main.grid[x][y] = null;
                    y -= step;
                }
                else {
                    turnLeft();
                    turnLeft();
                }
            }
            else{
                turnLeft();
                forward();
            }
        }
        else{
            if(x-step >= 0){
                if(Main.grid[x-step][y] == null || Main.grid[x-step][y].getClass().equals(Mouse.class)) {
                    Main.grid[x][y] = null;
                    x -= step;
                }
                else {
                    turnLeft();
                    turnLeft();
                }
            }
            else{
                turnLeft();
                forward();
            }
        }
        if(Main.grid[x][y] != null && Main.grid[x][y].getClass().equals(Mouse.class)) this.kill(Main.grid[x][y]);
        Main.grid[x][y] = this;
    }
}
