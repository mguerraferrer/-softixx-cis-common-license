package mx.softixx.cis.common.license.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrivatePracticeAddressResponse {
	private Long id;
	private Long privatePracticeId;
    private Long colonyMxId;
    private String street;
    private String btwStreet;
    private String outsideNumber;
    private String insideNumber;
    private String reference;
    private String lat;
    private String lon;
    private boolean active;
}