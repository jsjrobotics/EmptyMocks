package nyc.jsjrobotics.emptymocks.courses.overview;

import nyc.jsjrobotics.emptymocks.MvvmFragment;

public class CourseOverviewFragment extends MvvmFragment<CourseOverviewMvvm> {
    @Override
    public CourseOverviewMvvm getArchitecture() {
        return new CourseOverviewMvvm();
    }
}
