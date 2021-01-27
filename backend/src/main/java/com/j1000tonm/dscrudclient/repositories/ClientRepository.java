package com.j1000tonm.dscrudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.j1000tonm.dscrudclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
