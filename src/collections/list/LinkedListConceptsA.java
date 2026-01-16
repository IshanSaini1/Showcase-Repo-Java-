package collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListConceptsA {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        addMoreElements(placesToVisit);
        removeElements(placesToVisit);
        gettingElements(placesToVisit);
        traverseListViaLoop(placesToVisit);
        traverseListViaEnhancedLoop(placesToVisit);
        traverseListViaIterator(placesToVisit);
        listIteratorOperations(placesToVisit);
    }

    private static void reInitializeList(LinkedList<String> list) {
        addMoreElements(list);
    }

    private static void printList(LinkedList<String> list) {
        System.out.println(list);
    }

    private static void addMoreElements(LinkedList<String> list) {
        // List Methods
        printList(list);
        list.addFirst("Darwin");
        printList(list);
        list.addLast("Hobart");
        // Queue Methods
        printList(list);
        list.offer("Melbourne");
        printList(list);
        list.offerFirst("Brisbane");
        printList(list);
        list.offerLast("Toowoomba");
        // Stack Methods
        printList(list);
        list.push("Alice Springs");
    }

    private static void removeElements(LinkedList<String> list) {
        // List Methods
        printList(list);
        list.remove(4);
        printList(list);
        list.remove("Brisbane");
        // Removes the first element in the list, if no arg is given.
        printList(list);
        System.out.println("Removed " + list.remove());
        printList(list);
        System.out.println("Removed " + list.removeFirst());
        printList(list);
        System.out.println("Removed " + list.removeLast());
        // Queue
        printList(list);
        System.out.println("Removed " + list.poll());
        printList(list);
        System.out.println("Removed " + list.pollLast());
        printList(list);
        System.out.println("Removed " + list.pollFirst());
        printList(list);
        //Re-Initialize List
        reInitializeList(list);
        printList(list);
        // Stack Methods
        System.out.println("Removed " + list.pop());
        printList(list);
    }

    private static void gettingElements(LinkedList<String> list) {
        printList(list);
        System.out.println("Element at index 4 is " + list.get(4));
        printList(list);
        System.out.println("Darwin is at position " + list.indexOf("Darwin"));
        printList(list);
        System.out.println("Melbourne is at position " + list.lastIndexOf("Melbourne"));
        // Queue retrieval
        printList(list);
        System.out.println("Queue is FIFO so " + list.element());
        // Stack Retrieval methods
        printList(list);
        System.out.println("Elements from peek() = " + list.peek());
        System.out.println("Elements from peekFirst() = " + list.peekFirst());
        System.out.println("Elements from peekLast() = " + list.peekLast());
    }

    private static void traverseListViaEnhancedLoop(LinkedList<String> list) {
        String placeStartedAt = list.getFirst();
        for (String place : list) {
            System.out.println(placeStartedAt + " --> " + place);
            placeStartedAt = place;
        }
    }

    private static void traverseListViaLoop(LinkedList<String> list) {
        for (int i = 0; i < list.size()-1; i++) {
            String placeAt = list.get(i);
            String placeToGo = list.get(i+1);
            System.out.println("%s ---|--> %s".formatted(placeAt,placeToGo));
        }
    }

    private static void traverseListViaIterator(LinkedList<String> list){
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            System.out.println("from iter ----> %s".formatted(iter.next()));
        }
    }

    private static void listIteratorOperations(LinkedList<String> list){
        printList(list);
        ListIterator iter = list.listIterator();
        while (iter.hasNext()){
            String placeAt = (String) iter.next();
            if(placeAt.equals("Hobart")){
                iter.add("Lake Wivenhoe");
                break;
            }
        }
        // Reset the Iterator
        iter = list.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
