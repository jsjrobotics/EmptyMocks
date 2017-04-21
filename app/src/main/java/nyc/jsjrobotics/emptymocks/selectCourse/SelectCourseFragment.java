package nyc.jsjrobotics.emptymocks.selectCourse;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SelectCourseFragment extends Fragment {
    private SelectCourseMvvm mvvm = new SelectCourseMvvm();
    private SelectCoursePresenter presenter;
    private SelectCourseView view;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater,
                             @Nullable final ViewGroup container,
                             final Bundle savedInstanceState) {
        presenter = mvvm.buildPresenter();
        view = mvvm.createView(inflater, container, savedInstanceState);
        return view.getRoot();
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.bindView(view);
    }
}
