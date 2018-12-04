package com.yooou.yj.api;

import com.yooou.yj.OrderService;
import com.yooou.yj.req.OrderReqVO;
import com.yooou.yj.res.OrderResVO;
import com.yooou.yj.response.BaseResponse;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: WangYuJ
 * @Date 2018/11/14
 * @Description:
 */
//@FeignClient(name="order")
@RibbonClient
public interface OrderServiceClient extends OrderService {
    @Override
    public BaseResponse<OrderResVO> getOrder(OrderReqVO reqVO);
}
