package mmin.al.list.linkedlist;

public class HeroNode {
    public int num;
    public String name;
    public String nickname;
    public HeroNode pre; //指向前一个节点
    public HeroNode next; //指向后一个节点

    public HeroNode(int num, String name, String nickname) {
        this.num = num;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +

                '}';
    }
}
