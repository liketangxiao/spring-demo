package com.yooou.yj.fallback;

import com.yooou.yj.api.OrderServiceClient;
import com.yooou.yj.enums.StatusEnum;
import com.yooou.yj.req.OrderReqVO;
import com.yooou.yj.res.OrderResVO;
import com.yooou.yj.response.BaseResponse;

/**
 * @Author: WangYuJ
 * @Date 2018/11/14
 * @Description:
 */
public class OrderServiceFallBack implements OrderServiceClient {
    @Override
    public BaseResponse<OrderResVO> getOrder(OrderReqVO reqVO) {
        BaseResponse<OrderResVO> baseResponse = new BaseResponse<>();
        OrderResVO resVO = new OrderResVO();
        reqVO.setOrderId(reqVO.getOrderId());
        reqVO.setOrderName("ordername");
        baseResponse.setDataBody(resVO);
        baseResponse.setCode(StatusEnum.SUCCESS.getCode());
        baseResponse.setMsg(StatusEnum.SUCCESS.getMsg());
        return baseResponse;
    }
}
