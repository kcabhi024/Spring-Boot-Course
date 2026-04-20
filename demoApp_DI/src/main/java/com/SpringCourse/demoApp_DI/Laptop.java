package com.SpringCourse.demoApp_DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // component lae chia reference denxa.. but same method huda and same interface implement garda
// component lae  kun chai primary ho vanne taha paudaina ra error denxa.. so we used @primary
// @Primary  -- yo case ma primary lai hatako to use Qualifier annotation
public class Laptop implements Computer {

    @Override
    public void compile(){

        System.out.println(" i am compiling a code in Laptop..");
    }
}
