package ku.cs.kafe.entity;


import jakarta.persistence.*;
import lombok.Data;

// ใช้ primary key เป็น composite key ที่มีการเก็บ association
// กับคลาส purchaseitem กับ menu ที่เชื่อมด้วย id
@Data
@Entity
public class OrderItem { // Napasamon Siribanjong 6410406703

    @EmbeddedId
    private OrderItemKey id;


    private int quantity;


    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @MapsId("menuId")
    @JoinColumn(name = "menu_id")
    private Menu menu;

    // คำนวณ
    public double getSubtotal() {
        return menu.getPrice() * quantity;
    }

}
