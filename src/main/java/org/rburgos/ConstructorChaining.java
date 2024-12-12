package org.rburgos;

import java.lang.reflect.Constructor;
import java.util.HashMap;

public class ConstructorChaining {

    ConstructorChaining() {
        System.out.print("Hello");
    }

    ConstructorChaining(ConstructorChaining constructor) {
        System.out.print("World");
    }

    public static void main(String[] args) {
        ConstructorChaining chaining = new ConstructorChaining(new ConstructorChaining());
        short s1=1, s2=1;
        HashMap<Short, String> map = new HashMap<>();
        map.put(s1, "one");
        System.out.println(map.get(s2));
    }

}
