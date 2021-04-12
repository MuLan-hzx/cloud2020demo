package org.mulan.cloud2020demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 韩志雄
 * @date 2021/4/12 14:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

	private long id;

	private String serial;

}
