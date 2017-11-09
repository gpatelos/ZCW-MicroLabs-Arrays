package io.zipcoder.microlabs.arrays;


import java.sql.Array;
import java.util.ArrayList;

public class ArrayParty {

    public String printArray(String[] inputArray){

        String output = "*** Output ***";

        for(String currentElement: inputArray){
            output += "\n"+ currentElement;
        }

        return output;
    }

    public String lastElement(String[] inputArray){

        int lastElement = inputArray.length - 1 ;

        String output = "*** Output ***\n";
        output += inputArray[lastElement];

        return output;




    }

    //TODO Define the method lastButOne

    //TODO Define the method reverse
    public String reverse(String[] inputArray){

        String output = "*** Output ***";
        for(int i = inputArray.length-1; i >= 0; i--){
            output += "\n" + inputArray[i];
        }

        return output;

    }
    //TODO Define the method isPalindrome

    public boolean isPalindromic(String[] inputArray) {

        int arrayLength = inputArray.length;
        boolean flag = false;

        for(int i = 0; i<arrayLength; i++){
            if(!inputArray[i].equalsIgnoreCase(inputArray[arrayLength-i-1])){
                flag = false;
            } else {flag = true;}
        }
        return flag;

    }



    //TODO Define the method compress

    public String compressUnique(int[] inputArray){

        ArrayList resultArray = new ArrayList();

        for(int i = 0; i < inputArray.length; i++){
            if(!resultArray.contains(inputArray[i])){
                resultArray.add(inputArray[i]);
            }

        }
        int resultSize = resultArray.size();
        String output = "***Output***";

        for(int i = 0; i< resultSize; i++){
            output += "\n" + resultArray.get(i);
        }

        return output;
    }

    public String compress(int[] inputArray) {

//        ArrayList resultArray = new ArrayList();
//
//        for(int i = 0; i < inputArray.length-1; i++){
//            if(inputArray[i] != inputArray[i+1] ){
//                resultArray.add(inputArray[i]);
//            }
//
//        }
//        int resultSize = resultArray.size();
//        String output = "***Output***";
//
//        for(int j = 0; j < resultSize; j++){
//            output += "\n" + resultArray.get(j);
//        }
//
//        return output;

        String output = "*** Output ***\n"+inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] != inputArray[i -1]) {
                output += "\n"+inputArray[i];
            }

        }return output;
    }
    //TODO Define the method pack

    public String pack(char[] input){
//        String output = "";
//
//        for(int i = 0; i <input.length ; i++){
//            output += input[i];
//            for (int j =1; (input[j] == input[i]); j++){
//                Array[] result = new Array[]
//            }
//        }
        String oneString = new String(input);
        String[] parts = oneString.split("(?<=(.))(?!\\1)");

        String result = "*** Output ***\n";
        for(String eachString: parts){
            result += eachString + ", ";
        }

        result = result.substring(0, result.length() - 2);

        return result;
    }

}
