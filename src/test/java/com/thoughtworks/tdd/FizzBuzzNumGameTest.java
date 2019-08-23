/*
 * Copyright (C), 1992-2019
 * Package com.thoughtworks.tdd 
 * FileName: FizzBuzzNumGame.java
 * Author:   wang-hc
 * Date:     2019年8月23日 下午3:27:57
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年8月23日下午3:27:57                     1.0                  
 *===============================================================================================
 */
package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2019年8月23日 <br>
 * 作者：wang-hc <br>
 * 说明：<br>
 */
public class FizzBuzzNumGameTest {
    
    @Test
    public void should_return_1_when_FizzBuzzNumGame_given_1(){
        //given
        int num = 1;
        String expected = "1";
        String actual;
        
        
        //when
        FizzBuzzNumGame fizzBuzzNumGame = new FizzBuzzNumGame();
        actual = fizzBuzzNumGame.fizzBuzz(num);
        
        //then
        Assertions.assertEquals(expected, actual);
        
    }
    
    @Test
    public void should_return_Fizz_when_FizzBuzzNumGame_given_3() {
        // TODO Auto-generated method stub
        
        //given
        int num=3;
        String expected="Fizz";
        String actual;
        
        //when
        FizzBuzzNumGame fizzBuzzNumGame= new FizzBuzzNumGame();
        actual = fizzBuzzNumGame.fizzBuzz(num);
        
        //then
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void should_return_FizzBuzz_when_FizzBuzzNumGame_give_5() {
        //given
        int num=5;
        String expected = "FizzBuzz";
        String actual;
        
        //when
        FizzBuzzNumGame fizzBuzzNumGame = new FizzBuzzNumGame();
        actual=fizzBuzzNumGame.fizzBuzz(num);
        
        //then
        Assertions.assertEquals(expected, actual);
        
    }
    
    @Test
    public void should_return_FizzBuzzWhizz_when_FizzBuzzNumGame_give_7() {
        //given 
        int num = 7;
        String expected = "FizzBuzzWhizz";
        String actual;
        
        //when
        FizzBuzzNumGame fizzBuzzNumGame = new FizzBuzzNumGame();
        actual = fizzBuzzNumGame.fizzBuzz(num);

        //then
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    public void should_return_FizzBuzz_when_FizzBuzzNumGame_give_15() {
        //given
        int num = 15;
        String expected = "FizzBuzz";
        String actual;
        
        //when
        FizzBuzzNumGame fizzBuzzNumGame = new FizzBuzzNumGame();
        actual = fizzBuzzNumGame.fizzBuzz(num);
        
        //then
        Assertions.assertEquals(expected, actual);
        
        
    }

}
