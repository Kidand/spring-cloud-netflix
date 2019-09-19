# Spring-Cloud-Netflix

### Service

+ Admin : 服务监控
+ Config : 分布式配置
+ Dependencies : 依赖管理
+ Eureka : 服务注册与发现
+ Service Admin : 服务生产者
+ Web Admin Feign : 服务消费者 （Feign 方式 + Hystrix 熔断器 + 仪表盘监控）
+ Web Admin Ribbon : 服务消费者 （Ribbon 方式 + Hystrix 熔断器 + 仪表盘监控）
+ ZipKin : 分布式链路追踪系统
+ Zuul : 路由转发，过滤器



### 启动顺序

1. 服务注册与发现
2. 分布式配置中心
3. 服务提供者
4. 服务消费者
5. API 网关



注：项目运行需配置 GitLab 或者 GitHub 来管理配置文件，在 Config 服务中修改相应的配置