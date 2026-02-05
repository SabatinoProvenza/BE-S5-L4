package sabatinoprovenza.BE_S5_L4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sabatinoprovenza.BE_S5_L4.entities.Topping;

@Repository
public interface ToppingRepository extends JpaRepository<Topping, Long> {
}
