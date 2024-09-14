import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] sortedArr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken(" "));
            sortedArr[i] = arr[i];
        }

        // 복사한 배열 오름차순 정렬
        Arrays.sort(sortedArr);

        // 좌표 압출을 위한 맵 생성
        HashMap<Integer, Integer> compressionMap = new HashMap<>();
        int count = 0;
        for (int num : sortedArr) {
            if (!compressionMap.containsKey(num)) {
                compressionMap.put(num, count++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(compressionMap.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}