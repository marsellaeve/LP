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
public class AdapterActivity extends RecyclerView.Adapter<AdapterActivity.TodoViewHolder> {
        private ArrayList<DoingActivity> dataList;
        public AdapterActivity(ArrayList<DoingActivity> dataList) {
            this.dataList = dataList;
        }
        @Override
        public TodoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.row_todo, parent, false);
            return new TodoViewHolder(view);
        }
        @Override
        public void onBindViewHolder(TodoViewHolder holder, int position) {
            holder.txtTodo.setText(dataList.get(position).getTodo());
            holder.txtPj.setText(dataList.get(position).getPj());
            holder.txtDeadline.setText(dataList.get(position).getDeadline());
        }
        @Override
        public int getItemCount() {
            return (dataList != null) ? dataList.size() : 0;
        }


        public class TodoViewHolder extends RecyclerView.ViewHolder{
            private TextView txtTodo, txtPj, txtDeadline;

            public TodoViewHolder(View itemView) {
                super(itemView);
                txtTodo = (TextView) itemView.findViewById(R.id.txt_todo);
                txtPj = (TextView) itemView.findViewById(R.id.txt_pj);
                txtDeadline = (TextView) itemView.findViewById(R.id.txt_deadline);
            }
        }
    }
}