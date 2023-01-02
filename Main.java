package linked_list;

//
//public class Main {
//    private String pattern;
//
//
//    public static void main(String[] args) {
//
////        System.out.println(s1);
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        String pattern = "((?=.*\\n){0,100})([a-z]+@[a-z]+.com)";
//
//        List<String> newStr=new ArrayList<>();
//newStr.add()
//    while (n != 0) {
//
//            String s1 = sc.nextLine();
//
//
//            Pattern patt = Pattern.compile(pattern);
//            Matcher matcher = patt.matcher(s1);
//            if (matcher.find()) {
////                return matcher.group(); // you can get it from desired index as well
//                System.out.print(matcher.group());
//                System.out.print(";");
//            }
//
//
//            n--;
//        }
//
////        Scanner sc=new Scanner(System.in);
////        List<String> myString=new ArrayList<>();
////
////        int lines=sc.nextInt();
////        sc.nextLine();
////while(lines-- >0){
////    myString.add(sc.nextLine());
////}
////
////int word=sc.nextInt();
////while(word-- >0){
////    String subword=sc.next();
////    String regex="\\b"+ subword +"\\b";
////
////    Pattern r=Pattern.compile(regex);
////    int count=0;
////    for(String myStr:myString){
////     Matcher m=r.matcher(myStr);
////
//////    }
////    System.out.println(count);
////        }
////        String regex = "(\\b\\w+\\b)(\\s+\\b\\1\\b){1,}";
////
////        String input = in.nextLine();
////
////        Matcher m = p.matcher(input);
////
////        Pattern.matches()
////        if(s1.length()==0){
////            m.group()
////            System.out.println("The length is 0");
////            return;
////        }
//
////        String[] newStr=s1.split("[^a-zA-Z]+");
////
////        for(String str :newStr){
////            System.out.println(str);
////        }
//
//
////        PatternSyntaxException
//    }
//}
//
// class MyRegex{
//private String pattern;
//
//
//}
////        ArrayList<Integer> intList=new ArrayList<Integer>();
////
////
////        intList.add(1);
////        intList.add(2);
////        intList.add(3);
////        intList.add(4);
////
////        for(int i=0;i<intList.size();i++){
////            System.out.println(i + " : "+intList.get(i) );
////        }
////
////        intList.add(1,5);
////        for(int i=0;i<intList.size();i++){
////            System.out.println(i + " : "+intList.get(i) );
////        }
////
////
////
////        ArrayList<Album> albums = new ArrayList<>();
////
////        Album album = new Album("Stormbringer", "Deep Purple");
////        album.addSong("Stormbringer", 4.6);
////        album.addSong("Love don't mean a thing", 4.22);
////        album.addSong("Holy man", 4.3);
////        album.addSong("Hold on", 5.6);
////        album.addSong("Lady double dealer", 3.21);
////        album.addSong("You can't do it right", 6.23);
////        album.addSong("High ball shooter", 4.27);
////        album.addSong("The gypsy", 4.2);
////        album.addSong("Soldier of fortune", 3.13);
////        albums.add(album);
////
////        album = new Album("For those about to rock", "AC/DC");
////        album.addSong("For those about to rock", 5.44);
////        album.addSong("I put the finger on you", 3.25);
////        album.addSong("Lets go", 3.45);
////        album.addSong("Inject the venom", 3.33);
////        album.addSong("Snowballed", 4.51);
////        album.addSong("Evil walks", 3.45);
////        album.addSong("C.O.D.", 5.25);
////        album.addSong("Breaking the rules", 5.32);
////        album.addSong("Night of the long knives", 5.12);
////        albums.add(album);
////
////
////        List<Song> playList = new ArrayList<>();
////        albums.get(0).addToPlayList("You can't do it right", playList);
////        albums.get(0).addToPlayList("Holy man", playList);
////        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
////        albums.get(0).addToPlayList(9, playList);
////        albums.get(1).addToPlayList(3, playList);
////        albums.get(1).addToPlayList(1, playList);
////        albums.get(1).addToPlayList(24, playList);  // There is no track 24
////
////    }
////
////
////
////
////
////
////}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String pattern = "\\b(\\w*(\\.\\w*)?(@)\\w*\\.(\\w*\\.)*?(com|in|org))\\b";
        String a="";
        List<String> newStr=new ArrayList<>();
        newStr.sort();

        while (n != 0) {

            String s1 = sc.nextLine();


            Pattern patt = Pattern.compile(pattern);
            Matcher matcher = patt.matcher(s1);

            if (matcher.find()) {
//                return matcher.group(); // you can get it from desired index as well
                // a=a+matcher.group();
                //             b.add
                newStr.add(matcher.group());

            }




            n--;
        }
        int len=a.length();
//
//        public static void printArray(String str[])
//        {
//            for (String string : newStr)
//                System.out.print(string + " ");
//            // System.out.println();
//        }

        // System.out.println(a.substring(0,len-1));
    }
}