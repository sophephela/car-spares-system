package com.car.spares.register;


import com.car.spares.entity.VehicleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterModel {

    private String firstname;
    private String lastname;
    private String password;
    private String email;
    public VehicleEntity vehicleEntity = new VehicleEntity("modelX", "Tesla","XY PS 11 45 GP");

}
