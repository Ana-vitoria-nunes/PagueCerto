package org.example.core.port;



import java.util.Optional;

@Repository
public interface CostumerRepository extends JpaRepository<Costumer,String> {

   Optional<Costumer> findByExternalId(String externalIdCostumer);
}
