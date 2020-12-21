package com.mycompany.g13.repository;

import com.mycompany.g13.Model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client,String> {
 
  Client  findByPhoneNumber (String phoneNumber);

}
