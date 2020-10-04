package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


@Service
public class FirebaseService {
	
	public String getMessage() {
		return "success message";
	}
	
	
	public String onChange() {
		
		DatabaseReference customer = FirebaseDatabase.getInstance().getReference();
		
		
		
		customer.addChildEventListener(new ChildEventListener() {

			@Override
			public void onChildAdded(DataSnapshot snapshot, String previousChildName) {
				
			}

			@Override
			public void onChildChanged(DataSnapshot snapshot, String previousChildName) {
				
				
			}

			@Override
			public void onChildRemoved(DataSnapshot snapshot) {
				
				
			}

			@Override
			public void onChildMoved(DataSnapshot snapshot, String previousChildName) {
				
				
			}

			@Override
			public void onCancelled(DatabaseError error) {
			
	
			}
			
		});
		return "change is called" ;
	}

}
