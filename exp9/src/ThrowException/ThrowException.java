package ThrowException;

/*
 * 编写一个程序，在程序中定义两个异常类，在main（）函数中使用throw语句抛出异常。
 */
class ThrowException {
    public static void main(String[] args) {
        int x = -1;
        try {
            if (x > 0)
                throw new AaaException();//抛出一个AaaException实例
            else
                throw new BbbException();//抛出一个BbbException实例
        } catch (AaaException e) {
            System.out.print("捕获到了Aaa异常");
        } catch (BbbException e) {
            System.out.print("捕获到了Bbb异常");
        }
    }
}
