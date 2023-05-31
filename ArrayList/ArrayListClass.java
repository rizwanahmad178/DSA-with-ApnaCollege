package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListClass {
    public static void main(String[] args) {
        //Arraylist is part of Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        //add
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(9);
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
        //printReverse(list);
        //findMaximum(list);
        // int idx1 = 1, idx2 = 3;
        // swap(list, idx1, idx2);

        //Sorting with Collections.sort()
        System.out.println(list);
        Collections.sort(list);//Ascending Order
        System.out.println(list);

        //Descending Order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        System.out.println("Before Swap");
        System.out.println(list);
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println("After Swap");
        System.out.println(list);

    }

    public static void findMaximum(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum Value in the given list : "+max);
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
