package com.yooou.yj;

import com.yooou.yj.api.OrderServiceClient;
import com.yooou.yj.enums.StatusEnum;
import com.yooou.yj.req.OrderReqVO;
import com.yooou.yj.req.UserReqVO;
import com.yooou.yj.res.OrderResVO;
import com.yooou.yj.res.UserResVO;
import com.yooou.yj.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: WangYuJ
 * @Date 2018/11/7
 * @Description:
 */
@RestController
public class UserController implements UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderServiceClient orderServiceClient;

    @Override
    public BaseResponse<UserResVO> getUser(@RequestBody UserReqVO userReqVO) {

        UserResVO userResVO = new UserResVO();
        userResVO.setUserId(userReqVO.getUserId());
        userResVO.setUserName("yooou");
        OrderReqVO reqVO = new OrderReqVO();
        reqVO.setOrderId("o000001");
        ResponseEntity<Object> baseResponse = restTemplate.postForEntity("http://sbc-order/order/getOrderNo", reqVO, Object.class);

        return new BaseResponse(StatusEnum.SUCCESS,userResVO);
    }
}
