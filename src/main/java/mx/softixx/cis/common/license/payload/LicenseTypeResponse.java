package mx.softixx.cis.common.license.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LicenseTypeResponse {
	private Long id;
	private String code;
	private String valueMx;
	private String valueUs;
	private boolean active;
}