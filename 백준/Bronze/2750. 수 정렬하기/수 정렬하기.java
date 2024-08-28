import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken(" "));

        int[] arr = new int[N];
        // 1. 입력된 값을 arr 주입
        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        // 2. 오름차순 정렬
        Arrays.sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }

}