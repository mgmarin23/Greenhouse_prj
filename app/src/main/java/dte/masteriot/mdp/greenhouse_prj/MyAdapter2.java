package dte.masteriot.mdp.greenhouse_prj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter2 extends RecyclerView.Adapter {


    List<Ideas> fetchData;
    Context context;

    public MyAdapter2(Context ctxt, List<Ideas> fetchData){
        super();
        context = ctxt;
        this.fetchData = fetchData;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ideas,parent, false);

        ViewHolderClass viewHolderClass = new ViewHolderClass(view);

        return viewHolderClass;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //ViewHolderClass viewHolderClass = (ViewHolderClass)holder;
        final Ideas idea = fetchData.get(position);
        //viewHolderClass.textView.setText(fetchDatalist);

    }

    @Override
    public int getItemCount() {
        return fetchData.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv_idea);

        }
    }
}


