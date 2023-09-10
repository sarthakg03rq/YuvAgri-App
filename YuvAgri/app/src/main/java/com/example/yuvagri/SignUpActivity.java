package com.example.yuvagri;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class SignUpActivity extends AppCompatActivity {

    EditText inputEmail, inputPassword, inputRepassword;
    EditText inputFullname;
    Button btnsignup;
    ProgressDialog progressDialog;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    FirebaseAuth mAuth;
    FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        inputFullname=findViewById(R.id.editText40);
        inputEmail=findViewById(R.id.editText4);
        inputPassword=findViewById(R.id.editText2);
        inputRepassword=findViewById(R.id.editText3);
        btnsignup=findViewById(R.id.btnsignup);

        progressDialog=new ProgressDialog(this);

        mAuth=FirebaseAuth.getInstance();
        mUser=mAuth.getCurrentUser();


        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PerforAuth();
            }
        });


    }

    private void PerforAuth() {
        String fullname=inputFullname.getText().toString();
        String email=inputEmail.getText().toString();
        String password=inputPassword.getText().toString();
        String repassword=inputRepassword.getText().toString();

        if (fullname.isEmpty()){
            inputFullname.setError("Enter Your Name");
        }

        else if(!email.matches(emailPattern)){
            inputEmail.setError("Enter Correct Email");
        }
        else if (password.isEmpty() || password.length()<6){
            inputPassword.setError("Enter Proper Password");
        }
        else if (!password.equals(repassword)){
            inputRepassword.setError("Password Not Matched");
        }
        else{
            progressDialog.setMessage("Pleas wait for Registration...");
            progressDialog.setTitle("Registration");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            mAuth.createUserWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                User user = new User(fullname, email, password);
                                FirebaseDatabase.getInstance().getReference("users")
                                                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                                .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                            @Override
                                            public void onComplete(@NonNull Task<Void> task) {
                                                soils();
                                            }
                                        });
                                progressDialog.dismiss();

                                Toast.makeText(SignUpActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                progressDialog.dismiss();
                                Toast.makeText(SignUpActivity.this, "Authentication Failed"+ task.getException(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

        }


    }


    private void soils() {
        Intent intent=new Intent(SignUpActivity.this,SoilsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }



    public void previous(View view) {
        startActivity(new Intent(SignUpActivity.this,LoginActivity.class));
    }
}