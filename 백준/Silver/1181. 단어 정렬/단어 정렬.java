import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.function.IntFunction;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = st.nextToken();
        }

        String[] result = Arrays.stream(arr)
                                .distinct()
                                .sorted((s1, s2) -> s1.length() - s2.length() != 0 ? s1.length() - s2.length() : s1.compareTo(s2))
                                .toArray(String[]::new);

        System.out.println(String.join("\n", result));
    }
}