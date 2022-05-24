package mmin.al.list.linkedlist;

public class SingleLinkedList {
    //先初始化一个头节点，头节点不动,头节点不存放任何数据
    private Node head = new Node(0,"","");
    public void add(Node node){
        //当不考虑编号的顺序时，找到当前链表的最后一个节点，讲next指向新节点
        Node temp = head;
        //iterator the linklist to find the last element.
        while(true) {
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        //point the last's next to added element
        temp.next = node;
    }

    /**
     * 根据顺序添加
     * @param node
     */
    public void addByNum(Node node){
        Node temp = head;
        boolean flag = false;
        while(true) {
            if(temp.next == null){//没有，是空的 或者找到了位置
                break;
            }
            if(temp.next.num > node.num){//找到合适位置
                break;
            } else if(temp.next.num == node.num){
                flag = true ;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.printf("数据已经存%d\r\n", node.num);
        }else{
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void delete(Node node){
        Node temp = head;
        boolean flag = true;
        if(temp.next == null){
            System.out.println("链表为空，不能删除");
            return;
        }

        while(true){
            if(temp.next == null){
                System.out.printf("没有找到要删除的元素%d\r\n", node.num);
                break;
            }
            if(temp.next.num == node.num){
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if(flag){
            if(temp.next != null) {
                if(temp.next.next != null) {
                    temp.next = temp.next.next;
                }else{
                    temp.next = null;
                }
            }
        }
    }
    //修改
    public void update(Node node){
        Node temp = head;
        if(temp.next == null){
            System.out.println("链表为空，不能修改");
            return;
        }

        while(true){
            if(temp.next == null){
                System.out.printf("没有找到要修改的元素%d\r\n", node.num);
                break;
            }
            if(temp.next.num == node.num){
                break;
            }
            temp = temp.next;
        }
        if(temp.next != null) {
            if(temp.next.next != null) {
                node.next = temp.next.next;
            }
            temp.next = node;
        }
    }

    public void print(){
        if(head.next == null){
            System.out.println("there is no data...");
            return;
        }
        Node temp = head.next;
        while(true) {
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
