package Arrays;
import java.util.*;
public class Question8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int sixidx=0;
        int svnidx=0;
        int sum=0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==6 || arr[i]==7) {
                if(arr[i]==6) {
                    sixidx=i;
                }
                if(arr[i]==7) {
                    svnidx=i;
                }
            }
        }
        if(sixidx<svnidx){
        for(int i=0;i<sixidx;i++){
          sum=sum+arr[i];
        }
        for(int j=svnidx+1;j<arr.length;j++){
          sum=sum+arr[j];
        }
        }
        else{
        for(int i=0;i<arr.length;i++){
          sum=sum+arr[i];
        }
          
    }
        System.out.println(sum);
}
}
