package com.baizhi;

import com.baizhi.dao.PersonDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import com.baizhi.entity.Person;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Person2 {
    @Autowired
    PersonDao personDao;
    //查询全部
    @Test
    public void selectAll() {
        List<Person> people = personDao.selectAll();
        for (Person person : people) {
            System.out.println(people);
        }
    }
    @Test
    public void select() {
        Person p = new Person();
      p.setAge(12);
        List<Person> people = personDao.select(p);
        for (Person person : people) {
            System.out.println(people);
        }
    }

}
