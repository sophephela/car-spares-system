package com.car.spares.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    public String firstname;
    public String lastname;
    public String password;
    public String emailAddress;
    public VehicleEntity vehicleEntity;
}
