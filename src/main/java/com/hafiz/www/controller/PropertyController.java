package com.hafiz.www.controller;

import com.hafiz.www.service.PropertiesService;
import com.hafiz.www.util.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Desc:properties测试控制器
 * Created by hafiz.zhang on 2016/9/16.
 */
@Controller
@RequestMapping("/prop")
public class PropertyController {
    @Autowired
    private PropertiesService ps;

    @ResponseBody
    @RequestMapping(value = "/way/first", method = RequestMethod.GET)
    public String getPropertyByFirstWay(){
        return ps.getProperyByFirstWay();
    }

    @ResponseBody
    @RequestMapping(value = "/way/second", method = RequestMethod.GET)
    public String getPropertyBySecondWay(){
        return ps.getProperyBySecondWay();
    }

    @ResponseBody
    @RequestMapping(value = "/way/third", method = RequestMethod.GET)
    public String getPropertyByThirdWay(){
        return ps.getProperyByThirdWay();
    }

    @ResponseBody
    @RequestMapping(value = "/way/fourth/{key}", method = RequestMethod.GET)
    public String getPropertyByFourthWay(@PathVariable("key") String key){
        return ps.getProperyByFourthWay(key, "defaultValue");
    }

    @ResponseBody
    @RequestMapping(value = "/way/fifth/{key}", method = RequestMethod.GET)
    public String getPropertyByFifthWay(@PathVariable("key") String key){
        return PropertyUtil.getProperty(key, "defaultValue");
    }
}
