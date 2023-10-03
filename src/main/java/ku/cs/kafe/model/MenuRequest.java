package ku.cs.kafe.model;


import lombok.Data;

import java.util.UUID;

// ใช้เป็น DTO
@Data
public class MenuRequest {
    private String name;
    private UUID categoryId; // ให้รองรับ category
    private double price;
}
