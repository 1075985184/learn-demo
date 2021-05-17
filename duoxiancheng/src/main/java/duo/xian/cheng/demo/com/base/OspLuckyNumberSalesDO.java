/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/4/9 15:57
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OspLuckyNumberSalesDO {
//      `id` bigint(20) NOT NULL AUTO_INCREMENT,
    private Long id;
//  `biz_number` varchar(11) NOT NULL COMMENT '号码',
    private String bizNumber;
//            `province` varchar(5) DEFAULT NULL COMMENT '省份',
    private String province;
//            `region` varchar(5) DEFAULT NULL COMMENT '地市',
    private String region;
//            `edit` int(2) DEFAULT NULL COMMENT '编辑状态',
    private Integer edit;
//            `deposit_amount` decimal(20,2) DEFAULT NULL COMMENT '预存金额',
    private BigDecimal depositAmount;
//            `offset_amount` decimal(20,2) DEFAULT NULL COMMENT '抵消金额',
    private BigDecimal offsetAmount;
//            `agreement_period` int(5) DEFAULT NULL COMMENT '协议期',
    private Integer agreementPeriod;
//            `rule_of_return` varchar(255) DEFAULT NULL COMMENT '返回规则',
    private String ruleOfReturn;
//            `beautiful_number_id` varchar(255) DEFAULT NULL COMMENT '靓号政策ID',
    private String beautifulNumberId;
//            `file_name` varchar(255) DEFAULT NULL COMMENT '上传文件名称',
    private String fileName;
//            `create_time` datetime DEFAULT NULL,
    private LocalDateTime createTime;
//            `update_time` datetime DEFAULT NULL,
    private LocalDateTime updateTime;

    private String returnMsg;
}
