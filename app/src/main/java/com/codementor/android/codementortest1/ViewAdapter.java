package com.codementor.android.codementortest1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tonyk_000 on 12/15/2015.
 */
public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.NameViewHolder>{

    List<Name> mNames;

    ViewAdapter(List<Name> names){
        mNames = names;
    }

    @Override
    public NameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.name_layout,parent,false);

        NameViewHolder nameHolder = new NameViewHolder(v);

        return nameHolder;
    }

    @Override
    public void onBindViewHolder(NameViewHolder holder, int position) {
        holder.firstName.setText(mNames.get(position).getFirstName());
        holder.lastName.setText(mNames.get(position).getLastName());
    }

    @Override
    public int getItemCount() {
        return mNames.size();
    }

    public static class NameViewHolder extends RecyclerView.ViewHolder{

        TextView firstName;
        TextView lastName;

        public NameViewHolder(View itemView) {
            super(itemView);

            firstName = (TextView) itemView.findViewById(R.id.first_name);
            lastName = (TextView) itemView.findViewById(R.id.last_name);
        }
    }

}
