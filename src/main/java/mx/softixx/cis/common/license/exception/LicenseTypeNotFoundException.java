package mx.softixx.cis.common.license.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import mx.softixx.cis.common.validation.exception.CustomException;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
@EqualsAndHashCode(callSuper = false)
public class LicenseTypeNotFoundException extends CustomException {

	@Getter
	private final Long id;
	@Getter
	private final String code;

	public LicenseTypeNotFoundException(Long id) {
		super("License type not found");
		this.id = id;
		this.code = null;
	}
	
	public LicenseTypeNotFoundException(String code) {
		super("License type not found");
		this.code = code;
		this.id = null;
	}

}