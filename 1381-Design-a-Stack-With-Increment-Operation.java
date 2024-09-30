import java.util.ArrayList;
import java.util.List;

public class CustomStack {
    private List<Integer> stack;
    private List<Integer> inc;
    private int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new ArrayList<>();
        this.inc = new ArrayList<>();
    }

    public void push(int x) {
        if (stack.size() == maxSize) {
            return;
        }
        stack.add(x);
        inc.add(0);
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        if (inc.size() > 1) {
            inc.set(inc.size() - 2, inc.get(inc.size() - 2) + inc.get(inc.size() - 1));
        }
        int result = stack.remove(stack.size() - 1) + inc.remove(inc.size() - 1);
        return result;
    }

    public void increment(int k, int val) {
        k = Math.min(k, stack.size());
        if (k == 0) {
            return;
        }
        inc.set(k - 1, inc.get(k - 1) + val);
    }
}