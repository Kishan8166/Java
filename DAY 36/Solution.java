import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
	Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
    String in = sc.next();
    Stack<String> paren = new Stack<String>();
    for (String p : in.split("")) {
        if (!p.isEmpty()) { 
            if (paren.isEmpty()) {
                paren.push(p);
            } 
            else {
                String top = paren.peek();
                if (p.equals(")") && top.equals("(")
                    || (p.equals("}") && top.equals("{") 
                    || (p.equals("]") && top.equals("[")))) {
                    paren.pop();
                }
                else {
                    paren.push(p);
                }
            }
        }
    }
    String M = (paren.isEmpty()) ? "true" : "false";
    System.out.println(M);
    
    }
	sc.close();	
	}
}