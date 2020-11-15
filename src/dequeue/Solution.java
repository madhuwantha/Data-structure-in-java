package dequeue;

import java.io.*; // Do not import anything else.

class Deque {

    Node head; // head of list
    Node tail; // tail of list

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) { data = d; }
    }



    // construct an empty deque
    public Deque(){

    }

    // return true if the deque is empty, otherwise, return false
    public boolean isEmpty(){
        return head == null;
    }

    // add the item to the head
    public void addFirst(int item){

        Node new_Node = new Node(item);

        new_Node.next = head;
        new_Node.prev = null;

        if (head != null)
            head.prev = new_Node;

        head = new_Node;
        if (tail == null){
            tail = head;
        }
    }

    // add the item to the tail
    public void addLast(int item){
        if (head == null){
            addFirst(item);
        }else {
            Node new_Node = new Node(item);
            new_Node.prev = tail;
            new_Node.next = null;
            tail.next = new_Node;
            tail = new_Node;
        }
    }

    // remove and return the item from the head
    public int removeFirst(){
        int rVal ;
        if(head == null) {
            return Integer.parseInt(null);
        }
        else {
            rVal = head.data;
            if(head != tail) {
                head = head.next;
                head.prev = null;
            }
            else {
                head = tail = null;
            }
        }
        return rVal;
    }

    // remove and return the item from the tail
    public int removeLast(){
        int rVal ;
        if(tail == null) {
            return Integer.parseInt(null);
        }
        else {
            rVal = tail.data;
            if(head != tail) {
                tail = tail.prev;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
        }
        return rVal;
    }

}

/*
* Do NOT modify the main function
* */
public class Solution{
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque deque = new Deque();

        int NumOfQueries = Integer.parseInt(bufferedReader.readLine().trim());
        while(NumOfQueries-- > 0){
            String[] query = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            if(query[0].equals("addFirst")){
                deque.addFirst(Integer.parseInt(query[1]));
            }
            else if(query[0].equals("addLast")){
                deque.addLast(Integer.parseInt(query[1]));
            }
            else if(query[0].equals("removeFirst")){
                bufferedWriter.write(deque.removeFirst() + "\n");
            }
            else if(query[0].equals("removeLast")){
                bufferedWriter.write(deque.removeLast()+ "\n");
            }
            else if(query[0].equals("isEmpty")){
                if(deque.isEmpty())
                    bufferedWriter.write("Yes\n");
                else
                    bufferedWriter.write("No\n");
            }
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
