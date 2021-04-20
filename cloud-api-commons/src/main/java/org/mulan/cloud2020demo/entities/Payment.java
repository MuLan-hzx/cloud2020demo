package org.mulan.cloud2020demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 韩志雄
 * @date 2021/4/12 14:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

	private long id;

	private String serial;

}

