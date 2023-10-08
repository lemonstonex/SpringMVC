package ku.cs.kafe.model;


import lombok.Data;


@Data // Napasamon Siribanjong 6410406703
public class SignupRequest {
    private String username;
    private String password;
    private String name;
}

// ไม่มี id and role เพราะไม่ต้องส่งจาก client มา server ก็ได้
