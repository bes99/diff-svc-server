package com.example.diffsvcserver.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Data
@Schema(description = "회원가입 정보")
public class UserFormDTO {

    @NotBlank(message = "아이디 입력은 필수입니다.")
    @Schema(description = "string", defaultValue = "example123")
    private String userId;

    @NotBlank(message = "비밀번호 입력은 필수입니다.")
    @Schema(description = "string", defaultValue = "example12!")
    private String userPwd;

    @NotBlank(message = "성별 입력은 필수입니다.")
    @Schema(description = "string", defaultValue = "남자", allowableValues = {"남자", "여자"})
    private String sex;

    @Email(message = "이메일 형식이 올바르지 않습니다.")
    @NotBlank(message = "이메일 입력은 필수입니다.")
    @Schema(description = "string", defaultValue = "example@naver.com")
    private String email;

}
