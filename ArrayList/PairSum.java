package ArrayList;

import java.util.ArrayList;

public class PairSum {
    public static void main(String[] args) {
        //list should be sorted
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // if(pairSum1(list,15)){
        //     System.out.println("Target Found>>>");
        // }else{
        //     System.out.println("Target Not Found");
        // }

        //Pair Sum 2
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(10);
        if(pairSum2(list,16)){
            System.out.println("Target Found>>>");
        }else{
            System.out.println("Target Not Found");
        }
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        int n = list.size();
        while(lp!=rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case 2
            if((list.get(lp) + list.get(rp)) > target){
                rp = (n + rp - 1)%n;
            }else{
                //case 3
                lp = (lp + 1)%n;
            }
        }
        return false;
    }

    public static boolean pairSum1(ArrayList<Integer> list, int target){
        //2 Pointer
        int lp = 0;
        int rp = list.size()-1;
        while(lp!=rp){
            int val = list.get(lp) + list.get(rp);
            if(val == target){
                return true;
            }else if(val > target){
                rp--;
            }else if(val < target){
                lp++;
            }
        }
        return false;
        //Brute Force
        // for(int i=0;i<list.size();i++){
        //     for(int j=i+1;j<list.size();j++){
        //         if(list.get(i) + list.get(j) == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}
