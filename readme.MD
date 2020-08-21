演示使用SPI（Service Provider Interface）
spi_interface模块定义IPriter接口

good_printer和bad_printer均依赖spi_interface模块并实现IPriter接口

并在resources目录下创建META-INF/services/org.test.junjie.IPrinter文件
文件中的内容为具体的实现类的全路径
##比如:
good_printer的实现类是 `org.test.junjie.good.GoodPrinter`
bad_printer的实现类是 ` org.test.junjie.BadPrinter`
invoker中测试使用

该模式还有很多使用，例如 **JDBC、SLF4J**等等，都是基于此模式实现

