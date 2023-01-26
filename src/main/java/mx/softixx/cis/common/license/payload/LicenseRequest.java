package mx.softixx.cis.common.license.payload;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
public class LicenseRequest extends LicenseBase {}