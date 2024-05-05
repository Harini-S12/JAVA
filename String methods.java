import java.util.*;
public class Main{
    public static void main(String[] args){
        
        String str="Terv,top!";
        int length=str.length();   //length method to see the length of the string
        System.out.println(length);
        
        char ind=str.charAt(5);
        System.out.println(ind);   //charat method to see specfic character at string
        
        String substring = str.substring(6);
        System.out.println(substring);   //substring method after 6th character
        
        String substring1 = str.substring(4,8);
        System.out.println(substring1); //substring between the 4th and 8th character
        
        int indexofchar=str.indexOf('v');
        System.out.println(indexofchar); //character to index position method
        
        int idx=str.indexOf('o',11);
        System.out.println(idx);     //char to index position method with in a size 
        
        int d=str.lastIndexOf('v');
        System.out.println(d);      //position of last character
        
        String str2=str.concat("super");
         System.out.println(str2); // concat of new string 
         
         String str3=str.replace('p','D');
          System.out.println(str3); //replace of character with other character
          
        String str4=str.toLowerCase();
        System.out.println(str4); //it check all string are in lowercase and change into lowercase
        
         String str5=str.toUpperCase();
        System.out.println(str5);  //it change all in toUpperCase
        
        String str6="  top freshers technology private limited  ".trim();
        System.out.println(str6);  // trim the fornt and back extra space
        
        String str7[]=str.split(",");
        for(String s:str7)
        System.out.println(s);  //output in loop variable(),it erase the 
        
        Boolean str8=str.startsWith("Terv");
        System.out.println(str8); //starts with given string means true
        
        Boolean str9=str.endsWith("top");
        System.out.println(str9);  //ends with given string
        
        String str10="Terv,top!";
        Boolean str11=str.equals(str10);
        System.out.println(str11); //comparing string and the get the o/p in Boolean
        
        Boolean str12=str.equalsIgnoreCase("Terv,top!");
        System.out.println(str12); //it remove all case and give in same case and it will equalsIgnoreCase
        
        String str13="Terv,top!";
        int str14=str.compareTo(str13);
        System.out.println(str14);
        
        String str15="TERV,TOP!";
        int str16=str.compareToIgnoreCase(str15);
        System.out.println(str16);
        System.out.println(str.isEmpty());//Check if empty or not bcz the i/p has a char
        
        char[] str17=str.toCharArray();
        System.out.println(str17);
    }
}