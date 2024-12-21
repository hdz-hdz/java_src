package day_11_5;

class ListQueue{
    int data[];
    int front;
    int rear;
    final int maxlen=10;

    public void Init() {
        data=new int[maxlen];
        front=-1;
        rear=-1;

    }
    public void InQueue(int x) {
        if(rear==maxlen-1) {
            System.out.println("队列已满，不能进行进队操作！！！！");
            return;
        }
        rear=rear+1;
        data[rear]=x;
    }
    public void OutQueue() {
        if(front==rear) {
            System.out.println("队列为空，不能进行出队操作！！！！！");
            return;
        }
        front=front+1;
        System.out.println("队首元素为："+data[front]);
    }
    public boolean IsEmpty() {
        if(front==rear)
            return true;
        return false;
    }
    public void countNumber() {
        int number;
        number=rear-front;
        System.out.println("元素个数为："+number);
    }
    public int GetSum() {
        int sum=0,i;
        for(i=front+1;i<=rear;i++)
            sum=sum+data[i];
        return sum;
    }
}
public class ListQueue1 {

    public static void main(String[] args) {
        ListQueue lq=new ListQueue();
        lq.Init();
        lq.InQueue(10);
        lq.InQueue(20);
        lq.InQueue(30);
        lq.InQueue(40);
        if (lq.IsEmpty()==true)
            System.out.println("队为空");
        else
            System.out.println("队不为空");
        lq.countNumber();
        System.out.println("所有元素之和为："+lq.GetSum());
        lq.OutQueue();
        lq.OutQueue();
        lq.OutQueue();
        lq.OutQueue();
    }

}