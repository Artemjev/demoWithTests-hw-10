package com.example.demowithtests.util.validation.validator;

import com.example.demowithtests.util.validation.annotation.constraints.IsBooleanFieldValidConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BooleanFieldValidator implements ConstraintValidator<IsBooleanFieldValidConstraint, Boolean> {

    Boolean expectedValue;

    @Override
    public void initialize(IsBooleanFieldValidConstraint constraintAnnotation) {
        expectedValue = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(Boolean actualValue, ConstraintValidatorContext context) {

        return (expectedValue != null)
//               && (actualValue != null) //! времеенно, ищу проблему!
               && (expectedValue.equals(actualValue));
    }
}
