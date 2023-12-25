package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제 2480번 : 주사위 세개
 * @since 2023-12-17
 */
public class Ex_2480 {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int amt = 0;
        int num = 0;

        if ( A == B && A == C ) amt = 10000 + A * 1000;
        else if ( A == B || A == C || B == C ) {
            num = A == B ? A : ( B == C ? B : ( A == C ? C : 0 ) );
            amt = 1000 + num * 100;
        } else if ( A != B && A != C && B != C ) {
            if ( A >= B && A >= C ) num = A;
            else if ( B >= A && B >= C ) num = B;
            else if ( C >= A && C >= B ) num = C;

            amt = num * 100;
        }

        System.out.println( amt );
        */
    }
}