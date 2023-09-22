package com.foksuzoglu.ShareYourCar.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "vehicle_maintenance")
public class VehicleMaintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    private String maintenanceType;
    private Date maintenanceDate;
    private String description;
    private double cost;

}