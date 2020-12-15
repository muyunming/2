package com.example.test1_;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class PeopleAdapter extends BaseAdapter {
    private List<people> data;
    private Context context;

    public PeopleAdapter(List<people> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.list_people, parent, false);
        ViewHolder viewHolder=new ViewHolder(convertView);
        viewHolder.List_name.setText(data.get(position).getName());
        viewHolder.List_age.setText(data.get(position).getAge()+"");
        return convertView;
    }

    public static
    class ViewHolder {
        public View rootView;
        public TextView List_name;
        public TextView List_age;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.List_name = (TextView) rootView.findViewById(R.id.List_name);
            this.List_age = (TextView) rootView.findViewById(R.id.List_age);
        }
    }
}
