package mmin.al.list.linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addByNum(new Node(4,"Jimt","Jimmty"));
        list.addByNum(new Node(1,"Jim","Jimmy"));
        list.addByNum(new Node(3,"Mark","Marky"));
        list.addByNum(new Node(2,"Mike","Mikky"));
        list.print();
        System.out.println("---------分割线---------");
        list.update(new Node(5,"reead","reaaef"));
        list.print();


        list.delete(new Node(2,"Mike","Mikky"));
        System.out.println("---------分割线---------");

        list.print();
    }
}
