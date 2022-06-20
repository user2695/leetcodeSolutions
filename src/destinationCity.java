import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class destinationCity {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("London");
        list1.add("New York");
        paths.add(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("New York");
        list2.add("Lima");
        paths.add(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("Lima");
        list3.add("Sao");
        paths.add(list3);

        System.out.println(destCity(paths));
    }

    static String destCity(List<List<String>> paths) {
        if (paths.size() == 1)
            return paths.get(0).get(1);

        Map<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }

        String destination = paths.get(0).get(0);
        while (map.containsKey(destination)) {
            destination = map.get(destination);
        }

        return destination;
    }
}
