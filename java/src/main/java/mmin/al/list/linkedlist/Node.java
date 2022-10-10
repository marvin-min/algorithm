package mmin.al.list.linkedlist;

public class Node {
    public int num;
    public String name;
    public String nickname;
    public Node next;

    public Node(int num, String name, String nickname) {
        this.num = num;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Node{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +

                '}';
    }
}
