package com.eatingapple;


import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EnterpriseSystemApplicationTests {



    public static void main(String[] args) {
        float f1= (float) 2.03;
        float f2= (float) 2.33;
        boolean aBoolean=(f2-f1==0.3);
        float f3=f2-f1;
        System.out.println(aBoolean);
        System.out.println(f3);
    }

}
