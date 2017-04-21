package nyc.jsjrobotics.emptymocks.courses.select;

import nyc.jsjrobotics.emptymocks.MvvmFragment;

public class SelectCourseFragment extends MvvmFragment<SelectCourseMvvm> {

    @Override
    public SelectCourseMvvm getArchitecture() {
        return new SelectCourseMvvm();
    }
}
