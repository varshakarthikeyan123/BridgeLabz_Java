package datastructures.likedlist.circularlinkedlist;
import java.util.Scanner;

/*
 Circular Linked List Ticket Reservation
 Each ticket has:
 ID, Customer Name, Movie Name, Seat Number, Booking Time
*/

class Ticket {
    int id;
    String customer, movie, seat, time;
    Ticket next;

    Ticket(int i,String c,String m,String s,String t){
        id=i; customer=c; movie=m; seat=s; time=t;
    }
}

public class TicketSystem {
    static Ticket head=null, tail=null;
    static Scanner sc=new Scanner(System.in);

    // add ticket at end
    static void add(Ticket t){
        if(head==null){
            head=tail=t;
            t.next=t;
        } else {
            tail.next=t;
            t.next=head;
            tail=t;
        }
    }

    // remove ticket by ID
    static void remove(int id){
        if(head==null) return;
        Ticket cur=head, prev=tail;
        do {
            if(cur.id==id){
                if(cur==head) head=head.next;
                if(cur==tail) tail=prev;
                prev.next=cur.next;
                return;
            }
            prev=cur;
            cur=cur.next;
        } while(cur!=head);
    }

    // display all tickets
    static void show(){
        if(head==null) return;
        Ticket t=head;
        do {
            System.out.println(t.id+" "+t.customer+" "+t.movie+" "+t.seat+" "+t.time);
            t=t.next;
        } while(t!=head);
    }

    // search by customer or movie
    static void search(){
        System.out.print("1 Customer  2 Movie: ");
        int c=sc.nextInt(); sc.nextLine();
        String s=sc.nextLine();
        if(head==null) return;
        Ticket t=head;
        do {
            if((c==1 && t.customer.equals(s)) || (c==2 && t.movie.equals(s)))
                System.out.println(t.id+" "+t.customer+" "+t.movie+" "+t.seat+" "+t.time);
            t=t.next;
        } while(t!=head);
    }

    // total tickets
    static void total(){
        if(head==null){ System.out.println("Total Tickets = 0"); return; }
        int c=0; Ticket t=head;
        do { c++; t=t.next; } while(t!=head);
        System.out.println("Total Tickets = "+c);
    }

    public static void main(String[] args){
        while(true){
            System.out.println("1Add 2Remove 3Show 4Search 5Total 0Exit");
            int c=sc.nextInt(); sc.nextLine();
            if(c==0) break;

            if(c==1){
                System.out.print("ID Customer Movie Seat Time: ");
                add(new Ticket(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next()));
            }
            else if(c==2){ System.out.print("ID: "); remove(sc.nextInt()); }
            else if(c==3) show();
            else if(c==4) search();
            else if(c==5) total();
        }
    }
}
