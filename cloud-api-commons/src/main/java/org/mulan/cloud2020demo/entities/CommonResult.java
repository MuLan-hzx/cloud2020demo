package org.mulan.cloud2020demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 韩志雄
 * @date 2021/4/12 14:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{

	private Integer code;

	private String message;

	private T data;

	public CommonResult(Integer code, String message){
		this(code,message,null);
	}
}
