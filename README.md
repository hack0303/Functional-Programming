# Functional-Programming
Functional Programming

# JAVA 下的函数式编程
## 故事 Lambda 表达式(引入时间java8)
众所周知，JAVA是面向对象语言，面向对象集大成者的一个语言。
面向对象对于大型项目的构建有其优势，然后有时也显得太重。
因为这些原因，JAVA引入了函数式编程的一些特性，对整个语言进行了一些增强，由此出现了project lambda，又在JAVA8中被合并进来，作为java8版本发布
注 Lambda 表达式 非正式地又可以叫 “闭包”或“匿名方法”
## 相关特性
- Lambda 表达式（非正式地，“闭包”或“匿名方法”）
- 方法和构造函数引用
- 扩展的目标类型和类型推断
- 接口中的默认和静态方法

## 主要提供的功能接口
此外，Java SE 8 增加了一个新的包， java.util.function，其中包含预期常用的功能接口，例如：
- Predicate<T>-- 对象的布尔值属性
- Consumer<T>-- 对对象执行的操作
- Function<T,R>-- 将 T 转换为 R 的函数
- Supplier<T>-- 提供一个 T 的实例（例如一个工厂）
- UnaryOperator<T>-- 从 T 到 T 的函数
- BinaryOperator<T>-- 从 (T, T) 到 T 的函数

# Q&A
- @FunctionalInterface 干嘛的,一定要加吗
这个注解主要用在编译期，加了可以校验是否符合SAM原则，不符合会报错

# REF
[常见的4种编程范式比较](https://juejin.cn/post/6844904078858797063)
[JDK 8](https://openjdk.java.net/projects/jdk8/)
[Project Lambda](https://openjdk.java.net/projects/lambda/)
[State of the Lambda](https://cr.openjdk.java.net/~briangoetz/lambda/lambda-state-final.html)
[State of the Lambda: Libraries Edition](https://cr.openjdk.java.net/~briangoetz/lambda/lambda-libraries-final.html)