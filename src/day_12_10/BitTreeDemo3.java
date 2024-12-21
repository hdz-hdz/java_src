package day_12_10;
import java.util.Scanner;
class BitTreeNode{
    char data;
    BitTreeNode left;
    BitTreeNode right;
    BitTreeNode(){
        left=null;
        right=null;
    }
}
class  BitTree{
    BitTreeNode t[];
    int n;
    public void Init(){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入二叉树结点数量：");
        n=in.nextInt();
        t=new BitTreeNode[n];
        int i;
        for(i=0;i<n;i++)
            t[i]=new BitTreeNode();
        int left,right;
        for(i=0;i<n;i++){
            System.out.println("请输入结点的值：");
            t[i].data=in.next().charAt(0);
            System.out.println("请输入左孩子的下标：");
            left=in.nextInt();
            if(left!=-1)
                t[i].left=t[left];
            System.out.println("请输入右孩子的下村：");
            right=in.nextInt();
            if(right!=-1)
                t[i].right=t[right];
        }
    }
    public void Show(){
        int i;
        for(i=0;i<n;i++){
            System.out.print("当前结点值为："+t[i].data);
            if(t[i].left!=null)
                System.out.print("   左孩子值为："+t[i].left.data);
            if(t[i].right!=null)
                System.out.print("   右孩子值为："+t[i].right.data);
            System.out.println();
        }
    }
    public void FirstRoot(BitTreeNode t){
        if(t==null) return;
        System.out.print(t.data);
        if(t.left!=null)
            FirstRoot(t.left);
        if(t.right!=null)
            FirstRoot(t.right);
    }
    public void MidRoot(BitTreeNode t){
        if(t==null) return;
        if(t.left!=null)
            MidRoot(t.left);
        System.out.print(t.data);
        if(t.right!=null)
            MidRoot(t.right);
    }
    public void LastRoot(BitTreeNode t){
        if(t==null) return;
        if(t.left!=null)
            LastRoot(t.left);
        if(t.right!=null)
            LastRoot(t.right);
        System.out.print(t.data);
    }
}
public class BitTreeDemo3 {
    public static void main(String[] args) {
        BitTree bt=new BitTree();
        bt.Init();
        bt.Show();
        bt.FirstRoot(bt.t[0]);
        System.out.println();
        bt.MidRoot(bt.t[0]);
        System.out.println();
        bt.LastRoot(bt.t[0]);
        System.out.println();

    }

}