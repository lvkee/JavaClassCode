import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个程序，将一个字符串中的单词解析出来，
 * 然后将它们添加到一个HashSet中，
 * 并输出每个重复的单词、不同单词的个数，消除重复单词后的列表。
 *
 * @author ChrisLiu
 */


public class Demo01 {
    //该方法用来计算该字符串中重复单词的个数
    /*static void countRepeatWords(String[] str) {
        for (int i = 0; i < str.length - 1; i++) {
            int count = 1;
            String word = null;
            int flag = 0; // 当flag为0时，表示该单词仅出现了一次
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    word = str[i];
                    count++;
                    flag = 1; // 当flag为1时，表示该单词出现了两次及以上
                }
            }
            if (flag == 1) {
                System.out.println(word + "出现了" + count + "次");
            }
        }
    }*/

    static void countRepeatWords(String[] str) {
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            String word = null;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    if (i > j) {
                        break;
                    }
                    word = str[i];
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(word + "出现了" + count + "次");
            }
        }
    }


    public static void main(String[] args) {
        String s = new String("you can just do what you truly love to do");
        String[] words = s.split(" ");
        HashSet<String> hs = new HashSet<String>();
        for (String str : words) {
            hs.add(str);
        }
        System.out.println("原字符串为:" + s);
        System.out.println("该字符串出现的重复单词及其个数:");
        countRepeatWords(words);
        System.out.println("--------");
        System.out.println("不同单词的个数:" + hs.size());
        System.out.println("--------");
        System.out.println("消除重复单词后的列表:");
        System.out.println(hs);
    }
}
