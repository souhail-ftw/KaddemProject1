package tn.ey.dev.kaddemproject.repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import tn.ey.dev.kaddemproject.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}
