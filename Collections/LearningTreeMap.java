import java.util.*;

public class LearningTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer>tmap=new TreeMap<>();
        tmap.put("First",20);
        tmap.put("Second",5);
        tmap.put("Third",30);
        System.out.println(tmap.get("Second"));
        System.out.println(tmap.values());
        System.out.println(tmap.keySet());
        System.out.println(tmap);
    }    
}
