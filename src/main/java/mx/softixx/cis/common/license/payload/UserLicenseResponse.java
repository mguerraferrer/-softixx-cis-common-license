package mx.softixx.cis.common.license.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserLicenseResponse extends UserLicenseBase {
	private Long id;
	private LicenseResponse license;
	private boolean privatePractice;
	private boolean clinicalEntity;
	private boolean licenseMxn;
	private boolean licenseUsd;
	private boolean active;
}