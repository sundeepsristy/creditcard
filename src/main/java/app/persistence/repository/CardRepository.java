package app.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import app.persistence.entity.Cards;

@Repository
public interface CardRepository extends JpaRepository<Cards,Long> {



}
