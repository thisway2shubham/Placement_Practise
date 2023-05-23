package HackerRank_DSA;


import java.util.*;



class Result {

   
    public static List<Integer> reverseArray(List<Integer> a) {
          
          int n = a.size();
          System.out.println("Size of List:-"+n);
          
//   for (int i = 0; i < n / 2; i++) {
//     int temp = a.get(i);
//     a.set(i, a.get(n - i - 1));
//     a.set(n - i - 1, temp);
//   }

        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=a.get(i);
        }
        
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        List<Integer> a2=new ArrayList<>();
        for(int i=0;i<n;i++){
            a2.add(arr[i]);
        }

            return a2;

    }

}

public class Solution {
    public static void main(String[] args) {
       
       int arry[]={1,5,2,3,9};
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<arry.length;i++) {
    	   list.add(arry[i]);
       }
       System.out.println("array :-"+list);
        List<Integer> res = Result.reverseArray(list);
        System.out.println("reverse array:-"+res);
       
    }
}