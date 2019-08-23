/*
 * Copyright (C), 1992-2019
 * Package com.thoughtworks.tdd 
 * FileName: FizzBuzzNumGame.java
 * Author:   wang-hc
 * Date:     2019年8月23日 下午3:42:48
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年8月23日下午3:42:48                     1.0                  
 *===============================================================================================
 */
package com.thoughtworks.tdd;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2019年8月23日 <br>
 * 作者：wang-hc <br>
 * 说明：<br>
 */
public class FizzBuzzNumGame {

    /**
     * @param num
     * @return
     */
    public String fizzBuzz(int num) {
        // TODO Auto-generated method stub
        if(num%3==0) {
            return "Fizz";
        }else if(num%5==0) {
            return "FizzBuzz";
        }else if(num%7==0) {
            return "FizzBuzzWhizz";
        }
        return String.valueOf(num);
    }

}
