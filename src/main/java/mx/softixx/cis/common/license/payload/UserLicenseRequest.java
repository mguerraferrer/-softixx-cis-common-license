package mx.softixx.cis.common.license.payload;

import jakarta.validation.GroupSequence;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import mx.softixx.cis.common.validation.group.OnCreate;
import mx.softixx.cis.common.validation.message.ValidatorMessage;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@GroupSequence({UserLicenseRequest.class})
public class UserLicenseRequest extends UserLicenseBase {
	@NotNull(groups = OnCreate.class, message = ValidatorMessage.REQUIRED)
	private Long licenseId;
	
	@NotNull(groups = OnCreate.class, message = ValidatorMessage.REQUIRED)
	private Boolean privatePractice;
	
	@NotNull(groups = OnCreate.class, message = ValidatorMessage.REQUIRED)
	private Boolean clinicalEntity;
	
	@NotNull(groups = OnCreate.class, message = ValidatorMessage.REQUIRED)
	private Boolean licenseMxn;
	
	@NotNull(groups = OnCreate.class, message = ValidatorMessage.REQUIRED)
	private Boolean licenseUsd;
	
	@NotNull(groups = OnCreate.class, message = ValidatorMessage.REQUIRED)
	private Boolean active;
}