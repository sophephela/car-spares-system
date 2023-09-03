package com.car.spares.register;

import com.car.spares.entity.UserEntity;
import com.car.spares.entity.VehicleEntity;
import com.car.spares.services.UserService;

public class RegisterService {
    public void registerUser(RegisterModel registerModel ){
        UserService userService = new UserService();
        UserEntity user = new UserEntity(
                registerModel.getFirstname(),
                registerModel.getLastname(),
                registerModel.getPassword(),
                registerModel.getEmail(),
                new VehicleEntity(
                        registerModel.vehicleEntity.regNumber,
                        registerModel.vehicleEntity.model,
                        registerModel.vehicleEntity.brand
                )
        );
        userService.createUser(user);
    }
}
