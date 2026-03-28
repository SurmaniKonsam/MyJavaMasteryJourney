package org.example.TwentyLPAPackage.Collection.LinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Node {
    int value;
    Node next;

    public static void main(String[] args) {
        Node node = new Node();
        node.value = 1;
        node.next = null;
        System.out.println(node.value);
        List<String> stringLnkLst = new LinkedList<>();
        stringLnkLst.add("Apple");

    }
}
