/*
Discripition : Searching My baby name with Numerology 
Funcations:
1.Enter number baby Name.
2.Program will return the name is matching with my son numerology.
3.It work with different combination to finding the name match with Numerology
7.Want to search for another Name. 
 
*/
 
package tamilnadu.chennai;
 
import java.util.Scanner;
 
public class Gamesearch {
 
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         
        Gamesearch bs = new Gamesearch();
         
        bs.namesrch();
    }
 
 
    private void namesrch() {
        boolean search = true;
        while(search) {
            System.out.println("Please enter your name without space ");
            String name = sc.next();
            name = name.toUpperCase();
            int total = 0;
         
            char[] namech = name.toCharArray();
            for(int i = 0;i<name.length();i++)
            {
             
                switch(namech[i])
                {
                case 'A':
                case 'I':
                case 'J':
                case 'Q':
                case 'Y':
                    total = total + 1;
                    break;
                case 'B':
                case 'K':
                case 'R':
                    total = total + 2;
                    break;
                case 'C':
                case 'G':
                case 'L':
                case 'S':
                    total = total + 3;
                    break;
                case 'D':
                case 'M':
                case 'T':
                    total = total + 4;
                    break;
                case 'E':
                case 'H':
                case 'N':
                case 'X':
                    total = total + 5;
                    break;
                case 'U':
                case 'V':
                case 'W':
                    total = total + 6;
                    break;
                case 'O':
                case 'Z':
         
                    total = total + 7;
                    break;
                case 'F':
                case 'P':
         
                    total = total + 8;
                    break;
                 
                }
            }
            System.out.println("Given Name is : "+name);
            char notmatch = ' ';
            int[] sonastro = {14,23,41,50,15,24,33,42,51,19,37,46};
            for(int i = 0;i<sonastro.length;i++)
            {
                if(total == sonastro[i])
                {
                    System.out.println("Your son numerology pattern are matching " + name+ " and number is " + total);
                    notmatch = 'M';
                 
                }
                if(total + 3 == sonastro[i])
                {
                    System.out.println("Your son numerology pattern are matching " +" S."+name+" and numer is " + (total + 3));
                    notmatch = 'M';
                 
                }
                if(total + 5 == sonastro[i])
                {
                    System.out.println("Your son numerology pattern are matching " +" R.S."+name+" and numer is " + (total + 5));
                    notmatch = 'M';
                 
                }
                if(total + 7 == sonastro[i])
                {
                    System.out.println("Your son numerology pattern are matching " +" S.M."+name+" and numer is " + (total + 7));
                    notmatch = 'M';
                 
                }
     
            }
            if(notmatch != 'M')
            {
            System.out.println("Your son numerology pattern not matching ");
            }
            System.out.println("Press 1 to Search next name or 2 to exit");
            int srchnext = sc.nextInt();
            if(srchnext == 2)
            {
                search = false;
            }
        }
         
     
 
}