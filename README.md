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