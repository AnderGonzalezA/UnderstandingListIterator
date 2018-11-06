import java.util.ArrayList;
import java.util.ListIterator;
 
public class UnderstandingListIterator {
 
  public static void main(String[] args) {
	// We create an ArrayList of string content and add five elements to it
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("element_1");
    arrayList.add("element_2");
    arrayList.add("element_3");
    arrayList.add("element_4");
    arrayList.add("element_5");
    
    // We create a listIterator for this ArrayList
    ListIterator it = arrayList.listIterator();
    
    // We print each value of the ArrayList that is in the index of the iterator, from the first one until the last one
    while(it.hasNext())
         System.out.println(it.next());
    
    // The index of the iterator is in the end of the ArrayList, so we print each value from the last one until the first one
    while(it.hasPrevious())
         System.out.println(it.previous());
    
    // We print the previous and the last index of the iterator
    System.out.println("Previous Index is : " + it.previousIndex());   
    System.out.println("Next Index is : " + it.nextIndex());

    // We print the next value of the ArrayList that is after the index of the iterator
    System.out.println("Next element is : " + it.next());
    
    // We print the previous and the last index of the iterator
    System.out.println("Previous Index is : " + it.previousIndex());   
    System.out.println("Next Index is : " + it.nextIndex());
    
    // We add a new value to the ArrayList at the index of the iterator
    it.add("element_6");
    
    // We print each value of the ArrayList from the first one until the last one, without taking into account the index of the iterator
    for(int i = 0; i < arrayList.size(); i++)
          System.out.println(arrayList.get(i));
    // We print the next element of the ArrayList that is after the index of the iterator
    System.out.println("Next element is : " + it.next());
    
    // We remove the element of the ArrayList that is in the index of the iterator
    it.remove();
    
    // We print each value of the ArrayList from the first one until the last one, without taking into account the index of the iterator
    for(int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));
    
    // We print the next element of the ArrayList that is after the index of the iterator
    System.out.println("Next element is : " + it.next());
    
    // We change the element of the ArrayList that is in the index of the iterator
    it.set("element_7");
    
    // We print each value of the ArrayList from the first one until the last one, without taking into account the index of the iterator
    for(int i = 0; i < arrayList.size(); i++)
           System.out.println(arrayList.get(i));

  }
}