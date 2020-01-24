package com.codewars.kata;

public class BackspacesInString { // https://www.codewars.com/kata/5727bb0fe81185ae62000ae3/train/java

    public static String attempt(String text) {
        char[] characterArray = text.toCharArray();
        for (int i=0; i<characterArray.length;i++){
            if (characterArray[i] == '#'){
                deletePreviousChar(characterArray, i);
                characterArray[i] = ' ';
            }
        }
        return new String(characterArray).replaceAll(" ", "");
    }

    private static void deletePreviousChar(char[] characterArray, int i) {
        if (i>0){
            if (characterArray[i-1] == ' '){
                deletePreviousChar(characterArray, i-1);
            }else{
                characterArray[i-1] = ' ';
            }
        }
    }

    public static String solution(String text) {
        StringBuilder b = new StringBuilder();
        for(int i=0; i<text.length(); ++i) {
            char c = text.charAt(i);
            if(c=='#') b.setLength(Math.max(b.length()-1,0));
            else b.append(c);
        }
        return b.toString();
    }
}
