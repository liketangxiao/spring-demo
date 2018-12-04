package com.yooou.yj.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description:
 * @Author: WangYuJ
 * @Date 2018/11/7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YooouException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -1L;

    private String errCode;
    private String errMsg;

}
