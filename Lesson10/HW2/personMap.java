import java.util.*;
class personMap {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
 
        personMap.put("Person1", "One");
        personMap.put("Person2", "Two");
        personMap.put("Person3", "Three");
        personMap.put("Orest", "Four");
        personMap.put("Orest", "Four");
        personMap.put("Person6", "One");
        personMap.put("Person7", "Two");
        personMap.put("Person8", "Three");
        personMap.put("Person9", "Four");
        personMap.put("Person10", "Four");
        
        System.out.println(personMap);
        for (Map.Entry m : personMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        personMap.remove("Orest");
        System.out.println("Orest removed");
        Set<String> keys = personMap.keySet();
        Collection<String> values = personMap.values();
        for (String key : keys) { System.out.print(key + ": "); System.out.println(personMap.get(key));
        }
    }
}
