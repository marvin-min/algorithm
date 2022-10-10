package mmin.al.list.linkedlist;

public class Person {
    //编号
    private int no;
    private Person next;

    public Person(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Person{" +
                "no=" + no +
                '}';
    }
}
