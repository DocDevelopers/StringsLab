import java.util.ArrayList;

/**
 * Created by Doc on 2/21/16.
 */
public class MyStringUtils {
    public static String combine(String[] strings){
        String result = "";

        for(String string : strings){
            result+= string +", ";
        }

        //All but last comma.
        return result.substring(0, result.length()-2);
    }

    public static String[] toStringArray(String string){
     return string.split("\n");
    }

    public static String reverseCase(String string){
        for(int i = 0; i<string.length(); i++){
            //if(string.p)
        }
        return null;
    }

    public static String reverse(String string){
        String result = "";
        //Split by spaces "words"
        String[] words = string.split(" ");

        //Loop through words
        for(String word : words){
            String reversed = "";
            for(int i = word.length()- 1; i>=0; i--){
                reversed += word.charAt(i);
            }
            result += reversed+" ";
        }

        return result.substring(0,result.length()-1);

    }

    public static String separateWords(String string){
        return string.replace(" ", "\n");
    }

    public static ArrayList<String> possibleSubStrings(String string){
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0; i<string.length(); i++){
            if(i+1 <= string.length()){
                result.add(string.substring(0, i+1));
            }
        }
        return result;
    }
}
