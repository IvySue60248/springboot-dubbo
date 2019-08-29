# springboot-dubbo

1, 初始化springboot项目
2，增加dubbo依赖，dubbot-springboot-starter依赖
3，增加dubbo-registry-zookeeper依赖
4，创建sb-dubbot-service模块，声明接口
5，增加sb-dubbo-provider模块，实现接口，声明dubbot service，配置dubbo相关配置
6，增加sb-dubbo-consumer模块，使用reference，配置dubbo配置