import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Map<Integer, Integer> myHashMap = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            int rNum = r.nextInt(100) + 1;
            if (myHashMap.containsKey(rNum)) {
                myHashMap.put(rNum, myHashMap.get(rNum) + 1);
            } else {
                myHashMap.put(rNum, 1);
            }
        }
        for (Map.Entry entry : myHashMap.entrySet()) {
            System.out.println(entry);
        }
    }


}
