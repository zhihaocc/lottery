package com.lottery.app.controller.lotnum;

import com.lottery.app.util.response.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

@RestController
@ResponseBody
@Slf4j
@Api(value = "获取随机数", tags = "获取随机数")
@RequestMapping("/index")
public class LotnumController {
    /**
     *
     * @param type 类别
     * @param listNum 数量
     * @return
     */
    @RequestMapping("/getNumber")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "获取类别(1 双色球 2大乐透)", required = true,paramType = "json"),
            @ApiImplicitParam(name = "listNum", value = "获取几组,默认1",paramType = "json")
    })
    public R<List<String>> getNum(Integer type, Integer listNum) {
        listNum = listNum==null || listNum == 0 ? 1 : listNum;
        if (listNum > 100){
            return R.fail("最多获取100组号码！");
        }

        List<String> resList = new ArrayList<>();
        switch (type) {
            case 1:
                resList = twoColorBall(listNum);
                break;
            case 2:
                resList = bigHappy((listNum));
                break;
            default:
        }
        return R.data(resList);
    }

    /**
     * 双色球
     * @param listNum
     * @return
     */
    private List<String> twoColorBall(int listNum){
        TreeSet<String> set = new TreeSet<>();
        List<String> resList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < listNum; i++) {
            while (set.size() < 6) {
                int red = random.nextInt(33) + 1;
                //两位数左补0
                set.add(String.format("%02d",red));
            }
            int blue = random.nextInt(16) + 1;
            String n =set.toString().replace("[", "").replace("]", " ")
                    + String.format("%02d",blue);
            n = listNum==1 ? n : String.format("%02d",i+1)+" : "+n;
            resList.add(n);
            log.info("双色球: "+resList);
            set.clear();
        }
        return resList;
    }

    /**
     * 大乐透
     * @param listNum
     * @return
     */
    private List<String> bigHappy(int listNum){
        TreeSet<String> set = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listNum; i++) {
            while (set.size() < 5) {
                int red = random.nextInt(35) + 1;
                set.add(String.format("%02d",red));
            }
            while (set2.size() < 2) {
                int blue = random.nextInt(12) + 1;
                set2.add(String.format("%02d",blue));
            }
            String result = set.toString().replace("[", "").replace("]", " ")+" "+
                    set2.toString().replace("[", "").replace("]", " ");

            result = listNum==1 ? result : String.format("%02d",i+1)+" : "+result;
            list.add(result);
            log.info("大乐透" + "：" + result);
            set.clear();
            set2.clear();
        }
        return list;
    }

}
