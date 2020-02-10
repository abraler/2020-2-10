package Exercise;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<Integer>();
        Scanner in=new Scanner(System.in);
        String url=in.nextLine();

        String []str=url.substring(1,url.length()-1).split(",");


        int i=0;
        while(i<str.length){
            System.out.println(str[i]);
            if(str[i].trim().charAt(1)!='+'&&str[i].trim().charAt(1)!='-'&&str[i].trim().charAt(1)!='*'&&str[i].trim().charAt(1)!='/') {
                stack.push(Integer.valueOf(String.valueOf(str[i].charAt(1))));
            }else if(str[i].trim().charAt(1)=='+'){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a+b);
            }else if(str[i].trim().charAt(1)=='-'){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a-b);
            }else if(str[i].trim().charAt(1)=='*'){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a*b);
            }else if(str[i].trim().charAt(1)=='/'){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(a/b);
            }
            i++;
        }
        System.out.println(stack.pop());
    }
}
