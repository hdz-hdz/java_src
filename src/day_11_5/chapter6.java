package day_11_5;
import java.util.Scanner;
class LinkNode3{
    int data;
    LinkNode3 next;
    LinkNode3(){
        data=0;
        next=null;
    }
}
class LinkQueue3{
    LinkNode3 front;
    LinkNode3 rear;
    public void Init() {
        front=new LinkNode3();
        rear=new LinkNode3();
        front.next=null;
        rear.next=null;
    }
    public void InQueue() {
        LinkNode3 t=new LinkNode3();
        Scanner in=new Scanner(System.in);
        System.out.println("请输入进队元素的值：");
        t.data=in.nextInt();
        if(front.next==null&&rear.next==null)
        {
            front.next=t;
            rear.next=t;
        }
        rear.next=t;
        rear=t;
    }
    public void OutQueue() {
        if(front.next==null) {
            System.out.println("队列为空，不能进行出队操作！！！！");
            return;
        }
    }

}
public class chapter6 {

    public static void main(String[] args) {
         LinkQueue3 lq=new LinkQueue3();
         lq.Init();
         lq.InQueue();
         lq.InQueue();
         lq.InQueue();
         lq.InQueue();
         lq.InQueue();
         lq.InQueue();
    }

}