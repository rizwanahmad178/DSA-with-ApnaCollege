package ArrayList;

import java.util.ArrayList;
public class ArrayListClass {
    public static void main(String[] args) {
        //Arraylist is part of Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        //add
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        //System.out.println(list);

        //adding at given index
        // list.add(0,1);
        // System.out.println(list);
        //get
        //System.out.println(list.get(0));
        //remove at index
        //int deletedValue = list.remove(2);
        //System.out.println(deletedValue);
        //System.out.println(list);
        //set value at index
        // int val = list.set(1, 10);
        // System.out.println(val);
        // System.out.println(list);
        //contains element
        // System.out.println(list.contains(2));
        // System.out.println(list.contains(15));

        //size of array list
        // System.out.println(list.size());
        //print arraylist
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }
        printReverse(list);
    }
    public static void printReverse(ArrayList<Integer> list){
        System.out.println("Before Reversal>>>");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("\nAfter Reversal>>>");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
