package com.krian.spike.validator;

import com.krian.spike.utils.ValidatorUtil;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 自定义校验规则实现类
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile,String> {

	// 是否是必填项，默认值为false:
	private boolean required = false;

	@Override
	public void initialize(IsMobile constraintAnnotation) {
		required = constraintAnnotation.required();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (required){
			return ValidatorUtil.isMobile(value);
		}else {
			if (!StringUtils.hasLength(value)){
				return true;
			}else {
				return ValidatorUtil.isMobile(value);
			}
		}
	}
}