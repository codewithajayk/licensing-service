package com.hirelancer.licensingservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class License {

    @Id
    @Column(name = "license_id", nullable = false)
    private String licenseId;

    private String description;

    @Column(name = "organization_id", nullable = false)
    private String organizationId;
}
