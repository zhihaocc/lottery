package com.lottery.app.controller.lotnum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

@RestController
@ResponseBody
@RequestMapping("/index")
public class LotnumController {
    /**
     *
     * @param type 类别
     * @param listNum 数量
     * @return
     */
    @RequestMapping("/getNumber")
    public List<String> getNum(int type, int listNum) {
        TreeSet<Integer> set2 = new TreeSet<>();

        List<String> resList = new ArrayList<>();
        switch (type) {
            case 1:
                resList = TwoColorBall(listNum);
                break;
            case 2:
                resList = bigHappy((listNum));
                break;
        }
        return resList;
    }

    private List<String> TwoColorBall(int listNum){
        TreeSet<Integer> set = new TreeSet<>();

        List<String> resList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < listNum; i++) {
            while (set.size() < 6) {
                int red = random.nextInt(33) + 1;
                set.add(red);
            }
            int blue = random.nextInt(16) + 1;
            String n =set.toString().replace("[", "").replace("]", " ") + blue;
            resList.add(n);
            System.out.println("双色球 " + n);
            set.clear();
        }
        return resList;
    }

    private List<String> bigHappy(int listNum){

        TreeSet<Integer> set = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listNum; i++) {
            while (set.size() < 5) {
                int red = random.nextInt(35) + 1;
                set.add(red);
            }
            while (set2.size() < 2) {
                int blue = random.nextInt(12) + 1;
                set2.add(blue);
            }
            String result = set.toString().replace("[", "").replace("]", " ")+" "+
                    set2.toString().replace("[", "").replace("]", " ");
            System.out.println("大乐透" + "：" + result);
            set.clear();
        }
        return list;
    }

}
