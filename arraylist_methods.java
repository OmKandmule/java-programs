import java.util.ArrayList;

class arraylist_methods
{
    public static void main(String[] args) {
       
      System.out.println("****** ArrayList********");
        int []arr=new int[10];
        ArrayList <Integer>l1=new ArrayList<>();
        ArrayList <Integer>l2=new ArrayList<>();
        l2.add(0, 1);
        l2.add(1, 2);
        l2.add(2, 3);   
        l2.add(3, 4);   
        
        l1.add(0, 5);
        l1.add(1, 10);
        l1.add(2, 15);  //------>>> the add method is used to add elements in array
        l1.add(3, 20);
        l1.add(4, 25);
               

        l1.set(3, 1000);  //------>>> the set method is used to set a element at the any index

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