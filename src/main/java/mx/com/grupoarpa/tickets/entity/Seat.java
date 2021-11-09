package mx.com.grupoarpa.tickets.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Seat {
	
	@Id
	private String id;
	private String folio;
	private long idSection;
	private long idFairground; //Recinto
	private String row;

}
