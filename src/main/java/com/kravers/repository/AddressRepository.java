package com.kravers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kravers.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
