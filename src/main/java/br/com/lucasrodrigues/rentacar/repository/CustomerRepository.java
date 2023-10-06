package br.com.lucasrodrigues.rentacar.repository;

import br.com.lucasrodrigues.rentacar.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {




}
