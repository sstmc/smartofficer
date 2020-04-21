package com.toastmasters.sstmc.entities;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Member(Entity) orm mysql->Member(table)
 * 
 * @author zhuow
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
@ApiModel(description = "user")
@SuppressWarnings("serial")
public class User implements Serializable {
	@ApiModelProperty(hidden = true)
	private Long id; // unique key
	private String username; // short name
	private String name; // full name
	private String org_ID;
	private String role_ID;
	private String email;
	private String wechat;
}
