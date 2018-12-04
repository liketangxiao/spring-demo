package com.yooou.yj;

import com.yooou.yj.req.OrderReqVO;
import com.yooou.yj.res.OrderResVO;
import com.yooou.yj.response.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin2.message.GetAppletMessage;

/**
 * @Author: WangYuJ
 * @Date 2018/11/14
 * @Description:
 */
@RestController
@RequestMapping(value = "/order")
public interface OrderService {

    @GetMapping(value = "/getOder")
    BaseResponse<OrderResVO> getOrder(@RequestBody OrderReqVO reqVO);
}
