package ku.cs.kafe.model;


import lombok.Data;

import java.util.UUID;

// ใช้เป็น DTO
@Data // Napasamon Siribanjong 6410406703
public class MenuRequest {
    private String name;
    private UUID categoryId; // ให้รองรับ category
    private double price;
}
