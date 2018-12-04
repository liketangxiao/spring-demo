package com.yooou.yj.requset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

/**
 * Created by WangYuJ on 2018/11/7
 *
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseRequest {

    private String reqNo;

    private String timeStamp;
}
