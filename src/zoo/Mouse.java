package zoo;
public class Mouse extends Animal{

    public Mouse(String name) {
        super(name);
    }

    public void forward(){
        int step = 3;
        if(this.direction == up){
            if(y+step <= 50){
                if(Main.grid[x][y+step] == null) {
                    Main.grid[x][y] = null;
                    y += step;
                }
                else{
                    turnLeft();
                    turnLeft();
                }
            }
            else {
                turnLeft();
                forward();
            }
        }
        else if(this.direction == right){
            if(x+step <= 50){
                if(Main.grid[x+step][y] == null) {
                    Main.grid[x][y] = null;
                    x += step;
                }
                else{
                    turnLeft();
                    turnLeft();
                }
            }
            else {
                turnLeft();
                forward();
            }
        }
        else if(this.direction == down){
            if(y-step >= 0){
                if(Main.grid[x][y-step] == null) {
                    Main.grid[x][y] = null;
                    y -= step;
                }
                else{
                    turnLeft();
                    turnLeft();
                }
            }
            else {
                turnLeft();
                forward();
            }
        }
        else{
            if(x-step >= 0){
                if(Main.grid[x-step][y] == null) {
                    Main.grid[x][y] = null;
                    x -= step;
                }
                else{
                    turnLeft();
                    turnLeft();
                }
            }
            else {
                turnLeft();
                forward();
            }
        }
        Main.grid[x][y] = this;
    }
}
