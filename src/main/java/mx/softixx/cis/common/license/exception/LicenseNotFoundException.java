package mx.softixx.cis.common.license.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
@Data
@EqualsAndHashCode(callSuper = false)
public class LicenseNotFoundException extends RuntimeException {

	public LicenseNotFoundException() {
		super("License not found");
	}
	
}