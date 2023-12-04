package com.salesianostriana.dam.rest.ticket.repo;

import com.salesianostriana.dam.rest.ticket.GetTicketDto;
import com.salesianostriana.dam.rest.ticket.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
