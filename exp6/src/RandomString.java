//: exp6:RandomString.java

import java.util.Random;

/**
 * Author:ChrisLiu
 * Email:ChrisLiu0810@163.com
 */
public class RandomString {
    public String getRandomCh() {
        int i = 0;
        int count = 0;
        char[] str = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
        'o','p','q','r','s','t','u','v','w','x','y','z'};
        StringBuffer pwd = new StringBuffer("");
        Random r = new Random();
        while(count < 7) {
            i = Math.abs(r.nextInt(str.length));
            if (i >= 0&& i <str.length) {
                pwd.append(str[i]);
                count++;
            }
        }
        return pwd.toString();
    }

    public static void main(String[] args) {
        RandomString r = new RandomString();
        System.out.println("随机产生的字符串是 ： " + r.getRandomCh());
    }
}
