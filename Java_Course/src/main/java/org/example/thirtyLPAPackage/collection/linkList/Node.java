package org.example.thirtyLPAPackage.collection.linkList;

class DoubleLinkList{
    int value;
    DoubleLinkList next;
    DoubleLinkList prev;

    public DoubleLinkList(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DoubleLinkList{" +
                "value=" + value +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}

public class Node {
    int value;
    Node next;

    public static void main(String[] args) {

        //Designing double link list
        DoubleLinkList nodeFirst = new DoubleLinkList(1);
        DoubleLinkList nodeMid = new DoubleLinkList(2);
        DoubleLinkList nodeThird = new DoubleLinkList(3);
        nodeMid.prev = nodeFirst;
        nodeMid.next = nodeThird;

        System.out.println(nodeMid);



    }
}
