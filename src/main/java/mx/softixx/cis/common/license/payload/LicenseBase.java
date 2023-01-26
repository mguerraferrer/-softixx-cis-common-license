package mx.softixx.cis.common.license.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LicenseBase {
	private Integer totalSpecialities;
	private Integer totalDoctors;
	private Integer totalAssistants;
	private Integer totalNurses;
	private Integer dailyConsultations;
	private Integer duration;
	private String description;
	private Integer level;
	private boolean active;
}