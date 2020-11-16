package Other;

import java.util.*;

public class Algorythms {

    public static void main(String[] args) {

        String str1="silent";
        String str2="listen";

        System.out.println(isAnagrtam(str1, str2));


    }

    private static boolean isAnagrtam(String str1, String str2) {
        if(str1.length()!= str2.length()){
            return false;
        }

        if((str1==null)||(str2==null)){
            return false;
        }

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        return new String(array1).equals(new String(array2));

    }


    private static void accurance() {
        String str = "lolipop";

        str=str.toLowerCase();

        Map<Character,Integer> myMap = new HashMap<>();

        for(char ch :str.toCharArray()){
            if(myMap.get(ch)==null){
                myMap.put(ch,1);
            }else{
                myMap.put(ch,myMap.get(ch)+1);
            }

        }

        myMap.forEach((key,value)->{
            System.out.println(key  + " accurance "+ value);
        });
    }

}
