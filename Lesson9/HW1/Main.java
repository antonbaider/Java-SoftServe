import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Random rnd = new Random(System.currentTimeMillis());
        List<Integer> myCollection = new ArrayList<>();
        int n = 10;

        for (int i=0; i < n; i++) {
            myCollection.add(rnd.nextInt(20));

        }
        int minIndex = 0;
        int maxIndex = 0;
        int minValue = myCollection.get(0);
        int maxValue = myCollection.get(0);
        for (int i=1; i < myCollection.size(); i++) {
            int currentNumber = myCollection.get(i);
            if (currentNumber < minValue) {
                minValue = currentNumber;
                minIndex = i;
            }
            if (currentNumber > maxValue) {
                maxValue = currentNumber;
                maxIndex = i;
            }
        }
        Collections.swap(myCollection, minIndex, maxIndex);
        int negativeIndex = -1;
       for (int i = 0; i < myCollection.size(); i++) {
            int currentNumber = myCollection.get(i);
           if (currentNumber < 0) {
               negativeIndex = i;
               break;
           }
        }
        if (negativeIndex != -1) {
            myCollection.add(negativeIndex, 0);
            myCollection.add(negativeIndex, rnd.nextInt(20) + 100);
            myCollection.add(negativeIndex, rnd.nextInt(20) + 100);
            myCollection.add(negativeIndex, rnd.nextInt(20) + 100);
            myCollection.add(negativeIndex+1, 0);
        }

        System.out.println(myCollection);
        int k = 5;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        int count = 0;

        for (Integer element : myCollection) {
            if (count < k) {
                list1.add(element);
            } else {
                list2.add(element);
            }
            count++;
        }


        Collections.reverse(list2);
        System.out.println(list2);
        myCollection.remove(myCollection.size()-1);
        System.out.println(myCollection);
        if (minIndex < myCollection.size() - 1) {
             myCollection.remove(minIndex + 1);
            System.out.println("Removed from the list myCollection the element following the first minimum");
        } else {
            System.out.println("The minimum element is the last one, nothing needs to be removed");
        }
        System.out.println(myCollection);
    }
}
