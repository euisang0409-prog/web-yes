package com.korea.test.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class ResponseDTO<T> {

	private String error;

	private List<T> data;

}