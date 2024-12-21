package day_12_3;

import java.util.Scanner;

class  TreeDemo{
     char t[];
     int n;
     public void Init(){
         String string;
         Scanner in = new Scanner(System.in);
         System.out.println("请输入树结点的值：");
         String str = in.next();
         n = str.length() + 1;
         t = new char[n];
         for (int i = 0; i < str.length(); i++) {
             t[i + 1] = str.charAt(i);
         }
     }
     public void ShowTree(){
         for (int i = 1; i < n; i++) {
             System.out.print("当前结点的值为："+t[i] + " ");
             if(t[i]!='#')
                 System.out.print("当前结点的值："+ t[i]);
             if (2*i<n&&t[2*i]!='#')
                 System.out.print("左孩子结点的值为："+t[2*i]+" ");
             if (2*i+1<n&&t[2*i+1]!='#')
                 System.out.print("右孩子结点的值为："+t[2*i+1]);
             System.out.println();
         }
     }
    public char GetLeftChild(int i) {
        if (i < 1 || 2 * i >= n || t[2 * i] == '#') {
            return '\0';
        }
        return t[2 * i];
    }
    public char GetParent(int i) {
        if (i < 2 || i >= n || t[i] == '#') {
            return '\0';
        }
        return t[i / 2];
    }
}

public class ListTreeDemo {
    public static void main(String[] args) {
           TreeDemo td = new TreeDemo();
           td.Init();
           td.ShowTree();
           td.GetParent(1);
           td.GetLeftChild(1);

        int nodeIndex = 1; // 你可以更改这个值来测试不同的结点
        char leftChild = td.GetLeftChild(nodeIndex);
        System.out.println("结点 " + nodeIndex + " 的左孩子结点的值为: " + (leftChild == '\0' ? "不存在" : leftChild));

        // 测试 GetParent 方法
        nodeIndex = 2; // 你可以更改这个值来测试不同的结点
        char parent = td.GetParent(nodeIndex);
        System.out.println("结点 " + nodeIndex + " 的双亲结点的值为: " + (parent == '\0' ? "不存在" : parent));
    }
}
