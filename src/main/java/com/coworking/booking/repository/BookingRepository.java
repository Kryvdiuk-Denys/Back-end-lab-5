package com.coworking.booking.repository;

import com.coworking.booking.entity.Booking;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    @EntityGraph(attributePaths = "workspace")
    List<Booking> findAllByOrderByStartsAtDesc();

    boolean existsByWorkspaceId(Long workspaceId);
}
