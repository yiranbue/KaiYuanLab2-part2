import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class L2022211877_7_Test {

    /*
     * 测试用例设计原则：
     * 1. 等价类划分原则：将输入划分为有效和无效的类，确保涵盖各种情况。
     * 2. 边界值分析原则：测试边界条件，如字符串长度的最小值和最大值。
     * 3. 特殊情况：考虑空字符串和没有可交换字符对的情况。
     */

    @Test
    public void testSmallestStringWithSwaps_Example1() {
        // 测试目的：验证示例 1 的输出
        // 用到的测试用例：s = "dcab", pairs = [[0,3],[1,2]]
        Solution7 solution = new Solution7();
        String result = solution.smallestStringWithSwaps("dcab", Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2)));
        Assertions.assertEquals("bacd", result);
    }

    @Test
    public void testSmallestStringWithSwaps_Example2() {
        // 测试目的：验证示例 2 的输出
        // 用到的测试用例：s = "dcab", pairs = [[0,3],[1,2],[0,2]]
        Solution7 solution = new Solution7();
        String result = solution.smallestStringWithSwaps("dcab", Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2)));
        Assertions.assertEquals("abcd", result);
    }

    @Test
    public void testSmallestStringWithSwaps_Example3() {
        // 测试目的：验证示例 3 的输出
        // 用到的测试用例：s = "cba", pairs = [[0,1],[1,2]]
        Solution7 solution = new Solution7();
        String result = solution.smallestStringWithSwaps("cba", Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2)));
        Assertions.assertEquals("abc", result);
    }

    @Test
    public void testSmallestStringWithSwaps_EmptyString() {
        // 测试目的：验证空字符串的处理
        // 用到的测试用例：s = "", pairs = []
        Solution7 solution = new Solution7();
        String result = solution.smallestStringWithSwaps("", Arrays.asList());
        Assertions.assertEquals("", result);
    }

    @Test
    public void testSmallestStringWithSwaps_NoPairs() {
        // 测试目的：验证没有可交换字符对的情况
        // 用到的测试用例：s = "abcd", pairs = []
        Solution7 solution = new Solution7();
        String result = solution.smallestStringWithSwaps("abcd", Arrays.asList());
        Assertions.assertEquals("abcd", result);
    }

    @Test
    public void testSmallestStringWithSwaps_SingleCharacter() {
        // 测试目的：验证只有一个字符的字符串
        // 用到的测试用例：s = "a", pairs = []
        Solution7 solution = new Solution7();
        String result = solution.smallestStringWithSwaps("a", Arrays.asList());
        Assertions.assertEquals("a", result);
    }

    @Test
    public void testSmallestStringWithSwaps_LargeInput() {
        // 测试目的：验证较大的输入
        // 用到的测试用例：s = "zyxwvutsrqponmlkjihgfedcba", pairs = [[0, 25], [1, 24], [2, 23], [3, 22], [4, 21]]
        Solution7 solution = new Solution7();
        String result = solution.smallestStringWithSwaps("zyxwvutsrqponmlkjihgfedcba",
                Arrays.asList(Arrays.asList(0, 25), Arrays.asList(1, 24), Arrays.asList(2, 23), Arrays.asList(3, 22), Arrays.asList(4, 21)));
        Assertions.assertEquals("abcdeutsrqponmlkjihgfvwxyz", result);
    }
}
