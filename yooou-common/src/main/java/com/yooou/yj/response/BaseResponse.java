package com.yooou.yj.response;

import com.yooou.yj.enums.StatusEnum;
import lombok.*;

import java.io.Serializable;

/**
 * Created by WangYuJ on 2018/11/7
 *
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = -1L;

    private String code;

    private String msg;

    private T dataBody;

    public BaseResponse(StatusEnum statusEnum, T t) {
        this.code = statusEnum.getCode();
        this.msg = statusEnum.getMsg();
        this.dataBody = t;
    }
}
