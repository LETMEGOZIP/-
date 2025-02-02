package org.koreait.mypage.validators;

import org.koreait.global.validators.PasswordValidator;
import org.koreait.mypage.controllers.RequestProfile;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Lazy
@Component
public class ProfileValidator implements Validator, PasswordValidator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestProfile.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RequestProfile form = (RequestProfile) target;
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();

        if(!StringUtils.hasText(password)){
            return;
        }
        if(!StringUtils.hasText(confirmPassword)){
            errors.rejectValue("confirmPassword", "NotBlank");
            return;
        }

        if(password.length()<8){
            errors.rejectValue("password", "size");
        }

        // 2. 비밀번호 복잡성 S
        if (!alphaCheck(password, false) || !numberCheck(password) || !specialCharsCheck(password)) {
            errors.rejectValue("password", "Complexity");
        }
        // 2. 비밀번호 복잡성 E

        // 3. 비밀번호, 비밀번호 확인 일치 여부 S
        if (!password.equals(confirmPassword)) {
            errors.rejectValue("confirmPassword", "Mismatch");
        }
    }
}
