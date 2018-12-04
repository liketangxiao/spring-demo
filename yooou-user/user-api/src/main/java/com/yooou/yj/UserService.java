package com.yooou.yj;

import com.yooou.yj.req.UserReqVO;
import com.yooou.yj.res.UserResVO;
import com.yooou.yj.response.BaseResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangYuJ
 * @Date 2018/11/7
 * @Description:
 */
@RestController
@RequestMapping(value = "/userService")
public interface UserService {

    @PostMapping(value = "/getUser")
    public BaseResponse<UserResVO> getUser(UserReqVO userReqVO);
}
