import java.util.*;
public class arrayfrom{
    static int[] get(){
        return new int[]{10,20,26,87,12};
    }
    public static void main(String args[]){
        int arr[]=get();
        for( int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}

