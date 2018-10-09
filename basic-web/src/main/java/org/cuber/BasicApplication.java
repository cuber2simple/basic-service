package org.cuber;

import org.cuber.stub.StubConstant;
import org.cuber.zk.XClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.cuber.basic.mapper")
@SpringBootApplication
public class BasicApplication {
    public static void main(String[] args) {
        System.setProperty(StubConstant.ZOOKEEPER_ADDRESS, XClient.getZkConnectString());
        SpringApplication.run(BasicApplication.class, args);
    }
}
