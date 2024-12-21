package day_11_5;

public class chapter3 {

    static class ListStack{
        int a[];
        final int maxlen = 10;
        int top;
        public void InitStack(){
            a = new int[maxlen];
            top = -1;
        }
        public void PushStack(int x){
            if(top == maxlen-1){
                System.out.println("Stack is full");
                return;
            }
            top = top + 1;
            a[top] = x;
        }
        public void PopStack(){
            if(top == -1){
                System.out.println("Stack is empty");
                return;
            }
            System.out.println("栈顶元素值为："+a[top]);
            top = top - 1;
        }

        public boolean IsEmpty(){
            if(top == -1)  return true;
            return false;
        }

        public boolean IsFull(){
            if(top == maxlen-1) return true;
            return false;
        }

        public int getsum(){
            int sum = 0;
            for(int i = 0; i <= top; i++)
                sum = sum + a[i];
            return sum;
        }


        public static void main(String[] args) {
            ListStack ls = new ListStack();
            ls.InitStack();
            ls.PushStack(10);
            ls.PushStack(20);
            ls.PushStack(30);

            if(ls.IsEmpty() == true){
                System.out.println("Stack is empty");
            }else   {
                System.out.println("Stack is not empty");
            }
            if(ls.IsFull() == true){
                System.out.println("Stack is full");
            }else{
                System.out.println("Stack is not full");
            }
            System.out.println("sum:"+ls.getsum());
            ls.PopStack();
            ls.PopStack();
            ls.PopStack();

        }

    }

}
