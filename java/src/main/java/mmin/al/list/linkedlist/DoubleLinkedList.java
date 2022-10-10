package mmin.al.list.linkedlist;

public class DoubleLinkedList {
    private HeroNode head = new HeroNode(0,"","");

    public HeroNode getHead(){
        return head;
    }

    public void add(HeroNode node) {
        //当不考虑编号的顺序时，找到当前链表的最后一个节点，讲next指向新节点
        HeroNode temp = head;
        //iterator the linklist to find the last element.
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        //point the last's next to added element
        temp.next = node;
        node.pre = temp;
    }

    //遍历
    public void print() {
        if (head.next == null) {
            System.out.println("there is no data...");
            return;
        }
        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void delete(HeroNode node){
        HeroNode temp = head.next;
        if(head.next == null){
            throw new RuntimeException("链表为空，不能删除!");
        }else{
            while ((temp) != null){
                if(temp.num == node.num){
                    if(temp.pre != null){
                        if(temp.next != null){
                            temp.next.pre = temp.pre;
                            temp.pre.next = temp.next;
                        }else{
                            temp.pre.next = null;
                        }
                    }else {
                        if(temp.next != null){
                            temp.next.pre = null;
                        }
                    }
                    break;
                }else{
                    temp = temp.next;
                }
            }
        }
    }
}

