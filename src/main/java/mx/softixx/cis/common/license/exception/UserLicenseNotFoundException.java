package mx.softixx.cis.common.license.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import mx.softixx.cis.common.validation.exception.CustomException;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
@EqualsAndHashCode(callSuper = false)
public class UserLicenseNotFoundException extends CustomException {

	@Getter
	private final Long id;
	@Getter
	private final Long userId;
	@Getter
	private final Long licenseId;
	@Getter
	private final String serie;
	private static final String ERROR_MESSAGE = "User license not found";

	public UserLicenseNotFoundException(Long id) {
		super(ERROR_MESSAGE);
		this.id = id;
		this.userId = null;
		this.licenseId = null;
		this.serie = null;
	}
	
	public UserLicenseNotFoundException(Long userId, Long licenseId) {
		super(ERROR_MESSAGE);
		this.id = null;
		this.userId = userId;
		this.licenseId = licenseId;
		this.serie = null;
	}
	
	public UserLicenseNotFoundException(Long id, Long userId, Long licenseId) {
		super(ERROR_MESSAGE);
		this.id = id;
		this.userId = userId;
		this.licenseId = licenseId;
		this.serie = null;
	}
	
	public UserLicenseNotFoundException(String serie) {
		super(ERROR_MESSAGE);
		this.serie = serie;
		this.id = null;
		this.userId = null;
		this.licenseId = null;
	}
	
}