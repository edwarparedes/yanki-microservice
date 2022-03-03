package com.nttdata.yanki.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Yanki {
    @Id
    private String id;
    private String phoneNumber;
    private String typeDocument;
    private String imei;
    private String email;
    private Double balance;
    private String accountId;
}
