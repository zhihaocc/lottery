package com.lottery.app.config;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Test2Mapper {
    public List<Test2> getTreeList(){
        List<Test2> list = new ArrayList<>();
        Test2 test1 = new Test2("1",null,"第一");
        list.add(test1);

        Test2 test2 = new Test2("2",null,"第二");
        list.add(test2);

        Test2 test3 = new Test2("1》1","1","第一下面的第一");
        list.add(test3);

        Test2 test4 = new Test2("1》1》1","1》1","第一下面的第一下面的第一");
        list.add(test4);
        return list;
    }
}
