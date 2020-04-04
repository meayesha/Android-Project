package edu.psu.aqp5794.chatgossip.Fragments;
import edu.psu.aqp5794.chatgossip.R;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import de.hdodenhof.circleimageview.CircleImageView;
import edu.psu.aqp5794.chatgossip.Model.User;
import android.content.Context;
import edu.psu.aqp5794.chatgossip.SettingsActivity;


public class ProfileFragment extends Fragment {

    private RecyclerView recyclerView;

    private EditText profile_username, profileStatus;
    private CircleImageView userProfileImage;
    FirebaseAuth auth;
    DatabaseReference reference;
    FirebaseUser firebaseUser;


    FirebaseAuth mAuth;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        profile_username = (EditText)view.findViewById(R.id.set_username);
        profileStatus = (EditText)view.findViewById(R.id.set_profile_status);
        userProfileImage = (CircleImageView)view.findViewById(R.id.set_profile_image);

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users").child(firebaseUser.getUid());

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                User user = dataSnapshot.getValue(User.class);
                profile_username.setText(user.getUsername());

            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        Intent i = new Intent();
        String text=i.getStringExtra("Status");
        profileStatus.setText(text);

        return view;
    }


}

