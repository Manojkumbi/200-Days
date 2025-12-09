package days200;

public class StringExample {
 public static void main(String[] args) {
	 
     String str1 = "Hello";
     String str2 = "World";

     System.out.println("string 1: "+str1+" string 2: "+str2+"\n");
     
     // Concatenation
     String concatStr = str1.concat(" ").concat(str2);
     System.out.println("Concatenated string: " + concatStr+"\n");

     // Length
     System.out.println("Length of concatenated string: " + concatStr.length()+"\n");

     // Substring
     String subStr = concatStr.substring(6);
     System.out.println("Substring from index 6: " + subStr+"\n");

     // Index of
     int index = concatStr.indexOf("World");
     System.out.println("Index of 'World': " + index+"\n");

     // Replace
     String replacedStr = concatStr.replace("Hello", "Hola");
     System.out.println("Replaced string: " + replacedStr+"\n");

     // Split
     String[] splitArray = concatStr.split(" ");
     System.out.print("Split string array: \n");
     for (String s : splitArray) {
         System.out.print(s + "\n");
     }
 }
}
