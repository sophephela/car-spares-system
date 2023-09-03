package com.car.spares.services;


import com.car.spares.entity.VehicleEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class VehicleService {
    private String collectionName = "Vehicle";
    //CRUD
    public String createVehicle(VehicleEntity vehicle) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> CollectionApifuture = db.collection(collectionName).document(vehicle.regNumber).set(vehicle);
        return CollectionApifuture.get().getUpdateTime().toString();
    }
    public VehicleEntity getVehicle(String id) {
        try{
            Firestore db = FirestoreClient.getFirestore();
            DocumentReference docRef = db.collection(collectionName).document(id);
            ApiFuture<DocumentSnapshot> future = docRef.get();
            DocumentSnapshot document = future.get();

            if (document.exists()) {
                VehicleEntity vehicleModel = document.toObject(VehicleEntity.class);
                return vehicleModel;
            }
        }catch(Exception e){
            //Throw Exception here...
        }

        return null;
    }

    public List<VehicleEntity> getVehicles() {
        try{
            Firestore db = FirestoreClient.getFirestore();

            ApiFuture<QuerySnapshot> future = db.collection(collectionName).get();
            List<QueryDocumentSnapshot> documents = future.get().getDocuments();
            List<VehicleEntity> vehicles = new ArrayList<VehicleEntity>();

            for (QueryDocumentSnapshot document : documents) {
                VehicleEntity vehicle = document.toObject(VehicleEntity.class);
                vehicles.add(vehicle);
            }

            return vehicles;
        }catch(Exception e){
            //Throw Exception here...
        }

        return null;
    }


}
