package com.example.atelier;


import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@Log
@SpringBootTest
class AtelierApplicationTests {


    @Test
    void contextLoads() {
    }

    @Test
    void d()
    {
        for(int i=1; i<=30; i++)
        {
            System.out.println("INSERT INTO t_products ( product_name, product_title, product_price, product_type ) VALUES " +
                    "('상품이름"+i+"' ," + "'상품제목"+i+"' ,"+ "'상품가격"+i+"' ,"+ "'상품타입"+i+"');"  );
        }

        for(int i=1; i<=5; i++)
        {
            System.out.println("INSERT INTO t_members ( uid, upw, uname, address, call, email ) VALUES " +
                    "('회원"+i+"' ,"+"'1234', '이름"+i+"' ,"+"'주소', '폰번호', '이메일');");
        }
    }


}
