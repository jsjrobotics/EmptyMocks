package nyc.jsjrobotics.emptymocks.courseOverview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.template.ModelViewViewModel;

class CourseOverviewMvvm implements ModelViewViewModel<CourseOverviewPresenter, CourseOverviewView>{
    @Override public CourseOverviewPresenter buildPresenter() {
        return new CourseOverviewPresenter();
    }

    @Override public CourseOverviewView createView(final LayoutInflater inflater,
                                                   final ViewGroup parent,
                                                   final Bundle savedInstanceState) {
        return new CourseOverviewView(inflater, parent, savedInstanceState);
    }
}
