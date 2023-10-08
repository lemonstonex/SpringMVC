package ku.cs.kafe.repository;


import ku.cs.kafe.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

// Napasamon Siribanjong 6410406703
@Repository
public interface PurchaseOrderRepository
        extends JpaRepository<PurchaseOrder, UUID> {
}
