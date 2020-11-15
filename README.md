###注意点一
给定 "pwwkew" ，
子串是pww,wwk等很多个子串 是连在一起的
子序列是 pwk,pke等很多个子序列 ，但是子序列中的字符在字符串中不一定是连在一起的。

List<int[]> res = new ArrayList<>();
res 结果转二维数组[][] 


两个ArrayList相加使用 b.addAll(a);合并出来的List就是b，而不是一个新的List .

动态规划



面试题：
栈能否用 

###特别的注意
1.while 循环中，前后双指针问题，不要在括号里写  != ，要写< = > =这样的
2. 顺序不要弄反，弄反就出错
    比如： where(pre.next!=null&&pre!=null)  这样写错误
           where (pre!=null&&pre.next!=null)