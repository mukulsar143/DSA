import java.util.*;

// ArrayList
class ArrayLists{
    public static void main(String args[]){
        
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<String> strList = new ArrayList<>();
    ArrayList<Boolean> boolList = new ArrayList<>();
    
    list.add(3);
    list.add(9);
    list.add(6);
    
    System.out.println(list);
    
    // Get Element
    int element = list.get(0);
    System.out.println(element);
    
    
    // add element in between
    
    list.add(3,5);
    System.out.println(list);
    
    // set element
    
    list.set(3,10);
    System.out.println(list);
    // remove element
    list.remove(3);
    System.out.println(list);
    
    // size
    
    int size = list.size();
    System.out.println(size);
    
    // Loop
    
    for(int i = 0; i<list.size(); i++){
        System.out.print(list.get(i));
    }
    
    // sorting
    
    Collections.sort(list);
    System.out.println(list);
    }
}