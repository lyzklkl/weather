### 这是一个非常简单的天气预报dome

运用技术:

1. springboot
1. lombok 的 @data
1. slf4j 日志输出
1. HttpClient 请求第三方接口
1. redis NoSQL缓存
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
