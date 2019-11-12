# Knowledge-atlas-of-traditionalChineseMedicine

# 这个项目作为中医药咨询平台的后台服务项目，构建不同的模块给Android client提供请求服务
### 在这里我们有几个包，分别开发不同模块
git clone https://github.com/ongbo/Knowledge-atlas-of-traditionalChineseMedicine.git your-app-name  

或者直接在IDEA中来File->new from Version Controller来构建自己本地的项目  
注意每个人负责一个功能，不要互相修改别人的包或者类，有什么需要协商的自己商量就行
> config：一些公用的配置信息  
controler：springboot Controller  
database: springboot Entity  
repository： springboot Repository  
helper：构建帮助文档和帮助工具信息  
init：初始化类，用于springboot启动和配置  
message：消息类，提供消息服务  
server：配合消息类反应消息  
&emsp;&emsp;  在"Login and Register"版本定义了返回数据包，所有的返回数据包都是基于这中形式  
&emsp; &emsp; &emsp; &emsp; {  
&emsp; &emsp; &emsp; &emsp; &emsp; 
"msg": "状态码"  
&emsp; &emsp; &emsp; &emsp; &emsp; 
"data": {返回的数据json对象}  
&emsp; &emsp; &emsp; &emsp; 
}  
tool：工具包，有图片接受，以及操作本地数据的工具类


