package mx.softixx.cis.common.license.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;
import mx.softixx.cis.common.validation.exception.CustomException;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
@Data
@EqualsAndHashCode(callSuper = false)
public class UserLicenseAlreadyExistsException extends CustomException {

	public UserLicenseAlreadyExistsException() {
		super("There is already a license associated with the specified user or has the same serie");
	}
	
}