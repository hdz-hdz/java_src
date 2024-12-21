package day_11_5;

import java.util.Scanner;

class ListString{
    char data[];
    int size;
    final int maxsize=100;
    public void Init(){
        data=new char[maxsize];
        size=0;
        Scanner in=new Scanner(System.in);
        char ch;
        ch=in.next().charAt(0);
        while(ch!='#'){
            data[size]=ch;
            size=size+1;
            System.out.println("请输入一个字符：");
            ch=in.next().charAt(0);
        }
    }
    public void ShowString(){
        int i;
        for(i=0;i<size;i++)
            System.out.print(data[i]);
        System.out.println();
    }
    public int StringLength(){
        return size;
    }
    public void GetSubString(int m,int n  ){
        int i,j;
        for(i=m;i<n;i++){
            for(j=i;j<n+1;j++){
                System.out.print(data[i]);
                break;
           }
        }
    }
    public boolean issameChar(char data1[],char data2[]){

      return false;
    }
}
public class ListStringDemo {
    public static void main(String[] args) {
        ListString ls=new ListString();
        ls.Init();
        ls.ShowString();
        ls.StringLength();
        ls.GetSubString(3,4);

    }
}
