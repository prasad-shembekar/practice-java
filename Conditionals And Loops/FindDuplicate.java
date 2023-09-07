import java.util.*;

public class FindDuplicate{
    public static void main(String args[]){
        printDuplicate("Programming");
        printDuplicate("Hello");
    }

    public static void printDuplicate(String word){
        char[] character = word.toCharArray();

        Map<Character,Integer> charMap = new HashMap<Charater,Integer>();

        for(Character ch: character){
            if(charMap ch : characters){
                charMap.put(ch,charMap.get(ch)+1);
            }else{
                charMap.put(ch,1);
            }
        }

        Set<Map.Entry<Character,Integer>> entrySet - charMap.entrySet();
        System.out.printf("List of duplicate in string '%s' '%n'",word);
        for(Map.Entry<Character,Integer> entry: entrySet){
            if(entry.getValue()>1){
                System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
            }
        }
    }
}