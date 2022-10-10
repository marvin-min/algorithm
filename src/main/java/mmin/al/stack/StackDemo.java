package mmin.al.stack;

import mmin.al.list.linkedlist.DoubleLinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
       Stack stack = new Stack();
       stack.add(1);
       stack.add(2);
       stack.add(3);
       stack.add(4);
       stack.peek();
        System.out.println(stack);
    }
}
