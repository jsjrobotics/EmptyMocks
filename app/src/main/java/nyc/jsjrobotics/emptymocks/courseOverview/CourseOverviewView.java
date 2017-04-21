package nyc.jsjrobotics.emptymocks.courseOverview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import nyc.jsjrobotics.emptymocks.R;
import nyc.jsjrobotics.emptymocks.template.DefaultView;

class CourseOverviewView extends DefaultView {
    private final RecyclerView list1;
    private final RecyclerView list2;
    private final TextView courseTitle;
    private final TextView courseDescription;

    CourseOverviewView(final LayoutInflater inflater,
                       final ViewGroup container,
                       final Bundle savedInstanceState) {
        super(inflater, container, savedInstanceState);
        final Context context = container.getContext();
        list1 = (RecyclerView) getRoot().findViewById(R.id.list1);
        list1.setLayoutManager(new LinearLayoutManager(context));
        list2 = (RecyclerView) getRoot().findViewById(R.id.list2);
        list2.setLayoutManager(new LinearLayoutManager(context));
        courseTitle = (TextView) getRoot().findViewById(R.id.course_title);
        courseDescription = (TextView) getRoot().findViewById(R.id.course_description);
    }

    @Override protected int getLayoutId() {
        return R.layout.course_overview;
    }

    @Override protected int getLoadingViewId() {
        return 0;
    }

    @Override protected int getLoadedViewId() {
        return 0;
    }

    @Override protected int getErrorViewId() {
        return 0;
    }

    void setCourseTitle(final String title) {
        courseTitle.setText(title);
    }

    void setCourseDescription(final String description) {
        courseDescription.setText(description);
    }

    void setList1Data(final List<String> data) {
        list1.setAdapter(new CourseAdapter(data));
    }

    void setList2Data(final List<String> data) {
        list2.setAdapter(new CourseAdapter(data));
    }
}
