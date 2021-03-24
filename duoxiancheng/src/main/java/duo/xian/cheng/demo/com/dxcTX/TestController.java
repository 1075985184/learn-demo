/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/23 17:44
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.dxcTX;

import duo.xian.cheng.demo.com.leguansuo.mapper.RegionMapper;
import duo.xian.cheng.demo.com.leguansuo.vo.AbilitySeqTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("test1")
@RequestMapping("/tx")
public class TestController {

    @Autowired
    private RegionMapper regionMapper;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @RequestMapping("/test3")
    private synchronized String test3(){

        for (int i = 0; i <5 ; i++) {
            final int j=i;
            transactionTemplate.execute((status)->{
                ThreadUtils.newTask(()->{
                if (j==1){
                    int z=1/0;
                }
                AbilitySeqTest abilitySeqTest = new AbilitySeqTest();
                abilitySeqTest.setAbilityName("test");
                abilitySeqTest.setSeqNo(111);
                regionMapper.insert(abilitySeqTest);
            });
                return Boolean.TRUE;
            });}
        return "success";
    }
}
