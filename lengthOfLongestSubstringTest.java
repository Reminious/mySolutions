import java.util.LinkedList;
import java.util.Queue;

public class lengthOfLongestSubstringTest {
    public static int lengthOfLongestSubstring(String s) {
        int i, j, max = 0;
        Queue<Character> queue = new LinkedList<Character>();
        for (i = 0; i < s.length(); i++) {
            if (queue.contains(s.charAt(i))) {
                while (queue.peek() != s.charAt(i)) {
                    queue.poll();
                }
                queue.poll();
            }
            queue.offer(s.charAt(i));
            if (queue.size() > max) {
                max = queue.size();
            }
        }
        return max;
    }
}
