package com.gtf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication： 标注这个类是一个Springboot的应用，启动类下的所有资环被导入
@SpringBootApplication
public class Springboot01HelloworldApplication {
    //将Springboot应用启动
    public static void main(String[] args) {
        SpringApplication.run(Springboot01HelloworldApplication.class, args);
    }

}
