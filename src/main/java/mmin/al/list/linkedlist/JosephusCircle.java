package mmin.al.list.linkedlist;

public class JosephusCircle {
    private Person first = null;
    private Person head = null;

    public void kill(int start, int skip, int numInCircle) {
        this.add(numInCircle);
        if(first == null || start > numInCircle || skip > numInCircle){
            System.out.println("参数错误");
            return;
        }
        Person helper = first;
        ///初始化helper，把helper移动到前一位
        while(true){
            if(helper.getNext() == first){
                break;
            }
            helper = helper.getNext();
        }

        while(first.getNo() != start){
            helper = helper.getNext();
            first = first.getNext();
        }

        int skipCounter = 1;
        while(true){
            if(helper == first){ //只剩余一个元素
                System.out.printf("第%s出圈\r\n", first.getNo());
                break;
            }
            skipCounter++;
            helper = helper.getNext();
            first = first.getNext();

            if(skipCounter == skip) {
                skipCounter = 1;
//                fi
                System.out.printf("第%s出圈\r\n", first.getNo());
                helper.setNext(first.getNext());
                first = first.getNext();
            }

        }
    }

    public void add(int nums) {
        Person current = null;
        if(nums < 1){
            System.out.println("不能添加小于1的人数");
            return;
        }
        for (int i = 1; i <= nums; i++) {
            Person p = new Person(i);
            if(i==1){
                first = p;
                first.setNext(first);
                current = first;
            } else {
                current.setNext(p);
                p.setNext(first);
                current = p;
            }
        }
    }

    public void print(){
        if(first == null){
            System.out.printf("No data!");
            return;
        }
        Person current = first;
        while (true){
            System.out.println(current.getNo());

            if(current.getNext() == first){
                break;
            }
            current = current.getNext();
        }
    }

    @Override
    public String toString() {
        return "JosephusCircle{" +
                "first=" + first +
                '}';
    }
}
