package com.yooou.yj.req;

import com.yooou.yj.requset.BaseRequest;
import lombok.*;

/**
 * @Author: WangYuJ
 * @Date 2018/11/7
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserReqVO extends BaseRequest {

    @NonNull
    private String userId;
}
