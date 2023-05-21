import java.util.HashSet;
import java.util.Set;

class UnionSet {
    public static <String>Set union(Set<String> set1, Set<String> set2){
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    private static <String> Set intersect (Set<String> set1, Set<String> set2) {
        Set<String> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Alice");
        set1.add("Bob");
        System.out.println("Set 1:" + set1 + "\n");
        Set<String> set2 = new HashSet<>();
        set2.add("Angel");
        set2.add("Bobby");
        set2.add("Bob");
        System.out.println("Set 2" + set2+ "\n");

        Set<String> unionResult = union(set1, set2);
        System.out.println("Set 1 + Set 2 " + unionResult+ "\n");

        Set<String> intersectResult = intersect(set1, set2);
        System.out.println("Set 1 - Set 2 " + intersectResult+ "\n");
    }
}
