项目比较简单，是一个hibernate的入门程序

这里有主要的配置文件
##customer.hbm.xml
这里是Customer类的一个映射文件
文件中主要是表示了Customer对象和数据库中的cst_customer表的映射关系

##hibernate.cfg.xml
这是主配置，是关于hibernate的sessionFactory的配置
里面是包含了数据库的连接以及加载映射文件 
