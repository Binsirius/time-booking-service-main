package com.fantasy.tbs.repository;

import com.fantasy.tbs.domain.TimeBooking;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data SQL repository for the TimeBooking entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TimeBookingRepository extends JpaRepository<TimeBooking, Long> {
    /*
    *  query the time booking by personal Name
    * */
    List<TimeBooking> findByPersonalNumber(String personalNumber);
}
