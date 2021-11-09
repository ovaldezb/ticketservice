package mx.com.grupoarpa.tickets.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mx.com.grupoarpa.tickets.entity.Seat;

public interface SeatRepository extends MongoRepository<Seat, String> {

}
