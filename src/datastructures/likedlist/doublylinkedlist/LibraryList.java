package datastructures.likedlist.doublylinkedlist;
import java.util.Scanner;

/*
 Doubly Linked List Library System
 Each book has:
 ID, Title, Author, Genre, Availability
*/

class Book {
    int id;
    String title, author, genre, status;
    Book next, prev;

    Book(int i,String t,String a,String g,String s){
        id=i; title=t; author=a; genre=g; status=s;
    }
}

public class LibraryList {
    static Book head=null, tail=null;
    static Scanner sc=new Scanner(System.in);

    // add at beginning
    static void addBeg(Book b){
        if(head==null) head=tail=b;
        else{
            b.next=head;
            head.prev=b;
            head=b;
        }
    }

    // add at end
    static void addEnd(Book b){
        if(head==null) head=tail=b;
        else{
            tail.next=b;
            b.prev=tail;
            tail=b;
        }
    }

    // add at position
    static void addPos(Book b,int pos){
        if(pos==1){ addBeg(b); return; }
        Book t=head;
        for(int i=1;i<pos-1 && t!=null;i++) t=t.next;
        if(t==null) return;
        b.next=t.next;
        if(t.next!=null) t.next.prev=b;
        t.next=b;
        b.prev=t;
        if(b.next==null) tail=b;
    }

    // delete by id
    static void delete(int id){
        Book t=head;
        while(t!=null && t.id!=id) t=t.next;
        if(t==null) return;
        if(t==head) head=head.next;
        if(t==tail) tail=tail.prev;
        if(t.prev!=null) t.prev.next=t.next;
        if(t.next!=null) t.next.prev=t.prev;
    }

    // search by title or author
    static void search(){
        System.out.print("1 Title  2 Author: ");
        int c=sc.nextInt();
        String s=sc.next();
        for(Book t=head;t!=null;t=t.next)
            if((c==1 && t.title.equals(s)) || (c==2 && t.author.equals(s)))
                System.out.println(t.id+" "+t.title+" "+t.status);
    }

    // update availability
    static void update(int id,String st){
        for(Book t=head;t!=null;t=t.next)
            if(t.id==id) t.status=st;
    }

    // display forward
    static void show(){
        for(Book t=head;t!=null;t=t.next)
            System.out.println(t.id+" "+t.title+" "+t.author+" "+t.genre+" "+t.status);
    }

    // display reverse
    static void showRev(){
        for(Book t=tail;t!=null;t=t.prev)
            System.out.println(t.id+" "+t.title+" "+t.author+" "+t.genre+" "+t.status);
    }

    // count books
    static void count(){
        int c=0;
        for(Book t=head;t!=null;t=t.next) c++;
        System.out.println("Total Books = "+c);
    }

    public static void main(String[] args){
        while(true){
            System.out.println("1Beg 2End 3Pos 4Del 5Search 6Update 7Show 8Rev 9Count 0Exit");
            int c=sc.nextInt();
            if(c==0) break;

            if(c<=3){
                System.out.print("ID Title Author Genre Status: ");
                Book b=new Book(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next());
                if(c==1) addBeg(b);
                else if(c==2) addEnd(b);
                else{ System.out.print("Pos: "); addPos(b,sc.nextInt()); }
            }
            else if(c==4){ System.out.print("ID: "); delete(sc.nextInt()); }
            else if(c==5) search();
            else if(c==6){ System.out.print("ID Status: "); update(sc.nextInt(),sc.next()); }
            else if(c==7) show();
            else if(c==8) showRev();
            else if(c==9) count();
        }
    }
}

