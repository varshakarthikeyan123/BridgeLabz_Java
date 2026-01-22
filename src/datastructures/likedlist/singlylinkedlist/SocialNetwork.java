package datastructures.likedlist.singlylinkedlist;
import java.util.Scanner;

/*
 Each User is a node.
 Each user has a linked list of Friend IDs.
*/

class Friend {
    int id;
    Friend next;
    Friend(int i){ id=i; }
}

class User {
    int id, age;
    String name;
    Friend friends;
    User next;

    User(int i,String n,int a){
        id=i; name=n; age=a;
    }
}

public class SocialNetwork {
    static User head=null;
    static Scanner sc=new Scanner(System.in);

    // add new user
    static void addUser(int id,String n,int a){
        User u=new User(id,n,a);
        u.next=head;
        head=u;
    }

    // find user
    static User getUser(int id){
        for(User t=head;t!=null;t=t.next)
            if(t.id==id) return t;
        return null;
    }

    // add friend connection
    static void addFriend(int u1,int u2){
        User a=getUser(u1), b=getUser(u2);
        if(a==null || b==null) return;
        Friend f1=new Friend(u2); f1.next=a.friends; a.friends=f1;
        Friend f2=new Friend(u1); f2.next=b.friends; b.friends=f2;
    }

    // remove friend
    static void removeFriend(int u1,int u2){
        removeOne(u1,u2);
        removeOne(u2,u1);
    }
    static void removeOne(int u,int f){
        User x=getUser(u);
        if(x==null) return;
        Friend t=x.friends, p=null;
        while(t!=null && t.id!=f){ p=t; t=t.next; }
        if(t==null) return;
        if(p==null) x.friends=t.next;
        else p.next=t.next;
    }

    // display friends
    static void showFriends(int id){
        User u=getUser(id);
        if(u==null) return;
        for(Friend f=u.friends;f!=null;f=f.next)
            System.out.print(f.id+" ");
        System.out.println();
    }

    // mutual friends
    static void mutual(int a,int b){
        User u1=getUser(a), u2=getUser(b);
        if(u1==null||u2==null) return;
        for(Friend f1=u1.friends;f1!=null;f1=f1.next)
            for(Friend f2=u2.friends;f2!=null;f2=f2.next)
                if(f1.id==f2.id) System.out.print(f1.id+" ");
        System.out.println();
    }

    // search
    static void search(){
        System.out.print("1 ID 2 Name: ");
        int c=sc.nextInt();
        if(c==1){
            int id=sc.nextInt();
            User u=getUser(id);
            if(u!=null) System.out.println(u.name+" "+u.age);
        }else{
            String n=sc.next();
            for(User t=head;t!=null;t=t.next)
                if(t.name.equals(n)) System.out.println(t.id+" "+t.age);
        }
    }

    // count friends
    static void count(){
        for(User u=head;u!=null;u=u.next){
            int c=0;
            for(Friend f=u.friends;f!=null;f=f.next) c++;
            System.out.println(u.name+" : "+c);
        }
    }

    public static void main(String[] args){
        addUser(1,"Amit",20);
        addUser(2,"Neha",21);
        addUser(3,"Ravi",22);
        addUser(4,"Sara",20);

        addFriend(1,2);
        addFriend(1,3);
        addFriend(2,3);
        addFriend(2,4);

        System.out.print("Friends of 2: "); showFriends(2);
        System.out.print("Mutual(1,2): "); mutual(1,2);
        count();
    }
}
