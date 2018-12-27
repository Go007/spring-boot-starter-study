# spring-boot-starter-study
Spring Boot Starter Study

1.参考链接:
https://www.nosuchfield.com/2017/10/15/Spring-Boot-Starters/
http://www.importnew.com/24164.html
https://www.imooc.com/article/68369

2.使用步骤
(1)mvn clean install
(2)在项目中引入Maven依赖
    <dependency>
      <groupId>com.hong</groupId>
      <artifactId>spring-boot-starter-study</artifactId>
      <version>1.0-SNAPSHOT</version>
  </dependency>
  
3.另外说明
因为Spring Boot服务默认包扫描路径为@SpringBootApplication主启动类所在的包及其子包,
所以如果没有配置META-INF/spring.factories文件, 就要注意包扫描路径是否包含到了你的start路径.
可以如下手动指定:
@SpringBootApplication
@ComponentScan(basePackages = {"com.hong.pay.*","com.hong.httpstarter"})
public class Application_Pay
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application_Pay.class, args);
    }
} 

4.spring-boot-configuration-processor的作用
  spring默认使用yml中的配置，但有时候要用传统的xml或properties配置，就需要使用spring-boot-configuration-processor了.
  再在你的配置类开头加上@PropertySource("classpath:your.properties")，其余用法与加载yml的配置一样.

5.SpringBoot中的所有@Conditional注解及作用
@ConditionalOnBean:当容器中有指定的Bean的条件下  
@ConditionalOnClass：当类路径下有指定的类的条件下  
@ConditionalOnExpression:基于SpEL表达式作为判断条件  
@ConditionalOnJava:基于JVM版本作为判断条件  
@ConditionalOnJndi:在JNDI存在的条件下查找指定的位置  
@ConditionalOnMissingBean:当容器中没有指定Bean的情况下  
@ConditionalOnMissingClass:当类路径下没有指定的类的条件下  
@ConditionalOnNotWebApplication:当前项目不是Web项目的条件下  
@ConditionalOnProperty:指定的属性是否有指定的值  
@ConditionalOnResource:类路径下是否有指定的资源  
@ConditionalOnSingleCandidate:当指定的Bean在容器中只有一个，或者在有多个Bean的情况下，用来指定首选的Bean
@ConditionalOnWebApplication:当前项目是Web项目的条件下 

6. SpringBoot AutoConfiguration机制：
https://shihlei.iteye.com/blog/2407689

7.Spring Boot Starter面试题 
https://yq.aliyun.com/ziliao/309938

