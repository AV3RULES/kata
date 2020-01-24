package com.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspacesInStringTest {

    @Test
    public void testCleanStringWithFixedData() {
        assertEquals("ac", BackspacesInString.solution("abc#d##c"));
        assertEquals("", BackspacesInString.solution("abc####d##c#"));
        assertEquals("jf", BackspacesInString.solution("abjd####jfk#"));
        assertEquals("gdasda", BackspacesInString.solution("gfh#jds###d#dsd####dasdaskhj###dhkjs####df##s##d##"));
        assertEquals("6+yqw8hfklsd-=-f", BackspacesInString.solution("831####jns###s#cas/*####-5##s##6+yqw87e##hfklsd-=-28##fds##"));
        assertEquals("jdsfdasns", BackspacesInString.solution("######831###dhkj####jd#dsfsdnjkf###d####dasns"));
        assertEquals("", BackspacesInString.solution(""));
        assertEquals("", BackspacesInString.solution("#######"));
        assertEquals("sa", BackspacesInString.solution("####gfdsgf##hhs#dg####fjhsd###dbs########afns#######sdanfl##db#####s#a"));
        assertEquals("hskjdgd", BackspacesInString.solution("#hskjdf#gd"));
        assertEquals("hsk48hjjdfgd", BackspacesInString.solution("hsk48hjjdfgd"));
        assertEquals("Io4f", BackspacesInString.solution("fjnwui#NI#(*N#ION#Onfjen################Io4f"));
        assertEquals("6d87hbaskj$$%$$2332ff", BackspacesInString.solution("####6d87hbaskjdnf###$$%W#$@#$2332fr#f"));
        assertEquals("9OooooO", BackspacesInString.solution("#9#9#9#9o#9#9#9#Oooooo#OOOooO#OO######"));
        assertEquals("0", BackspacesInString.solution("0###0###0"));
        assertEquals("904rfDj*fsf09mfednkmfd;m", BackspacesInString.solution("904rfn#jlkcn#####Djva2###*(#fsdgfd####fsdg###09849###mfenf##dnjn##kmfd;l#mg03###"));
    }

    @Test
    public void testCleanStringWithRandomData() {
        for (int i=0; i<20; i++) {
            final String randomData = generateRandomData();
            final String answer = solveFor(randomData);
            assertEquals(answer, BackspacesInString.solution(randomData));
        }
    }

    private String generateRandomData() {
        String str = "" + randomCharacter();
        while (Math.random() < 0.9 && str.length() < 15) {
            str += Math.random() > 0.4 ? randomCharacter() : '#';
        }
        return str;
    }

    private String solveFor(String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c == '#' && sb.length() > 0) sb.deleteCharAt(sb.length()-1);
            else if (c != '#') sb.append(c);
        }
        return sb.toString();
    }

    private char randomCharacter() {
        final int rnd = (int) (Math.random() * 52);
        final char base = (rnd < 26) ? 'A' : 'a';
        return (char) (base + rnd % 26);
    }

    @Test
    void solution() {
        assertEquals("ac", BackspacesInString.attempt("abc#d##c"));
        assertEquals("", BackspacesInString.attempt("abc####d##c#"));
    }
}