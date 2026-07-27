public class main {
    public static void main(String[] args) {
        //hashDemo();
        HashMapFinal<String, String> map = new HashMapFinal<>();
        map.put("Mango", "king of fruits");
        map.put("Apple", "red fruit");
        map.put("Banana", "yellow fruit");

        System.out.println(map); // Output: king of fruits

        // HashMap<String, Integer> map = new HashMap<>();

        // map.put("apple", 1);
        // map.put("banana", 2);
        // map.put("orange", 3);

        // System.out.println(map.get("apple"));
        
        // HashSet<Integer> set = new HashSet<>();

        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(2); // Duplicate value, will not be added

        // System.out.println(set);
    }
}