package nyc.jsjrobotics.emptymocks.courses.overview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.MvvmFragment;

public class CourseOverviewFragment extends MvvmFragment<CourseOverviewMvvm> {
    @Override
    public CourseOverviewMvvm getArchitecture() {
        return new CourseOverviewMvvm();
    }
}
