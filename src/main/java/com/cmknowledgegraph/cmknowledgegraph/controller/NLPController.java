package com.cmknowledgegraph.cmknowledgegraph.controller;

import com.cmknowledgegraph.cmknowledgegraph.server.ReturnData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/*
* 搜索功能实现
* 通过自然语言处理
* 提取自己的治病简案和养生方案
* */
@Controller
@RequestMapping("/search")
public class NLPController {

    /*
    * 提交到服务器tomcat运行时
    * 当Android通过http请求访问"http:114.55.37.70:80/CMKnowledgeGraph/search/knowledgegraph"访问时，自动调用该方法
    *
    * 当在本地IDE运行时，会访问"http:localhost:8080/search/knowledgegraph"访问，这个没有项目名'CMKnowledgeGraph'，是打包的缘故
    *
    * ReturnData是server包里面的一个数据结构
    * 定义了
    * msg：作为返回的消息码，比如成功没有，像登录注册功能就是返回手机号不正确，密码不正确，或者成功了返回success，这里可以自己定义类变量来作为返回消息
    * data：实际返回可以用的数据
    *
    * */
    @RequestMapping("/knowledgegraph")
    @ResponseBody
    public ReturnData knowledgegraphhandle(@RequestParam("sentence") String sentence){
        return null;
    }
}
