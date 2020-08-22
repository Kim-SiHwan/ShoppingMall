package com.example.atelier.validate;

import com.example.atelier.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Slf4j
public class MemberValidate implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        // TODO Auto-generated method stub
        return Member.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"uid","required","필수 입력 사항");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"upw","required","필수 입력 사항");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"uname","required","필수 입력 사항");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"address","required","필수 입력 사항");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"call","required","필수 입력 사항");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email","required","필수 입력 사항");
    }

}
