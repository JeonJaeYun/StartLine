package com.crud.CRUD.domain.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class JoinDto {

  @NotBlank(message = "ID는 필수입니다.")
  private String userId;

  @NotBlank(message = "비밀번호는 필수입니다.")
  private String password;

  @NotBlank(message = "닉네임은 필수입니다.")
  private String nickname;
}