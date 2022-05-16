package com.graduate_ok.graduate_ok.dto;

import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BoardInsertDto {
    @ApiParam(value = "게시글 작성자")
    private String brdWriter;
    @ApiParam(value = "게시글 비밀번호")
    private String brdPassword;
    @ApiParam(value = "게시글 제목")
    private String brdTitle;
    @ApiParam(value = "게시글 콘텐츠")
    private String brdContent;
}
