package nyc.jsjrobotics.emptymocks.selectCourse;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import nyc.jsjrobotics.emptymocks.R;

class CourseViewHolder extends RecyclerView.ViewHolder {
    private final TextView title;

    CourseViewHolder(final ViewGroup parent) {
        super(createView(parent));
        title = (TextView) itemView.findViewById(R.id.title);
    }

    private static View createView(final ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.course_selection_view_holder, parent, false);
    }

    void setTitle(final String s) {
        title.setText(s);
    }
}
