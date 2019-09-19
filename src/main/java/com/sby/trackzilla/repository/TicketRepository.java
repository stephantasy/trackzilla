package com.sby.trackzilla.repository;

import com.sby.trackzilla.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
