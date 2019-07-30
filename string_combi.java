package combination_string;
import java.io.Console;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class string_combi{
    public static void main(String args[])throws IOException
    {
        Console c = System.console();
        System.out.print("Enter any string: ");
        String str = c.readLine();
        int length = str.length();
        if(str.charAt(0) == 'a' && str.charAt(length-1) == 'b'){        //'a' abd 'b' are fixed at the first and last. Change as required
            int total_repeat = repeat(str);
            System.out.println("Total number of combonations possible = "+(int)(Math.pow(2,(length-2))+total_repeat));
        }
        else {
            System.out.println("Not possible");
        }
    }
    public static int repeat(String str){
        HashMap<Character,Integer> map = new HashMap<>();               //Using HashMap to maintain a map/dictionary structure to keep occurance of each character
        int repeat_count, sum = 0;
        for(int i=0;i<str.length();i++){
            char character = str.charAt(i);
            if(map.containsKey(character)){                         //checking if character/key in map exists
                map.put(character, map.get(character)+1);           //then increment the value by 1
            }
            else if(character != ' '){                              //if key doesn't exist then check if it isn't blank then insert in HashMap
                map.put(character, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            repeat_count = 0;
            if(entry.getValue() > 1){
                repeat_count = entry.getValue() - 1;                    //calculating exactly repeated times of all characters
                sum = sum + repeat_count;
            }
        }
        return sum;
    }
}