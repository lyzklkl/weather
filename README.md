### 这是一个非常简单的天气预报demo

运用技术:

1. springboot
1. lombok 的 @data
1. slf4j 日志输出
1. HttpClient 请求第三方接口
1. redis NoSQL缓存(每次请求会打印到日志,每条数据只在redis中存在20秒)
1. quart定时任务
1. Swagger ui 接口测试文档

---

目前只有一个接口:

```text
${URL}/city/<城市名字>
```
实例:
```text
liyuzhen.top:30001/city/晋城
```

---

Swagger ui 接口测试文档地址

```text
${URL}/swagger-ui.html
```
实例:
```text
liyuzhen.top:30001/swagger-ui.html
```

---

查看日志信息
```text
view-source:http://liyuzhen.top:40001/spring_weather.html
```
