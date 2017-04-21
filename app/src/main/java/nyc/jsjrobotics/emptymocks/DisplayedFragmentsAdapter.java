package nyc.jsjrobotics.emptymocks;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import java.util.Arrays;
import java.util.List;
import nyc.jsjrobotics.emptymocks.courseOverview.CourseOverviewFragment;
import nyc.jsjrobotics.emptymocks.selectCourse.SelectCourseFragment;
import nyc.jsjrobotics.emptymocks.selectSubject.SelectSubjectFragment;

class DisplayedFragmentsAdapter extends FragmentPagerAdapter {

    private final List<android.app.Fragment> data;

    DisplayedFragmentsAdapter(final FragmentManager fragmentManager) {
        super(fragmentManager);
        data = Arrays.asList(
                new SelectSubjectFragment(),
                new SelectCourseFragment(),
                new CourseOverviewFragment()
        );
    }
    @Override public Fragment getItem(final int position) {
        return data.get(position);
    }

    @Override public int getCount() {
        return data.size();
    }
}
