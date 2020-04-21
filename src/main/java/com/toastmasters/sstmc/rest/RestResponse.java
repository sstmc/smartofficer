package com.toastmasters.sstmc.rest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuppressWarnings("serial")
@ApiModel(description = "返回响应数据")
public class RestResponse implements Serializable {

	@ApiModelProperty(value = "是否成功")
	private boolean success = true;
	@ApiModelProperty(value = "返回对象")
	private Object data;
	@ApiModelProperty(value = "错误编号")
	private Integer errCode;
	@ApiModelProperty(value = "错误信息")
	private String message;
}