import java.util.*;

public class Reverse{
    public String reverseRec(String orig){
        if(orig.length() == 1){
            return orig;
        }else{
            return orig.charAt(orig.length()-1) + reverseRec(orig.substring(0,orig.length()-1));
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String result = "";

        for(int i = name.length()-1; i>=0;i--){
            result = result + name.charAt(i);
        }
        System.out.println("Reverse is:"+result);
    
        StringBuffer sb = new StringBuffer(name);
        System.out.println("Reverse is:" + sb.reverse());
        
        Reverse rev = new Reverse();
        result = rev.reverseRec(name);
        System.out.println("Reverse is : "+result);
    }
}

