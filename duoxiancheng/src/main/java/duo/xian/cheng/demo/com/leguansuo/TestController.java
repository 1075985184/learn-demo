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
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/leguansuo")
public class TestController {

    @Autowired
    private RegionMapper regionMapper;

    @Value("${number.status}")
    private String[] status;

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

    @RequestMapping("testArray")
    private  String test3(){
        for (String s : status) {
            System.out.println(s);
        }
        return status.toString();
    }

    @RequestMapping("testlog")
    private  String testLog(String code){
        if (log.isDebugEnabled()) {
            log.info("testLog: {}",code);
        }
        return code;
    }


    }


