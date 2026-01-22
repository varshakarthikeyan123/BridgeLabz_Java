package datastructures.stackqueuesandhashmap.hashmapandhashfunction;
import java.util.*;

class MyHashMap<K, V> {

    /*
     Node class for linked list in each bucket
    */
    class Node {
        K key;
        V value;
        Node next;
        Node(K k, V v){ key = k; value = v; }
    }

    int SIZE = 10; // number of buckets
    LinkedList<Node>[] map;

    @SuppressWarnings("unchecked")
    MyHashMap() {
        map = new LinkedList[SIZE];
        for(int i=0;i<SIZE;i++) map[i] = new LinkedList<>();
    }

    // hash function
    private int hash(K key){ return Math.abs(key.hashCode()) % SIZE; }

    // put key-value
    void put(K key, V value){
        int idx = hash(key);
        for(Node n: map[idx]){
            if(n.key.equals(key)){
                n.value = value; // update
                return;
            }
        }
        map[idx].add(new Node(key, value)); // insert
    }

    // get value by key
    V get(K key){
        int idx = hash(key);
        for(Node n: map[idx]){
            if(n.key.equals(key)) return n.value;
        }
        return null; // not found
    }

    // remove key
    void remove(K key){
        int idx = hash(key);
        Iterator<Node> it = map[idx].iterator();
        while(it.hasNext()){
            if(it.next().key.equals(key)){
                it.remove();
                return;
            }
        }
    }

    // display all key-value pairs
    void display(){
        for(int i=0;i<SIZE;i++){
            for(Node n: map[i])
                System.out.println(n.key + " -> " + n.value);
        }
    }

    public static void main(String[] args){
        MyHashMap<String,Integer> hm = new MyHashMap<>();
        hm.put("A", 10);
        hm.put("B", 20);
        hm.put("C", 30);

        System.out.println("Value of B: " + hm.get("B"));
        hm.put("B", 50);
        System.out.println("Updated value of B: " + hm.get("B"));

        hm.remove("A");

        System.out.println("All key-value pairs:");
        hm.display();
    }
}
