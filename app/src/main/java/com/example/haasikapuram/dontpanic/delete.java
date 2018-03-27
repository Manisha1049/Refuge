package com.example.haasikapuram.dontpanic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class delete extends AppCompatActivity{
    EditText ContactName;
    Context context = this;
    UerDbHelper userDbHelper;
    SQLiteDatabase sqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        ContactName = (EditText) findViewById(R.id.contact_name);
    }

    public void addContact(View view) {

        String name = ContactName.getText().toString();
        userDbHelper = new UerDbHelper(context);

        sqLiteDatabase = userDbHelper.getReadableDatabase();
        int aa= userDbHelper.getcount(sqLiteDatabase);
            userDbHelper.delInformations(name,sqLiteDatabase);
            userDbHelper.close();
            finish();

}

}

