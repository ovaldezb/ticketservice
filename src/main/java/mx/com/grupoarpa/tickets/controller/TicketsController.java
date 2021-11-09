package mx.com.grupoarpa.tickets.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.grupoarpa.tickets.entity.Ticket;
import mx.com.grupoarpa.tickets.repository.TicketsRepository;



@RestController
@RequestMapping("/api/ticket")
public class TicketsController {

	//@Autowired
	//private RestTemplate restTemplate;
	
	@Autowired
	private TicketsRepository ticketRepo;

	@GetMapping()
	public ResponseEntity<?> getTicketList(){
		List<Ticket> list = ticketRepo.findAll();
		//log.trace(role);
		if(list.isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(list);
		}
		
	}
	
	@GetMapping("/{idTicket}")
	public ResponseEntity<?> getTicket(@PathVariable String idTicket){
		return null;
	}
	
	@PostMapping()
	public ResponseEntity<?> addTicket(@RequestBody Ticket ticket){
		return ResponseEntity.ok(ticketRepo.save(ticket));
	}
	
	@PutMapping()
	public ResponseEntity<?> updateTicket(@PathVariable String idTicket, @RequestBody Ticket ticket ){
		return null;
	}
	
	@DeleteMapping("/{idTicket}")
	public ResponseEntity<?> deleteTicket(@PathVariable String idTicket){
		return null;
	}
	
	

}
