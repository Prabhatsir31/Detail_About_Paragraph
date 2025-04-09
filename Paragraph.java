import java.io.*;
import java.util.*;
public class Paragraph {
    static int c,word,vowel=0,consonant=0,digit=0,symbol=0,space=0;
    void character(String s){
        int lenc,lenw,i;
        String ss = s.toLowerCase();
        char[] ch = ss.toCharArray();
        String[] words = s.split(" ");
        lenw = words.length;
        word+=lenw;
        lenc = s.length();
        for(i=0;i<lenc;i++){
            if(ch[i] != ' '){
                c++;
            }
        }
        for(i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
                vowel++;
            else if(ch[i]=='b' || ch[i]=='c' || ch[i]=='d' || ch[i]=='f' || ch[i]=='g' || ch[i]=='h' || ch[i]=='j' || ch[i]=='k' || ch[i]=='l' || ch[i]=='m' || ch[i]=='n' || ch[i]=='p' || ch[i]=='q' || ch[i]=='r' || ch[i]=='s' || ch[i]=='t' || ch[i]=='v' || ch[i]=='w' || ch[i]=='x' || ch[i]=='y' || ch[i]=='z')
                consonant++;
            else if(ch[i]=='0' || ch[i]=='1' || ch[i]=='2' || ch[i]=='3' || ch[i]=='4' || ch[i]=='5' || ch[i]=='6' || ch[i]=='7' || ch[i]=='8' || ch[i]=='9')
                digit++;
            else if(ch[i]==' ')
                space++;
            else 
                symbol++;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String file,content;
        int lines=0;
        System.out.print("Enter the name of File : ");
        file = s.nextLine();
        Paragraph obj = new Paragraph();
        try{
            File fileobj = new File(file);
            Scanner fileread = new Scanner(fileobj);
            while(fileread.hasNextLine()){
                content = fileread.nextLine();
                lines++; //to count lines
                obj.character(content);
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        System.out.println("Lines : "+lines);
        System.out.println("Characters : "+c);
        System.out.println("Words : "+word);
        System.out.println("Vowels : "+vowel);
        System.out.println("Consonants : "+consonant);
        System.out.println("Digits : "+digit);
        System.out.println("Symbols : "+symbol);
    }
}
