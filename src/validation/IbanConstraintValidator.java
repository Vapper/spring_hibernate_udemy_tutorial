package validation;

import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Value;

public class IbanConstraintValidator implements
		ConstraintValidator<Iban, String> {
	
	@Value(value="${isoCountryCodes}")
	private Map<String, String> isoCountryCodes;
	private Set<String> isoCountryCode;

	public void initialize(){
		this.isoCountryCode = this.isoCountryCodes.keySet();
	}

	public boolean isValid(String input, ConstraintValidatorContext constraintValidatorContext) {
		if(input != null){
			System.out.println("iso: " + isoCountryCode);
			return isoCountryCode.contains(input.substring(0,2));
		}
		return true;
	}
}
