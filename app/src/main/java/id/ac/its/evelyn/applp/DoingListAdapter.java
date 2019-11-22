package id.ac.its.evelyn.applp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Dimas Maulana on 5/26/17.
 * Email : araymaulana66@gmail.com
 */
public class DoingListAdapter extends RecyclerView.Adapter<DoingListAdapter.ListViewHolder> {
        private ArrayList<Doing> dataList;
        public DoingListAdapter(ArrayList<Doing> dataList) {
            this.dataList = dataList;
        }
        @Override
        public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.list_item, parent, false);
            return new ListViewHolder(view);
        }
        @Override
        public void onBindViewHolder(ListViewHolder holder, int position) {
            holder.txtTodo.setText(dataList.get(position).getTodo());
            holder.txtPj.setText(dataList.get(position).getPj());
            holder.txtDeadline.setText(dataList.get(position).getDeadline());
            holder.txtTanda.setText(dataList.get(position).getDonetask()+"/"+dataList.get(position).getTotaltask());
        }
        @Override
        public int getItemCount() {
            return (dataList != null) ? dataList.size() : 0;
        }


        public class ListViewHolder extends RecyclerView.ViewHolder{
            private TextView txtTodo, txtPj, txtDeadline,txtTanda;

            public ListViewHolder(View itemView) {
                super(itemView);
                txtTodo = (TextView) itemView.findViewById(R.id.txt_task);
                txtPj = (TextView) itemView.findViewById(R.id.txt_pj);
                txtDeadline = (TextView) itemView.findViewById(R.id.txt_deadline);
                txtTanda = (TextView) itemView.findViewById(R.id.tanda);
            }
        }

}