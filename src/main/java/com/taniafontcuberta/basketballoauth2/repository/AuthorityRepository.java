package com.taniafontcuberta.basketballoauth2.repository;

import com.taniafontcuberta.basketballoauth2.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
