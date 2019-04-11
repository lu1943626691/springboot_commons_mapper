package com.baizhi.controller;

import com.baizhi.dao.PersonDao;
import com.baizhi.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("person")
public class PersonController {
    //测试
    @Autowired
    PersonDao personDao;
    @RequestMapping("select")
    public String select(ModelMap modelMap){
        List<Person> list = personDao.selectAll();
        for (Person person : list) {
            System.out.println(person);
        }
        modelMap.addAttribute("list",list);
        return "index";
    }
}
