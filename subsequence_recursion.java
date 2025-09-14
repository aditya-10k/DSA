import java.util.*;

public class subsequence_recursion {
    public static void main(String[] args) {
      var a = new ArrayList<Integer>(Arrays.asList(1,2,3))  ;
      var b = new ArrayList<Integer>();
      
      subs(a , b , a.size() , 0);
      
  }
  
   static void subs(ArrayList<Integer> a ,ArrayList<Integer> b,int n ,int count)
   {
     if(count == n)
     {
       System.out.println(b);
       return ; 
     }
     
     b.add(a.get(count));
     subs(a,b,n,count+1);
     b.remove(b.size()-1);
     subs(a,b,n,count+1);
   }
}