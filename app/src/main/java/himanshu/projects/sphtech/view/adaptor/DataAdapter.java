package himanshu.projects.sphtech.view.adaptor;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import himanshu.projects.sphtech.R;
import himanshu.projects.sphtech.model.datamodel.RecordsForQuarter;
import himanshu.projects.sphtech.model.datamodel.RecordsForYear;


import java.util.ArrayList;
import java.util.List;



public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {


    ArrayList<RecordsForYear> dataVolumeItems;
    private ClickListener clickListener;
    Context mContext;

    public DataAdapter(ClickListener clik, Context mContext) {
        this.mContext = mContext;
        clickListener = clik;
        dataVolumeItems = new ArrayList<>();
    }


    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_consumption, parent, false);
        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        final RecordsForYear recordsForYear = dataVolumeItems.get(position);

        holder.textVolume.setText(recordsForYear.volume_of_mobile_data);
        holder.textYear.setText(recordsForYear.year);

        if(recordsForYear.isDecrease()){
         holder.imageIndicator.setImageResource(R.drawable.ic_trending_down);
        }else {
            holder.imageIndicator.setImageResource(R.drawable.ic_trending_up);
        }


        for (RecordsForQuarter visit : recordsForYear.recordsForQuarter) {

            System.out.println("fffffff m:"+visit.quarter+"  v :"+visit.volume_of_mobile_data);

        }

        holder.imageIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onImageClick(v,recordsForYear);
            }
        });



    }

    public void setYearList(ArrayList<RecordsForYear> yearList) {
        this.dataVolumeItems = yearList;
    }

    @Override
    public int getItemCount() {
        return dataVolumeItems.size();
    }

    public interface ClickListener {
        void onImageClick(View v, RecordsForYear position);

    }


    class MyViewHolder extends RecyclerView.ViewHolder{


       RelativeLayout mainLayout;
       TextView textYear,textVolume;
        ImageView imageIndicator;

        public MyViewHolder(View itemView) {
            super(itemView);
            mainLayout= (RelativeLayout) itemView.findViewById(R.id.relativeLayout_main);
            textYear= (TextView) itemView.findViewById(R.id.textView_year);
            textVolume= (TextView) itemView.findViewById(R.id.textView_volume);
            imageIndicator= (ImageView) itemView.findViewById(R.id.imageView_indicator);

        }

    }



}
