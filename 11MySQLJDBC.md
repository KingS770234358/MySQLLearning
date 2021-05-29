11MySQLJDBC
1.不使用maven工程的情况下要在项目目录下构建lib文件夹,放入项目需要的依赖包;
  然后需要右键lib文件夹,[add as library]

2.开始编写测试代码 com.wq.demo1
1)class.forName要写在主函数里 否则无法识别
2)端口不要连到8080去了,是3306