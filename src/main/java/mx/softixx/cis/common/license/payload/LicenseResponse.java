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
public class LicenseResponse extends LicenseBase {
	private Long id;
	private String hash;
	private LicenseTypeResponse licenseType;
}