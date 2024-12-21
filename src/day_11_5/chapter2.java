package day_11_5;

import java.util.Scanner;
class DoubleNode3{
    DoubleNode3 prior;
    int data;
    DoubleNode3 next;
    DoubleNode3(){
        prior=null;
        data=0;
        next=null;
    }
}

class NodeLink {
    DoubleNode3 head;

    public void CreateDoubleList() {
        DoubleNode3 temp = new DoubleNode3();
        head = temp;
        while (true) {
            DoubleNode3 t = new DoubleNode3();
            Scanner in = new Scanner(System.in);
            System.out.println("请输入插入结点的值：");
            t.data = in.nextInt();
            if (t.data == -1) break;
            temp.next = t;
            t.prior = temp;
            temp = t;
        }
    }

    public void ShowDoubleList() {
        DoubleNode3 p = new DoubleNode3();
        p = head.next;
        while (p != null) {
            System.out.print(p.data + "->");
            p = p.next;
        }
        System.out.println();
    }

    public void ShowList2() {
        DoubleNode3 p = new DoubleNode3();
        p = head.next;
        p = p.next;
        while (p.next != null) {
            p = p.next;
        }
        while (p != head) {
            System.out.println(p.data + "->");
            p = p.prior;
        }
        System.out.println();
    }

    public void InsertNode(DoubleNode3 p , DoubleNode3 s ){
        s.next = p.next;
        p.next.prior = s;
        p.next = s;
        s.prior = p;
    }

    public void DeleteNode(DoubleNode3 p){
        p.next.next.prior = p;
        p.next = p.next.next;

    }

    public static class chapter2 {
        public static void main(String[] args) {
            NodeLink nl = new NodeLink();
            nl.CreateDoubleList();
            nl.ShowDoubleList();
            nl.ShowList2();
            DoubleNode3 s = new DoubleNode3();
            Scanner in = new Scanner(System.in);
            System.out.println("请输入插入结点的值:");
            s.data = in.nextInt();
            nl.InsertNode(nl.head.next, s);
            nl.ShowDoubleList();
            nl.DeleteNode(nl.head.next);

        }
    }
}
