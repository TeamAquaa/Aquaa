import java.io.*;
import java.util.*;
public class CelebrityNames
{
    public static void main(String args[]) throws IOException
    { 
        Scanner sf = new Scanner(new File("CelebrityData.txt"));

        int maxIndx = -1; //-1 makes the first increment 0
        String text[] = new String[1000]; //declare more than needed

        while(sf.hasNext( ))
        { 
            maxIndx++;
            text[maxIndx] = sf.nextLine( );
        } 
        //maxIndx is now the highest index of text[], = -1 if no text lines 
        sf.close( ); //close the file when finished

        String reversedName[] = new String[maxIndx + 1];
        for (int j = 0; j <= maxIndx; j++)
        { 
            Scanner sc = new Scanner( text[j] );
            String firstName = sc.next( );
            String middleName = sc.next( );
            String lastName = sc.next( );
            String birthDay = sc.next ( );
            reversedName[j] = lastName + ", " + firstName + " " + middleName + " -- " + birthDay;
        } 

        Arrays.sort(reversedName);
        for (int j =0; j <= maxIndx; j++)
        { 
            System.out.println (reversedName[j]);
        } 
    }
}