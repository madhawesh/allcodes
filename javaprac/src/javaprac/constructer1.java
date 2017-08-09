package javaprac;

public class constructer1 {
    int id;  
    String name;  
      
  //  constructer1(){  
 //   this.id = i;  
  // this.name = n;  
   // }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    	constructer1 s1 = new constructer1();  
    	constructer1 s2 = new constructer1();  
    s1.display();  
    s2.display();  
   }  
} 