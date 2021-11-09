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

import mx.com.grupoarpa.tickets.entity.Seat;
import mx.com.grupoarpa.tickets.repository.SeatRepository;

@RestController
@RequestMapping("/api/seat")
public class SeatController {
	
	@Autowired
	SeatRepository seatRepo;

	@GetMapping()
	public ResponseEntity<?> getSeatList(){
		List<Seat> list = seatRepo.findAll();
		//log.trace(role);
		if(list.isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(list);
		}
		
	}
	
	@GetMapping("/{idSeat}")
	public ResponseEntity<?> getSeat(@PathVariable String idSeat){
		return null;
	}
	
	@PostMapping()
	public ResponseEntity<?> addSeat(@RequestBody Seat seat){
		return ResponseEntity.ok(seatRepo.save(seat));
	}
	
	@PutMapping()
	public ResponseEntity<?> updateSeat(@PathVariable String idSeat, @RequestBody Seat ticket ){
		return null;
	}
	
	@DeleteMapping("/{idSeat}")
	public ResponseEntity<?> deleteSeat(@PathVariable String idSeat){
		return null;
	}
}
