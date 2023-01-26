package mx.softixx.cis.common.license.payload;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import mx.softixx.cis.common.validation.group.OnCreate;
import mx.softixx.cis.common.validation.group.OnUpdate;
import mx.softixx.cis.common.validation.message.ValidatorMessage;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserLicenseBase {
	@Null(groups = OnUpdate.class, message = ValidatorMessage.NULLABLE)
	@NotNull(groups = OnCreate.class, message = ValidatorMessage.REQUIRED)
	private Long userId;
	
	@Null(groups = OnUpdate.class, message = ValidatorMessage.NULLABLE)
	@NotEmpty(groups = OnCreate.class, message = ValidatorMessage.REQUIRED)
	private String serie;
	
	private LocalDateTime activationDate;
	private LocalDateTime actualizationDate;
	
	@NotNull(groups = OnCreate.class, message = ValidatorMessage.REQUIRED)
	private LocalDate dueDate;
}