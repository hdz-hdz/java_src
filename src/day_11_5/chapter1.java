package day_11_5;

import java.util.Scanner;
class Node{
    int date;
    Node next;
    Node(){//类名和方法名一样,叫构造方法（用于初始化）
        date=0;
        next=null;
    }
}

class LinkLsit{
    Node head;//头结点
    int size;
    public void CreateLinkList() {
        Node temp=new Node();
        head=temp;
        size=0;
        while(true) {
            Scanner in=new Scanner(System.in);
            Node t=new Node();
            System.out.println("请输入链表元素的值");
            t.date=in.nextInt();
            if(t.date==-1)break;
            temp.next=t;
            temp=t;
            size=size+1;
        }
    }
    public void ShowList() {
        Node t=new Node();
        t=head.next;//让t指向第一个元素
        while(t!=null) {
            System.out.print(t.date+"->");
            t=t.next;
            System.out.println();
        }
    }
    public void InsertNode(Node s,Node p) {
        s.next=p.next;
        p.next=s;
    }
    public void DeleteNode(Node p) {
        p.next=p.next.next;
    }
    public boolean IsFull(){
        if(head.next==null)
            return true;
        return false;
    }
    public void getsize() {
        int	n=0;
        Node p=new Node();
        p=head.next;
        while(p!=null) {
            n=n+1;
            p=p.next;
        }
        System.out.println(n);
    }
}



public class chapter1 {
    public static void main(String[] args) {

        LinkLsit list=new LinkLsit();
        list.CreateLinkList();
        list.ShowList();
        Node s=new Node();
        Scanner in=new Scanner(System.in);
        System.out.println("请输入插入结点都值");
        s.date=in.nextInt();

        list.InsertNode(s,list.head.next.next);
        list.ShowList();
        list.DeleteNode(list.head.next);
        list.ShowList();
        if(list.IsFull()==true)
            System.out.println("链表为空");
        else
            System.out.println("链表不为空");
        list.getsize();
    }

}