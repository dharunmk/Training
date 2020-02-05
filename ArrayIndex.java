import java.lang.*;
import java.util.Scanner;
public class ArrayIndex{
public static void main(String[] args){
int array[] = {1,4,5,7,9};
int target;
Scanner sc = new Scanner(System.in);
System.out.println("The sorted Array is :");
for(int i=0; i<array.length; i++)
System.out.println(array[i]);
System.out.println("Enter the target value");
target = sc.nextInt();
for(int i = 0; i<array.length;i++){
if(target == array[i]){
System.out.println("Target Index is "+i);
break;
}
else if(target<array[i]){
System.out.println("The Expected index if the target value inserted is "+i);
break;
}
}
}
}
