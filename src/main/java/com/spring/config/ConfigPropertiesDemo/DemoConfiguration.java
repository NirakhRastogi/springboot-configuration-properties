package com.spring.config.ConfigPropertiesDemo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import java.util.List;

@Configuration
@Data
@NoArgsConstructor
@ConfigurationProperties(prefix = "mail")
public class DemoConfiguration {

    private String toId;
    private String fromId;
    private int port;
    private String url;
    private List<String> ccId;
    private SenderDetails sender;
    @DataSizeUnit(DataUnit.KILOBYTES)
    private DataSize senderSize;

}
