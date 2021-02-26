package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListExample {

    public static void main (String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        for (String str : names) {
            System.out.println(" -> "+ str);
        }

        names.set(names.indexOf("Carlos"), "Roberto");
        System.out.println(names);

        System.out.println("Pos[1] -> "+ names.get(1));

        names.remove(4);
        System.out.println(names);

        names.remove("João");
        System.out.println(names);

        System.out.println(names.size());

        System.out.println("Juliano -> "+ names.contains("Juliano"));

        List<String> newNames = new ArrayList<>();

        newNames.add("Ismael");
        newNames.add("Rodrigo");

        names.addAll(newNames);
        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        System.out.println(names.isEmpty());
    }
}
