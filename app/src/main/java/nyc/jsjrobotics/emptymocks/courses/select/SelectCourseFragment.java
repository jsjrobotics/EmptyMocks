package nyc.jsjrobotics.emptymocks.courses.select;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.MvvmFragment;

public class SelectCourseFragment extends MvvmFragment<SelectCourseMvvm> {

    @Override
    public SelectCourseMvvm getArchitecture() {
        return new SelectCourseMvvm();
    }
}
