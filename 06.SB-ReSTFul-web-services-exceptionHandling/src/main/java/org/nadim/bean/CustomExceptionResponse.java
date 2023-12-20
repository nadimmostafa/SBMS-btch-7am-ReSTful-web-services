package org.nadim.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomExceptionResponse {
	private Integer code;
	private String status;
	private String date;
	private String message;
}
