**一、实验目的**
  1、掌握类中静态成员的定义方法，掌握静态数据成员的初始化方法、静态数据成员和静态成员函数的访问和使用方法；
  2、巩固掌握构造方法的作用和定义；
  3、掌握方法重载的意义和实现方式。

**二、实验内容**
  1、静态成员的设计与测试
  （1）设计包含静态数据成员的Student类，在该类定义中包括：
      数据成员：学号，年龄，分数score，及静态数据成员学生人数count；
      定义成员函数用于设置和读取及显示学号，年龄，分数，累计学生人数；

​      静态成员函数getCount( ) 用于返回总人数；

​      外部函数average()用于求平均值。
  （2）设计一个测试类Test，在main函数中，输入某班同学的成绩，并调用上述函数求全班学生的平均分。

  2、静态方法的设计与测试
  （1）设计一个公有类(类名MyMath），保存为MyMath.java文件。该类属于某个包

​    （包名cn.edu.zucc.cs），该类包括如下静态方法：
​    static int max(int[ ] ar); //求数组ar中的最大值
​    static double max(double[] ar);//求数组ar中的最大值 
​    static int  min(int[ ] ar);//求数组ar中的最小值
​    static double min(double[] ar);//求数组ar中的最小值 
​    static void sort(double[] ar); //对数组ar进行升序排序
  （2）设计一个测试类Test，该类属于包abc，保存为Test.java文件。
​    要求：import上述MyMath类，并在Test类的main方法中创建若干个数组，然后测试MyMath类定义的方法。

  **3、构造函数重载**
  （1）定义一个游戏中Hero 英雄的类,该类属于某个包（包名cn.edu.zucc.he)，在该类中定义英雄的名字， 生命值和等级3  个属性，定义一个无参构造方法完成对名字、生命值和等级的初始化，分别赋初值为“无名英雄”、100和1。同时实现名字和英雄信息的输出。
  （2）在上一步的基础上，为英雄再定义拥有一个参数的构造方法，第一个参数传入英雄的名字,第二个参数传入一个英雄类型的值，如果为1，则为普通英雄，生命值为100；如果该值为2，则为高级英雄，生命值初始化为200；如果该值为3，则为超级英雄，生命值初始化为300。
  （3）为英雄添加一个基本战斗的方法，该方法拥有一个英雄类型的参数，当传入另一个英雄时，能降低对方10点血。 再增加一个绝招战斗的重载方法，加入一个绝招类型参数，通过输入不同绝招参数，降低对方不同的血量（这里简化为：1，多杀伤3点血，2，多杀伤6点血，3，多杀伤10点血）。
  （4）在主类的主方法中编写代码，测试。
