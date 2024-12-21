package day_11_26;

import java.util.Scanner;
class TreeNode{
    char data;
    int parent;
}
class TreeDemo{
    TreeNode a[];
    int n;
    public void Init(){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入结点的个数：");
        n=in.nextInt();
        a=new TreeNode[n];
        int i;
        for(i=0;i<n;i++)
            a[i]=new TreeNode();
        for(i=0;i<n;i++){
            System.out.println("请输入结点的值：");
            a[i].data=in.next().charAt(0);
            System.out.println("请输入双亲序号：");
            a[i].parent=in.nextInt();
        }
    }
    public void ShowTree(){
        int i;
        for(i=0;i<n;i++){
            System.out.print("结点的值"+a[i].data);
            if(a[i].parent!=-1)
                System.out.print("\t双亲的值"+a[a[i].parent].data);
            System.out.println();
        }
    }
    public int GetCaseNumber() {
        int maxDegree = 0;
        for (int i = 0; i < n; i++) {
            int currentDegree = 0;
            // 统计每个节点作为父节点的次数
            for (int j = 0; j < n; j++) {
                if (a[j].parent == i) {
                    currentDegree++;
                }
            }
            if (currentDegree > maxDegree) {
                maxDegree = currentDegree;
            }
        }
        return maxDegree;
    }
    public void ShowAncestor(TreeNode t) {
        // 在我们的实现中，需要修改参数类型，因为我们使用的是字符来标识节点
        char nodeValue = t.data;
        System.out.print(nodeValue + "的祖先节点为：");

        // 查找该值对应的节点索引
        int currentIndex = -1;
        for (int i = 0; i < n; i++) {
            if (a[i].data == nodeValue) {
                currentIndex = i;
                break;
            }
        }

        // 如果找到节点，遍历其所有祖先
        if (currentIndex != -1) {
            int parent = a[currentIndex].parent;
            while (parent != -1) {
                System.out.print(a[parent].data + " ");
                parent = a[parent].parent;
            }
        }
        System.out.println();
    }
}
public class TreeDemo3 {
    public static void main(String[] args) {
        TreeDemo td=new TreeDemo();
        td.Init();
        td.ShowTree();

        // 显示树的度
        System.out.println("树的度为：" + td.GetCaseNumber());

        // 测试显示祖先节点
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查找祖先的节点值：");
        char targetValue = in.next().charAt(0);
        TreeNode targetNode = new TreeNode();
        targetNode.data = targetValue;
        td.ShowAncestor(targetNode);
        in.close();
    }
}