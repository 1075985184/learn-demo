/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/18 14:58
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.leguansuo;


import duo.xian.cheng.demo.com.leguansuo.mapper.RegionMapper;
import duo.xian.cheng.demo.com.leguansuo.vo.AbilitySeqTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/leguansuo")
public class TestController {

    @Autowired
    private RegionMapper regionMapper;

    @RequestMapping("test1")
    private String test(){
        int baseInfo = regionMapper.findMax();
        int sn = baseInfo;
        for (int i = 1; i < 1000; i++) {
            sn++;
            System.out.println("i======="+i+"sn========"+sn);
            int update = regionMapper.update(sn);
            if (update > 0) {
                System.out.println(sn);
                return "success";
            }
        }
        return "error";
    }
    @RequestMapping("test2")
    private synchronized String test2(){
        int baseInfo = regionMapper.findMax();
        int update = regionMapper.update(baseInfo+1);
          if (update>0){
              return "success";
          }
        return "error";

    }
    }


