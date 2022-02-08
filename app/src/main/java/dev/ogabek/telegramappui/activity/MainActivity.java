package dev.ogabek.telegramappui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import dev.ogabek.telegramappui.R;
import dev.ogabek.telegramappui.adapter.ChatAdapter;
import dev.ogabek.telegramappui.model.Chat;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        recyclerView = findViewById(R.id.rv_main);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        refreshAdapter(getAllChats());

    }

    private void refreshAdapter(List<Chat> chats) {
        ChatAdapter adapter = new ChatAdapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    private List<Chat> getAllChats() {
        List<Chat> chats = new ArrayList<>();

        chats.add(new Chat(R.drawable.bogibek, "Bogibek Matyaqubov", "Bugun 13 ta readingdan 9 ta urdim"));
        chats.add(new Chat(R.drawable.elmurod, "Elmurod Nazirov", "JaxaDev bilan gaplashdizmi?"));
        chats.add(new Chat(R.drawable.yahyo, "Yahyo Mahmudiy", "Bootcamp guruhda manga + bosvoring"));
        chats.add(new Chat(R.drawable.shakhriyor, "Shakhriyor", "Palov qachon pishiramiz"));
        chats.add(new Chat(R.drawable.aziz, "Aziz aka", "GitHub link tashavoring OgabekDev"));
        chats.add(new Chat(R.drawable.jabbor, "Jabbor Aka", "Zo'r ekan"));
        chats.add(new Chat(R.drawable.jonibek, "Jonibek Xolmonov", "Unicorn Android Bootcamp B13"));

        return chats;
    }
}