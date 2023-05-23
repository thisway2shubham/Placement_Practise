package GeekForGeek;

import java.util.Scanner;

public class Palindromic_Array {
	
	public static int palinArray(int[] a, int n)
    {
        int sum=0;
        int r,temp;
//        boolean flag=false;
        int count=0;
        for(int i=0;i<n;i++)
        {
        
            int num=a[i];
            temp=num;
            while(num>0)
            {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
                
            }
            if(sum==temp){
//                flag=true;
                System.out.println("Count:-"+i+"--"+count);
                
                count++;
                continue;
            }
            
        }
           System.out.println("count:"+count);    	
        if((count+1)==n)
          {
              return 1;
          }
          else{
              return 0;
          }
    }
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input size");
		
		int in=sc.nextInt();
		
		System.out.println("Enter the elements of Array");
		int arry[]=new int[in];
		for(int i=0;i<arry.length;i++) {
			arry[i]=sc.nextInt();
		}
		
		System.out.println(palinArray(arry,in));
		
		
	}

}
