package lab3;
import java.util.*;
import java.io.*;
public class LAb3Exer5 {
	public static void main(String[] args) throws IOException {
		int line=1,word=0;           
        char ch;
        Scanner scr=new Scanner(System.in);
        System.out.print("Enter File name: ");
        String str="C:\\Users\\Meghana_Puvvada\\Desktop\\Sampletxt.txt";
        FileInputStream f =new FileInputStream(str);
        int n=f.available();
        for(int i=0;i<n;i++)
        {
                    ch=(char)f.read();
                    if(ch=='\n')
                    	line++;
                    else if(ch==' ')
                         word++;
                                                       
        }
        System.out.println("\nNumber of lines : "+line);
        System.out.println("\nNumber of words : "+(line+word));
        System.out.println("\nNumber of characters : "+n);
        
	
	}

}
