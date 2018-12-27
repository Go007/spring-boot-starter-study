package com.hong.httpstarter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <br>TODO(描述该类的作用)</br>
 *
 * @author 533735
 * @version 1.0
 * @email wanghong3@dafycredit.com
 * @date 2018/12/26 16:13
 * @since 1.0
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "hong.http")
public class HttpProperties {
   private String url = "http://www.baidu.com/";
}
