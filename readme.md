# API网关

### 1、技术方案

* SpringCloud Alibaba - Nacos：注册中心（服务发现/注册）
* SpringCloud Alibaba - Nacos：配置中心（动态配置管理）
* SpringCloud - Feign：声明式HTTP客户端（调用远程服务）
* SpringCloud - Gateway：API网关（webflux编程模式）

### 2、Nacos

* 下载安装包 https://github.com/alibaba/nacos/releases 选择zip文件
* 解压后选择startup.cmd 或 startup.sh 运行nacos
* 在 http://localhost:8848/nacos/ 访问nacos
* 默认使用nacos/nacos进行登录

### 3、SpringCloud Gateway

##### 3.1 简介

* 网关作为流量入口，常用功能包括路由转发、权限校验、限流控制等等。而SpringCloud GateWay作为SpringCloud官方提出的第二代网关框架，取代了zuul网关。

##### 3.2 概念 

* route: 路由
* predicate: 断言
* filter: 过滤器


请求到达网关，先通过断言判断是否符合路由规则，如果符合路由规则就通过一系列的过滤器路由到指定的路由。

