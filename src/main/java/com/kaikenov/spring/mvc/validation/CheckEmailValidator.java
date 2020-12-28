package com.kaikenov.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

    private String endOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        this.endOfEmail = checkEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext validatorContext) {
        return enteredValue.endsWith(this.endOfEmail);
    }
}
