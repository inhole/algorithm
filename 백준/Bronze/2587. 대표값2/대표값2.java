import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 평균
        int aver = 0;
        for (int item : arr) {
            aver += item;
        }
        System.out.println(aver / 5);

        // 중앙값 구하기
        // 오름차순 정렬
        Arrays.sort(arr);
        int mid = 0;
        if (arr.length % 2 == 0) {
        // 2. 짝수일때 두 중간값의 평균 계산
            mid = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
        } else {
        // 3. 홀수일때 중간값
            mid = arr[arr.length / 2];
        }
        System.out.println(mid);
    }

}