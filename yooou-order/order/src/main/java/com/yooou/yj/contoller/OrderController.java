package com.yooou.yj.contoller;

import com.yooou.yj.OrderService;
import com.yooou.yj.req.OrderReqVO;
import com.yooou.yj.res.OrderResVO;
import com.yooou.yj.response.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangYuJ
 * @Date 2018/11/14
 * @Description:
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController implements OrderService {

    @Override
    public BaseResponse<OrderResVO> getOrder(OrderReqVO reqVO) {

        return null;
    }
}
