package 백준;

import java.util.Scanner;

public class array_11720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        //입력값 String형 변수 sNum에 저장 후 char[]형 변수로 변환
        String sNum=sc.next();
        char[] cNum= sNum.toCharArray();

        int result=0;

        for(int i=0;i<cNum.length;i++)
        {
            result+=cNum[i]-'0';
        }
        System.out.print(result);
    }
}

