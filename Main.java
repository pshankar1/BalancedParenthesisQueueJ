import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter PArenthesis: ");
    String ss=sc.nextLine(); 
  }
 static void balancedP(){
     Queue= queuey;
   int limit=1;
/********
adds entered elements into queue and redefines the length
increases in length per character with push
and enteres element to the front 
*****/
   for(int i=0;i<p.length();i++)
   {

      
       if(p[i]=='(') queuey.push(p[i]); 
       else
       {
          
/********
will get the front element and if it is ( then it will initiate
pop and remove it 
and if not it wont apply
*****/
           if(queuey.front()=='(' && queuey.size()>0) // pop if top is (
           {
               queuey.pop();
           }else
           {
               limit=0;
               break;
           }
       }

   }

  /*******
if the balanced (limit) and size of queue are both 0
the it is balanced
if not it is not balanced 
  ***********/
   if(limit && queuey.size()==0)
       cout<<"yes";
   else
       cout<<"no";

}

int main() {

string p;
System.out.println("Are your parenthesis balanced?!\n");
System.out.println("Enter Parenthesis pattern:  ");
System.out.println( p);

isBalanced(p);

}
 }
}