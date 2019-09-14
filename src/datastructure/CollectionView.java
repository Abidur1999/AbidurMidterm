package datastructure;

import java.util.HashMap;
import java.util.Map;

public class CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "NYC");
                map.put(2, "Canada");
                map.put(3, "Denver");
                map.put(4, "New Jersey");
                map.put(5, "Buffalo");
                map.put(6, "Ohio");

                for (Map.Entry<Integer, String> value : map.entrySet()) {
                        System.out.println(value);

                }

        }
}
