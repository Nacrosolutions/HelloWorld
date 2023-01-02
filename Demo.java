package linked_list;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //Create a Linked List
        LinkedList<String> placesToVisit=new LinkedList<>();

        addInOrder(placesToVisit,"Sydeny");
        addInOrder(placesToVisit,"Palmpur");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Daroh");
        addInOrder(placesToVisit,"Marhoon");

        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static  void printList(List<String> linkList){


        Iterator<String> i =linkList.iterator();

        while(i.hasNext()){
            System.out.println("Now visiting "+ i.next());
        }

        System.out.println("=================================");

    }

    private    static  boolean addInOrder(LinkedList<String> linkList,String city) {
        ListIterator<String> stringListIterator = linkList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(city);
            System.out.println(comparison);
            if (comparison == 0) {
                //equal,do not add
                System.out.println(city + " is already included a the destination");

                return false;
            } else if (comparison > 0) {
                //newCity should appear befor this

                stringListIterator.previous();
                stringListIterator.add(city);

                return true;
            } else if (comparison < 0) {

            }

        }
        System.out.println("Nabhu");
        stringListIterator.add(city);
        return true;


    }

private static void visit(LinkedList city){
    Scanner scanner =new Scanner(System.in);

    boolean quit=false;
    boolean goingForward=true;

    ListIterator<String> listIterator = city.listIterator();

    if(city.isEmpty()){
        System.out.println("No city in the itenerary");
        return;
    }
    else {
        System.out.println("Now visiting "+listIterator.next());
        printMenu();
    }

    while(!quit){
        int action= scanner.nextInt();
        scanner.nextLine();

        switch (action){
            case 0:
                System.out.println("Hoilday (vacation) Over");
                quit=true;
                break;
            case 1:
                if(!goingForward){
                    if(listIterator.hasNext()){
                        listIterator.next();
                    }
                    goingForward=true;
                }
                if(listIterator.hasNext()){
                    System.out.println("Now Visiting "+listIterator.next());

                }
                else {
                    System.out.println("Reached the end of List");
                    goingForward=false;
                }
                break;
            case 2:
                if(goingForward){
                    if(listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                    goingForward=false;
                }
                if(listIterator.hasPrevious()){
                    System.out.println("Npow visiting "+listIterator.previous());
                }
                else {
                    System.out.println("We are at the start of list");
                    goingForward=true;
                }
                break;
            case 4:
                printMenu();
                break;
        }
    }


}

private static void printMenu() {
    System.out.println("Available actions :\npress");
    System.out.println("0 = to quit\n" +
                        "1 - go to next city\n" +
                        "2 - go to previous place" +
                         "3- print menu option");

}


}

