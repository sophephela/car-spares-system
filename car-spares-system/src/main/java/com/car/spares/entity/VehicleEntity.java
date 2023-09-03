package com.car.spares.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleEntity {
    public String model;
    public String brand;
    public String regNumber;
}
