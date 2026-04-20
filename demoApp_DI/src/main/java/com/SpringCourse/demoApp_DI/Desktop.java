package com.SpringCourse.demoApp_DI;

import org.springframework.stereotype.Component;

@Component // both ma component hune vako lae in both laptop and desktop class .. so laptop calss ma primary use garya xa.
// that means ke . laptop ko chai container ma object call hunxa
public class Desktop implements Computer{
    @Override
    public void compile(){

        System.out.println(" i am compiling a code in Desktop..");
    }
}
