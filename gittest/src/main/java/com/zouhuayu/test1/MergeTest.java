package com.zouhuayu.test1;

/**
 * @Author: zouhuayu1
 * @Date: 2021/6/9 下午1:28
 */
public class MergeTest {
    public static void main(String[] args) {
        // 这个代码是在本地branch001向远程branch001推送的
        // 试验一下利用 branch1合并branch001
        // 新建一个branch002分支，写新代码，提交到远程branch002分支
        System.out.println("hello branch002  1111111");
        System.out.println("hello branch002  2222222"); // 利用版本号可以实现分支代码回退
        System.out.println("看到这行代码，说明我把分支branch002的开发代码成功合并到了主分支");

    }
}
