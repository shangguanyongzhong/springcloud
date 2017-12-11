## day01 第一天问题总结如下：
####http://127.0.0.1:8761/页面展示的服务SERVICE-HI;虽然退出但是服务
####依旧存在
####application.yml中添加如下代码：
#####自我保护模式关闭
#####       enable-self-preservation: false
#####   清理间隔（单位毫秒，默认是60*1000）
#####    eviction-interval-timer-in-ms: 2000

##day02发现服务启动时service-hi只能启动一个，启动第二个，第一个被强制退出
####解决方案：single instance only 去掉勾选

##day03Feign简介
#####Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。使用Feign，只需要创建一个接口并注解。它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。Feign支持可插拔的编码器和解码器。Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
实现负载均衡的效果

##day04断路器（Hystrix）
#####如果单个服务出现问题，调用这个服务就会出现线程阻塞，此时若有大量的请求涌入，Servlet容器的线程资源会被消耗完毕，导致服务瘫痪。服务与服务之间的依赖性，故障会传播，会对整个微服务系统造成灾难性的严重后果，这就是服务故障的“雪崩”效应。
#####为了解决这个问题，业界提出了断路器模型


