package mx.com.grupoarpa.tickets.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mx.com.grupoarpa.tickets.entity.Ticket;

public interface TicketsRepository extends MongoRepository<Ticket, String> {

}
