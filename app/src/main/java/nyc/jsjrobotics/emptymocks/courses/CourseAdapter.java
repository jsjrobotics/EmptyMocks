package nyc.jsjrobotics.emptymocks.courses;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseViewHolder> {
    private final List<String> data;

    public CourseAdapter(final List<String> data) {
        this.data = data;
    }

    @Override
    public CourseViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        return new CourseViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(final CourseViewHolder holder, final int position) {
        holder.setTitle(data.get(position));
    }

    @Override public int getItemCount() {
        return data.size();
    }
}
