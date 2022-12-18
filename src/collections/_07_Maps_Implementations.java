package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_Maps_Implementations {
    public static void main(String[] args) {

        System.out.println("\n-----HashMap-----\n");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Beyza");
        map.put(1, "Malek");

        System.out.println(map.size()); // 1
        System.out.println(map); // {1=Malek}

        map.put(2, "Malek");
        System.out.println(map.size()); // 2
        System.out.println(map); // {1=Malek, 2=Malek}

        map.put(null, "Andrii");
        map.put(null, "Vlad");
        System.out.println(map); // {null=Vlad, 1=Malek, 2=Malek}

        map.put(3, "Viktoriia");
        map.put(4, null);
        map.put(5, null);
        map.put(6, null);

        System.out.println(map); // {null=Vlad, 1=Malek, 2=Malek, 3=Viktoriia, 4=null, 5=null, 6=null}

        System.out.println("\n-----LinkedHashMap-----\n");

        LinkedHashMap<Integer, String> maps = new LinkedHashMap<>();
        maps.put(1, "Beyza");
        maps.put(1, "Malek");

        System.out.println(maps.size()); // 1
        System.out.println(maps); // {1=Malek}

        maps.put(2, "Malek");
        System.out.println(maps.size()); // 2
        System.out.println(maps); // {1=Malek, 2=Malek}

        maps.put(null, "Andrii");
        maps.put(null, "Vlad");
        System.out.println(maps); // {1=Malek, 2=Malek, null=Vlad}

        maps.put(3, "Viktoriia");
        maps.put(4, null);
        maps.put(5, null);
        maps.put(6, null);

        System.out.println(maps);  //{1=Malek, 2=Malek, null=Vlad, 3=Viktoriia, 4=null, 5=null, 6=null}







    }
}
