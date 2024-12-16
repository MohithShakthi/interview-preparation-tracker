package FlowChartAndPseudoCode;

import java.util.Scanner;

public class RupeeToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rupee = sc.nextFloat();
        float usd = rupee/86;
        System.out.println(rupee+" in USD is:"+usd);
        sc.close();
    }
}
