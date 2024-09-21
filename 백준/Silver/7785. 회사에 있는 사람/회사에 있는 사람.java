import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String value = st.nextToken();

            if (map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, value);
            }
        }

        ArrayList<String> list = new ArrayList<String>(map.keySet());

        Collections.sort(list, Collections.reverseOrder());

        for (var item : list) {
            System.out.println(item + " ");
        }
    }
}