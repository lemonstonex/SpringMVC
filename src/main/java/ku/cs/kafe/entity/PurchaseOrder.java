package ku.cs.kafe.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import ku.cs.kafe.common.Status;
import lombok.Data;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Data
@Entity
public class PurchaseOrder { // Napasamon Siribanjong 6410406703
    @Id
    @GeneratedValue
    private UUID id;


    private LocalDateTime timestamp;
    private Status status;


    @OneToMany(mappedBy = "purchaseOrder")
    private List<OrderItem> items = new ArrayList<>();

    // ของออเดอร์ทั้งหมด
    public double getTotal() {
        double total = 0;
        for (OrderItem item : items)
            total += item.getSubtotal();
        return total;
    }

}

