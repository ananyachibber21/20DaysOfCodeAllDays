import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsingHashmaps {
    public static int firstUniqueCharacter(String s){
       
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        s=sc.next();
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
        }
        for(int j=0;j<s.length();j++)
        {
            char ch=s.charAt(j);
            int count= countMap.get(ch);
            if(count==1)
            {
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      
        String s = null;
        int index= firstUniqueCharacter(s);
        System.out.println(index);
    }
}
