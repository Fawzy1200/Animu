import zoo.*;

import java.io.Serializable;
import java.util.ArrayList;

public class Tester <T extends Animal, U extends Animal> extends Animal {
    public int letUsJava;

    Tester(String name){
        super(name);
    }

    public static int doit(int a, int b){
        return a+b;
    }

    public static String doit(String a, String b){
        return a+b;
    }

    public static void main(String[] args){
        ArrayList<Integer> myn = new ArrayList<>(2);
        myn.add(1);
        myn.add(2);
        System.out.println(myn);
        System.out.println(doit("3242", "432"));
    }
}
