package himanshu.projects.sphtech.view.adaptor;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import himanshu.projects.sphtech.R;
import himanshu.projects.sphtech.model.datamodel.RecordsForQuarter;
import himanshu.projects.sphtech.model.datamodel.RecordsForYear;

import java.util.ArrayList;



public class DataQuarterAdapter extends RecyclerView.Adapter<DataQuarterAdapter.MyViewHolder> {


    ArrayList<RecordsForQuarter> dataVolumeItems;
    Context mContext;

    public DataQuarterAdapter( Context mContext) {
        this.mContext = mContext;
        dataVolumeItems = new ArrayList<>();
    }


    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_quarter, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final RecordsForQuarter recordsForQuarter = dataVolumeItems.get(position);
        holder.textVolume.setText(recordsForQuarter.volume_of_mobile_data);
        holder.textQuarter.setText(recordsForQuarter.quarter);

    }

    public void setYearList(ArrayList<RecordsForQuarter> quarterList) {
        this.dataVolumeItems = quarterList;
    }

    @Override
    public int getItemCount() {
        return dataVolumeItems.size();
    }




    class MyViewHolder extends RecyclerView.ViewHolder{
       TextView textQuarter,textVolume;


        public MyViewHolder(View itemView) {
            super(itemView);
            textQuarter= (TextView) itemView.findViewById(R.id.textView_quarter);
            textVolume= (TextView) itemView.findViewById(R.id.textView_volume);
        }

    }



}
