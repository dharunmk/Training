import java.util.*;
class Arraylistdemo{
    public static void main(String args[]) {
        LinkedList<String> list=new LinkedlistList<String>();
        list.add("Rani");
        list.add("Gopi");
        list.add("Charan");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }    
    }
}
