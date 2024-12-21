package day_11_12;

import java.util.Scanner;

class Triple{
    int row;
    int col;
    int value;
}

class TripleDemo {
    int a[][];
    Triple t[];

    public void Init() {
        int m, n, i, j;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入矩阵的行数：");
        m = in.nextInt();
        System.out.println("请输入矩阵的列数：");
        n = in.nextInt();
        a = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("请输入" + i + "行" + j + "列的元素值");
                a[i][j] = in.nextInt();
            }
        }
    }

    public void ReverseTriple() {
        int i, j, n = 0;
        for (i = 0; i < a.length; i++) {
            t[i] = new Triple();
            for (j = 0; j < a[i].length; j++) {
                if (a[i][j] !=0) n++;
                t = new Triple[n];
                int k=0;
                for (i = 0; i < a.length; i++) {
                    for (j = 0; j < a[i].length; j++) {
                        if (a[i][j] !=0) {
                             t[k].row=i;
                             t[k].col=j;
                             t[k].value=a[i][j];
                             k++;
                        }
                    }
                }
            }
        }
    }
    public void ShowArray(){
        int i, j;
        for(i=0;i<a.length;j++){
            for (j=0;j<a[i].length;j++){
            System.out.print(a[j][0]+"  ");
            System.out.println();
            }
        }
    }
    public void ShowTriple(){
        int i;
        System.out.println("i"+"\t"+"j"+"\t"+"value");
        for(i=0;i<t.length;i++){
            System.out.print(t[i].row+"\t"+t[i].col+"\t"+t[i].value+"\t");
        }
    }
}


public class TripleDemo3 {
    public static void main(String[] args) {
        TripleDemo tp = new TripleDemo();
        tp.Init();
        tp.ReverseTriple();
        tp.ShowArray();
        tp.ShowTriple();
    }
}
