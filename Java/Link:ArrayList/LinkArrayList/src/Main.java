import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        
        LinkedList<String> links = new LinkedList<>();
        links.add("Bertha");
        links.add("Barbara");
        links.add("Betty");
        links.add(0, "Bianca");
        Collections.sort(links, Collections.reverseOrder());//sort list in reverse order

        LinkedList<Integer> links2 = new LinkedList<>();
        links2.add(56);
        links2.add(989);
        links2.add(77);
        Collections.sort(links2, Collections.reverseOrder());

        ArrayList<String> arrays = new ArrayList<>();
        arrays.add("George");
        arrays.add("Greg");
        arrays.add("Gary");
        Collections.sort(arrays);//sort list in order

        ArrayList<Integer> arrays2 = new ArrayList<>();
        arrays2.add(357);
        arrays2.add(6898);
        arrays2.add(2);
        Collections.sort(arrays2);

        System.out.println("Linked list with Strings in reverse order: " + links);
        System.out.println("Linked list with Integers in reverse order: " + links2);
            System.out.println();
        System.out.println("Array list with Strings sorted: " + arrays);
        System.out.println("Array list with Strings cloned sorted: " + arrays.clone());
        System.out.println("Array list with Integers sorted: " + arrays2);
            System.out.println();
        
        for (Integer integer : arrays2) {//printing array in enhanced for loop
            System.out.println("Contents of array list in a enhanced for loop Integers: " + integer); 
         }
            System.out.println();
        
        System.out.println("Linked list last item on the list: " + links.getLast() + "\n" + "Array list size: " + arrays.size());
        System.out.println();

        //since String is referenced in the Iterator, there is no reason for the cast but cast added
        Iterator<String> iterator = links.iterator();//used to look for a certain name on the linked list
        while(iterator.hasNext()){
            if((String) iterator.next() == "Betty"){//looking for Betty in the String array list using a Cast(String)
                System.out.print("We found Betty on the linked list!");
                System.out.println(" Printed from the Iterator");
            }
        }
        System.out.println();

        //since Integer is referenced in the Iterator, there is no reason for the cast
        Iterator<Integer> iterator2 = links2.iterator();//used to look for a certain number on the linked list
        while(iterator2.hasNext()){
            if ((int) iterator2.next() == 989){//looking for number 989 in the Integer array list using a Cast(Integer)
                System.out.print("We found number 989 on the linked list!");
                System.out.println(" Printed from the Iterator");
            }
        }
            System.out.println();
    }
}
