package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class ArrayPartyTest {

    @Test
    public void printArrayTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms";
        //: When
        String actual = arrayParty.lastElement(breakfast);
        //: Then

        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method lastButOneTest

    //TODO Define the method reverseTest
    @Test
    public void reverseTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Mushrooms\n" +
                "Tomatoes\n" +
                "Bacon\n" +
                "Beans\n" +
                "Eggs\n" +
                "Sausage";

        //: When
        String actual = arrayParty.reverse(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }


    //TODO Define the method isPalindromeTest

    @Test
    public void isPalindromicTest() {
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String[] palindromic = {"Sausage", "Eggs", "Beans", "Eggs", "sausage"};

        ArrayParty arrayParty = new ArrayParty();

        boolean actual = arrayParty.isPalindromic(breakfast);
        boolean actual2 = arrayParty.isPalindromic(palindromic);

        Assert.assertEquals(false, actual);
        Assert.assertEquals(true, actual2);

    }




    //TODO Define the method compressTest

    @Test
    public void compressTest(){

        int[] toCompress = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        ArrayParty arrayParty = new ArrayParty();

        String expected = "*** Output ***\n1\n3\n2\n1\n4";

        String actual = arrayParty.compress(toCompress);

        Assert.assertEquals(expected,actual);
    }

    //TODO Define the method packTest

        @Test
        public void packTest(){
            ArrayParty arrayParty = new ArrayParty();
            char [] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};
            String expected = "*** Output ***\naaaa, b, cc, aa, d, eeee";

            String actual = arrayParty.pack(letters);

            Assert.assertEquals(expected,actual);

        }

}
