package nyc.jsjrobotics.emptymocks.courses.select;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.template.ModelViewViewModel;

class SelectCourseMvvm implements ModelViewViewModel<SelectCoursePresenter, SelectCourseView>{
    @Override public SelectCoursePresenter buildPresenter() {
        return new SelectCoursePresenter();
    }

    @Override public SelectCourseView createView(final LayoutInflater inflater,
                                                 final ViewGroup parent,
                                                 final Bundle savedInstanceState) {
        return new SelectCourseView(inflater, parent, savedInstanceState);
    }
}
