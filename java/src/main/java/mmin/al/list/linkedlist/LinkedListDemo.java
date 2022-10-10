package mmin.al.list.linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
//       testDouble();
        testJosephusCircle();
    }

    private static void testJosephusCircle(){
        JosephusCircle circle = new JosephusCircle();
//        circle.add(5);
//        circle.print();
        circle.kill(10,20,225);
//        circle.print();
    }
    private static void testDouble(){
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(new HeroNode(1,"bbb","bbb"));
        list.add(new HeroNode(2,"ccc","ccc"));
        list.add(new HeroNode(3,"ddd","ddd"));
        list.add(new HeroNode(4,"eee","eee"));
        list.print();

        list.delete(new HeroNode(2,"ccc","ccc"));
        list.delete(new HeroNode(4,"ccc","ccc"));
        list.print();
    }

    private static void testSingle(){
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

        System.out.println("\r\n\n\n");
        System.out.println("---------原始数据---------");

        list.print();
        System.out.println("---------翻转后数据---------");
        list.reverse();;
        list.print();
    }
}
