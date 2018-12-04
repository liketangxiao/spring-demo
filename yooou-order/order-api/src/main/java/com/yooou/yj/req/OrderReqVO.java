package com.yooou.yj.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: WangYuJ
 * @Date 2018/11/14
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderReqVO {
    private String orderId;
    private String orderName;
}
