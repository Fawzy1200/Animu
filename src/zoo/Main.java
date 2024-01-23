package zoo;
import java.util.ArrayList;

public class Main {
    public static Animal[][] grid = new Animal[51][51];

    public static void main(String[] args){
        ArrayList<Animal> holder = new ArrayList<>();
        for (int i = 1; i <= 10; i++) holder.add(new Mouse("Mouse"+i));
        for(int i = 1; i <= 7; i++) holder.add(new Cat("Cat"+i));
        for(int i = 1; i <= 5; i++) holder.add(new Dog("Dog"+i));

        int counter = 22*10;
        while(counter-- > 0){
            holder.get(counter%22).forward();
        }

        for(Animal elem : holder){
            System.out.print(elem.getName() + ": ");
            if(elem.isAlive()) System.out.print("Alive. ");
            else System.out.print("Dead. ");
            System.out.println(" Position: " + elem.x + ", " + elem.y);
        }
    }
}
