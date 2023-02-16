import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String ws=in.nextLine();
        List<Integer>li=new ArrayList<>();
        StringBuffer s=new StringBuffer();
        for (int i=0; i<ws.length(); i++){  
            if (Character.isDigit(ws.charAt(i))){
                int a= ws.charAt(i)-'0';
        li.add(a);
        }
    }
        int f=0,m=0;
        for(int i=0;i<li.size();i++){
            if(li.get(i)==5){
                m=1;
            }if(m==1){
                s.append(li.get(i));
            }if(m==0){
                f=f+li.get(i);
            }if(li.get(i)==8){
                m=0;
            }
        }String str = s.toString();
        int c=Integer.parseInt(str);  
        System.out.println(c+f);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
