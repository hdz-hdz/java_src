package day_11_12;

import java.util.Scanner;

class SymmetricMatrix {
    int a[][];
    int b[];
    public void Init(){
        Scanner in = new Scanner(System.in);
        System.out.println("输入方阵的行数：");
        int n;
        n = in.nextInt();
        a = new int[n][n];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("请输入矩阵元素的值：");
                a[i][j] = in.nextInt();
            }
        }
    }
    public void ArrayZip(){
        int n;
        n=a.length;
        int i,j,k=0;
        b=new int[n*(n+1)/2];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                b[k++] = a[i][j];
            }
        }
    }
}

public class SymmetricmatrixDemo3 {
    public static void main(String[] args) {

    }
}
