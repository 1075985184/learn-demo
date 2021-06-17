/**
 * Copyright (C), 2015‐2021,
 * Author:  lihui
 * Date:  2021/6/17 14:21
 * History:
 * <author> <time> <version> <desc>
 */
package duo.xian.cheng.demo.com.redis;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User implements Serializable {
    private String name;
    private String age;
}
