/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/3/18 14:53
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.leguansuo.vo;

import lombok.Data;

@Data
public class AbilitySeqTest {
//    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    private Long id;
//            `ability_name` varchar(256) DEFAULT NULL COMMENT '能力名称',
    private String abilityName;
//            `seq_no` int(5) DEFAULT NULL COMMENT '能力序号',
    private Integer seqNo;
//            `service` varchar(1) DEFAULT NULL COMMENT '所属中台',
    private String service;
//            `ability_org_code` varchar(6) DEFAULT NULL COMMENT '能力提供方编码',


}
