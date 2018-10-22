# jsonLogQueryWithSqlL

#### 项目介绍
基于antlr4.0语法解析sql语句,直接对json格式的日志进行解析,支持命令行操作.

如:
对于内容为:
    {
    "ip": "112.192.145.234",
    "name": "Rezar249894106",
    "age": 9,
    "let": "testJson",
    "address": {
        "stree": null,
        "city": "nanchang",
        "prov": "xizang"
    },
    "userInfo": {
        "appId": "4j3&+5!*5hpb6fi^coent91",
        "adslotId": 66493420,
        "comments": [
            "hehe",
            "hahaha",
            "xixixi"
        ]
    },
    "subUserInfos": [
        {
            "appId": "j!^5di%^ype9%#8$vz_znxv",
            "adslotId": 50285540,
            "comments": [
                "hehe0",
                "hahaha01",
                "xixixi5"
            ]
        },
        {
            "appId": "&$4@s82z*x5^w3w_j0l@v$%",
            "adslotId": 32755945,
            "comments": [
                "hehe1",
                "hahaha11",
                "xixixi6"
            ]
        }
    ],
    "time": "2032-02-02 18:39:58 720",
    "arrayInfos": [
        "abc",
        "def",
        "ghi"
    ]
}
    格式的日志.
    
可执行查询参数:
    -d /Users/rezar/RezarWorkSpace/eclipseWorkSpcae/log/logFiles -p test.log -jsql "select count(age) as countOfAge , age  from testJson where random() <= 0.4 group by age,countOfAge"   -fmt "count:{countOfAge} and age:{age}"

参数说明:

    Usage:  [options]
  Options:
    --help, -h

    -a
      结果文件打印是否追加?
      Default: false
    -dir, -d
      日志文件所在的目录,默认为当前目录下
    -f
      结果输出到文件,输入文件路径
    -fmt
      格式化输出内容, e.g.文件:${fileName},ip:${ip} -- 请求数量:${num}

    -j
      json格式打印?
      Default: false
      
  * -jsql
      日志检索的json(jsql语句请用双引号括起来),支持多个-jsql属性
    -l
      json格式打印的时候补加logEventType
  * -p
      检索日志文件名称的正则表达式,e.g. *testFile.log
    -sys
      结果控制台打印?
      Default: true

#### 软件架构
基于antlr4构建mysql 查询语句解析器和json日志解析器,并执行相关查询和聚合操作.


#### 安装教程

1.本地执行package操作
2.cd target , java -jar jsonQuery.jar -h 即可查询配置参数解释
3.ext目录下有sh执行文件,替换下jar的位置即可直接使用 jq.sh -h 来执行查询操作.

