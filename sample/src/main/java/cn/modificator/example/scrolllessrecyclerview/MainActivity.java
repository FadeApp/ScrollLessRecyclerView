package cn.modificator.example.scrolllessrecyclerview;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import fadeapp.widgets.ScrollLessRecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        ScrollLessRecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                TextView textView = new TextView(parent.getContext());
                textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
                return new RecyclerView.ViewHolder(textView) {};
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("text001    ").append(position);
                stringBuilder.append("\ntext002    ").append(position);
                stringBuilder.append("\ntext003    ").append(position);
                stringBuilder.append("\ntext004    ").append(position);
                stringBuilder.append("\ntext005    ").append(position);
                stringBuilder.append("\ntext006    ").append(position);
                stringBuilder.append("\ntext007    ").append(position);
                if (Math.random()>1.3f){
                    stringBuilder.append("\ntext008    ").append(position);
                    stringBuilder.append("\ntext009    ").append(position);
                    stringBuilder.append("\ntext010    ").append(position);
                    stringBuilder.append("\ntext011    ").append(position);
                    stringBuilder.append("\ntext012    ").append(position);
                    stringBuilder.append("\ntext013    ").append(position);
                    stringBuilder.append("\ntext014    ").append(position);
                    stringBuilder.append("\ntext015    ").append(position);
                    stringBuilder.append("\ntext016    ").append(position);
                    stringBuilder.append("\ntext017    ").append(position);
                    stringBuilder.append("\ntext018    ").append(position);
                    stringBuilder.append("\ntext019    ").append(position);
                    stringBuilder.append("\ntext020    ").append(position);
                    stringBuilder.append("\ntext021    ").append(position);
                    stringBuilder.append("\ntext022    ").append(position);
                    stringBuilder.append("\ntext023    ").append(position);
                    stringBuilder.append("\ntext024    ").append(position);
                }
                /*
                stringBuilder.append("\ntext025    ").append(position);
                stringBuilder.append("\ntext026    ").append(position);
                stringBuilder.append("\ntext027    ").append(position);
                stringBuilder.append("\ntext028    ").append(position);
                stringBuilder.append("\ntext029    ").append(position);
                stringBuilder.append("\ntext030    ").append(position);
                stringBuilder.append("\ntext031    ").append(position);
                stringBuilder.append("\ntext032    ").append(position);
                stringBuilder.append("\ntext033    ").append(position);
                stringBuilder.append("\ntext034    ").append(position);
                stringBuilder.append("\ntext035    ").append(position);
                stringBuilder.append("\ntext036    ").append(position);
                stringBuilder.append("\ntext037    ").append(position);
                stringBuilder.append("\ntext038    ").append(position);
                stringBuilder.append("\ntext039    ").append(position);
                stringBuilder.append("\ntext040    ").append(position);
                stringBuilder.append("\ntext041    ").append(position);
                stringBuilder.append("\ntext042    ").append(position);
                stringBuilder.append("\ntext043    ").append(position);
                stringBuilder.append("\ntext044    ").append(position);
                stringBuilder.append("\ntext045    ").append(position);
                stringBuilder.append("\ntext046    ").append(position);
                stringBuilder.append("\ntext047    ").append(position);
                stringBuilder.append("\ntext048    ").append(position);
                stringBuilder.append("\ntext049    ").append(position);*/
                stringBuilder.append("\n");
                ((TextView)holder.itemView).setText(stringBuilder);
//                ((TextView)holder.itemView).setText("Item position:"+position);
            }

            @Override
            public int getItemCount() {
                return 100;
            }
        });

    }
}