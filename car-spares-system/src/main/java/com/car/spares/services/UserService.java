package com.car.spares.services;

import com.car.spares.entity.UserEntity;
import com.car.spares.entity.VehicleEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class UserService {
    private String collectionName = "User";
    public UserEntity getUser(String id) {
        try{
            Firestore db = FirestoreClient.getFirestore();
            DocumentReference documentReference = db.collection(collectionName).document(id);
            ApiFuture<DocumentSnapshot> future = documentReference.get();
            DocumentSnapshot document = future.get();
            System.out.println("document.exists: " + document.exists());
            if (document.exists()) {
                UserEntity personalDetailsModel;
                personalDetailsModel = document.toObject(UserEntity.class);
                return personalDetailsModel;
            }
        }catch(Exception e){
            //Throw Exception here...

            e.printStackTrace();
        }

        return null;
    }
    public String createUser(UserEntity user){
        Firestore db = FirestoreClient.getFirestore();
        CollectionReference collection = db.collection(collectionName);
        List<ApiFuture<WriteResult>> future = new ArrayList<>();

        future.add(
                collection.document(user.emailAddress.toLowerCase()).create(
                        new UserEntity(
                                user.firstname,
                                user.lastname,
                                user.password,
                                user.emailAddress,
                                new VehicleEntity(
                                        user.vehicleEntity.regNumber,
                                        user.vehicleEntity.model,
                                        user.vehicleEntity.brand
                                )
                        )
                )
        );
        return LocalDate.now().toString();
    }
    public UserEntity updateUser(String documentName) {
        //Implement update-user here....
        return null;
    }


}
