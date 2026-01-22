package datastructures.likedlist.singlylinkedlist;
import java.util.Scanner;

/*
 Singly Linked List Inventory System
 Each item has:
 ID, Name, Quantity, Price
*/

class Item {
    int id, qty;
    String name;
    double price;
    Item next;

    Item(int i, String n, int q, double p) {
        id=i; name=n; qty=q; price=p;
    }
}

public class InventoryList {
    static Item head = null;
    static Scanner sc = new Scanner(System.in);

    // add at beginning
    static void addBeg(Item i) {
        i.next = head;
        head = i;
    }

    // add at end
    static void addEnd(Item i) {
        if (head == null) { head = i; return; }
        Item t = head;
        while (t.next != null) t = t.next;
        t.next = i;
    }

    // add at position
    static void addPos(Item i, int pos) {
        if (pos == 1) { addBeg(i); return; }
        Item t = head;
        for (int x=1; x<pos-1 && t!=null; x++) t = t.next;
        if (t != null) { i.next = t.next; t.next = i; }
    }

    // delete by id
    static void delete(int id) {
        if (head == null) return;
        if (head.id == id) { head = head.next; return; }
        Item t = head;
        while (t.next != null && t.next.id != id) t = t.next;
        if (t.next != null) t.next = t.next.next;
    }

    // update quantity
    static void update(int id, int q) {
        for (Item t=head; t!=null; t=t.next)
            if (t.id == id) t.qty = q;
    }

    // search
    static void search() {
        System.out.print("1 ID  2 Name: ");
        int c = sc.nextInt();
        if (c == 1) {
            int id = sc.nextInt();
            for (Item t=head;t!=null;t=t.next)
                if (t.id==id) System.out.println(t.name+" "+t.qty+" "+t.price);
        } else {
            String n = sc.next();
            for (Item t=head;t!=null;t=t.next)
                if (t.name.equals(n)) System.out.println(t.id+" "+t.qty+" "+t.price);
        }
    }

    // total value
    static void total() {
        double sum=0;
        for (Item t=head;t!=null;t=t.next)
            sum += t.qty * t.price;
        System.out.println("Total Inventory Value = " + sum);
    }

    // sort by name or price
    static void sort() {
        System.out.print("1 Name  2 Price: ");
        int c = sc.nextInt();
        System.out.print("1 Asc  2 Desc: ");
        int d = sc.nextInt();

        for (Item i=head;i!=null;i=i.next)
            for (Item j=i.next;j!=null;j=j.next) {
                boolean swap = false;
                if (c==1) swap = d==1 ? i.name.compareTo(j.name)>0 : i.name.compareTo(j.name)<0;
                else swap = d==1 ? i.price>j.price : i.price<j.price;

                if (swap) {
                    int id=i.id, q=i.qty; double p=i.price; String n=i.name;
                    i.id=j.id; i.qty=j.qty; i.price=j.price; i.name=j.name;
                    j.id=id; j.qty=q; j.price=p; j.name=n;
                }
            }
    }

    // display
    static void show() {
        for (Item t=head;t!=null;t=t.next)
            System.out.println(t.id+" "+t.name+" "+t.qty+" "+t.price);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1Beg 2End 3Pos 4Del 5Update 6Search 7Total 8Sort 9Show 0Exit");
            int c = sc.nextInt();
            if (c==0) break;

            if (c<=3) {
                System.out.print("ID Name Qty Price: ");
                Item i = new Item(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble());
                if (c==1) addBeg(i);
                else if (c==2) addEnd(i);
                else { System.out.print("Pos: "); addPos(i,sc.nextInt()); }
            }
            else if (c==4) { System.out.print("ID: "); delete(sc.nextInt()); }
            else if (c==5) { System.out.print("ID Qty: "); update(sc.nextInt(),sc.nextInt()); }
            else if (c==6) search();
            else if (c==7) total();
            else if (c==8) sort();
            else if (c==9) show();
        }
    }
}

