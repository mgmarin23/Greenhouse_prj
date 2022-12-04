package dte.masteriot.mdp.greenhouse_prj;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder2 extends RecyclerView.ViewHolder {
    TextView ideas;
    MyAdapter2 adapter2;
    public MyViewHolder2(@NonNull View itemView, MyAdapter2 ad) {
        super(itemView);
        ideas = itemView.findViewById(R.id.tv_idea);
        adapter2 = ad;
    }
    void bindValues(Ideas idea ) {
        // give values to the elements contained in the item view.
        // formats the title's text color depending on the "isSelected" argument.
        ideas.setText(idea.getName());
    }
}
