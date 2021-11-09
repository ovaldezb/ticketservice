package mx.com.grupoarpa.tickets.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Document
public class Ticket {
	
	@Id
	private String id;
	private long idAsiento;
	@JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy HH:mm:ss")
	private Date fechaCompra;
	private long idUsuario;
	private boolean isCortesia;
	private double precio;
	private int tipoBoleto;
	private long idEvento;
	private long idSeccion;
	private long idRecinto;

}
