package lecture10;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HashMapExample {

  public static void main(String[] args) {

    Product product = new Product("Tea", 2);
    System.out.println(product.toString());
   /* HashMap<String, Integer> map = new HashMap<>();
    map.put("Alex", 10);
    map.put("Elena", 10);

    System.out.println(map.size());

    if (map.containsKey("Alex")){
      Integer a = map.get("Alex");
      log.error("Alex has value: {}", a);
     // System.out.println("Alex has value: " + a);
    }

    for (Map.Entry<String, Integer> map1 : map.entrySet()){
      System.out.println("key: " + map1.getKey() + "...... value: " + map1.getValue());
    }*/
  }
}
