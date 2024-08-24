import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken(" "));

        final int THREE_KG = 3;
        final int FIVE_KG = 5;

        int count = 0;

        // 1. 5kg 그램을 먼저 나누고 몫의 나머지를 3kg를 담음
        if (N % FIVE_KG == 0) {
            count = N / FIVE_KG;
        } else {
        // 2. 그렇지 않으면 5kg 을 하나씩 뺌. 딱 맞아 떨어질때까지 3kg로 담음
            for (int i = N / FIVE_KG; i >= 0; i--) {
                int num = N - (i * FIVE_KG);
                if (num % THREE_KG == 0) {
                    count = i + num / THREE_KG;
                    break;
                }
            }
        }

        // 3. 3kg 으로도 못담을 때 -1
        System.out.println(count == 0 ? -1 : count);
    }

}