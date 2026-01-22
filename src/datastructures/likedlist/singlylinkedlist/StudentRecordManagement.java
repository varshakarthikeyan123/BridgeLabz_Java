package datastructures.likedlist.singlylinkedlist;
import java.util.Scanner;
/*  Student record using Singly Linked List  */
class Node {
    int roll, age;
    String name, grade;
    Node next;

    Node(int r, String n, int a, String g) {
        roll = r; name = n; age = a; grade = g;
    }
}
public class StudentRecordManagement {
    static Node head;
    static Scanner sc = new Scanner(System.in);

    // add at beginning
    static void addBeg(int r,String n,int a,String g){
        Node x=new Node(r,n,a,g);
        x.next=head; head=x;
    }

    // add at end
    static void addEnd(int r,String n,int a,String g){
        Node x=new Node(r,n,a,g);
        if(head==null){ head=x; return; }
        Node t=head; while(t.next!=null) t=t.next;
        t.next=x;
    }

    // add at position
    static void addPos(int p,int r,String n,int a,String g){
        if(p==1){ addBeg(r,n,a,g); return; }
        Node x=new Node(r,n,a,g);
        Node t=head;
        for(int i=1;i<p-1 && t!=null;i++) t=t.next;
        if(t!=null){ x.next=t.next; t.next=x; }
        else System.out.println("Invalid Position");
    }

    // delete by roll
    static void del(int r){
        if(head==null) return;
        if(head.roll==r){ head=head.next; return; }
        Node t=head;
        while(t.next!=null && t.next.roll!=r) t=t.next;
        if(t.next!=null) t.next=t.next.next;
    }

    // search
    static void search(int r){
        for(Node t=head;t!=null;t=t.next)
            if(t.roll==r) System.out.println(t.name+" "+t.grade);
    }

    // update grade
    static void update(int r,String g){
        for(Node t=head;t!=null;t=t.next)
            if(t.roll==r) t.grade=g;
    }

    // display
    static void show(){
        for(Node t=head;t!=null;t=t.next)
            System.out.println(t.roll+" "+t.name+" "+t.age+" "+t.grade);
    }

    public static void main(String[] args){
        while(true){
            System.out.println("1Beg 2End 3Pos 4Del 5Search 6Update 7Show 0Exit");
            int c=sc.nextInt();

            if(c==0) break;

            if(c<=3){
                System.out.print("Roll Name Age Grade: ");
                int r=sc.nextInt(), a=sc.nextInt();
                String n=sc.next(), g=sc.next();
                if(c==1) addBeg(r,n,a,g);
                else if(c==2) addEnd(r,n,a,g);
                else{ System.out.print("Pos: "); addPos(sc.nextInt(),r,n,a,g); }
            }
            else if(c==4){ System.out.print("Roll: "); del(sc.nextInt()); }
            else if(c==5){ System.out.print("Roll: "); search(sc.nextInt()); }
            else if(c==6){ System.out.print("Roll Grade: "); update(sc.nextInt(),sc.next()); }
            else if(c==7) show();
        }
    }
}
