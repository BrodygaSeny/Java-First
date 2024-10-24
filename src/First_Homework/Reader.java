package First_Homework;

import java.util.Scanner;

public class Reader {
    private String name;
    private int age;
    private boolean isBlocked = false;

    public Reader(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
