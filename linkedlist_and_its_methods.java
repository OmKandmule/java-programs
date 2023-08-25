import java.util.LinkedList;

public class linkedlist_and_its_methods {
    public static void main(String[] args) {
        LinkedList <Integer>l1=new LinkedList<>();
        LinkedList <Integer>l2=new LinkedList<>();
        System.out.println("****** LinkedList********");
        int []arr=new int[10];
        l2.add(0, 1);
        l2.add(1, 2);
        l2.add(2, 3);   
        l2.add(3, 4);   
        
        l1.addFirst(111);
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.addLast(555);
        

        // l1.set(3, 1000);  //------>>> the set method is used to set a element at the any index

        l1.addAll( l2);    //------>>> the addAll method is used to add all elements in different array to our array .

        // l1.clear();     ------>>> the clear method is used delete or clear all elements in array.

        // System.out.println(l1.contains(100)); ------>>> the contains method returns boolean it finds element present or not in array

        // System.out.println("index : "+l1.indexOf(3));  ------>>> index method shows the index of element

        // l1.remove(3); ------>>> this methos is used to remove element from array.
          for(int i =0;i<=l1.size()-1;i++)
             {
                System.out.println(l1.get(i));
              }

    }
}
