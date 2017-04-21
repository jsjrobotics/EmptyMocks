package nyc.jsjrobotics.emptymocks.courses.select;

import java.util.Arrays;
import java.util.List;
import nyc.jsjrobotics.emptymocks.template.IDefaultViewModel;

class SelectCoursePresenter implements IDefaultViewModel<SelectCourseView> {
    private SelectCourseView view;

    @Override
    public void bindView(final SelectCourseView v) {
        view = v;
        view.setList1Data(buildCourseListPart1());
        view.setList2Data(buildCourseListPart2());
    }

    private List<String> buildCourseListPart1() {
        return Arrays.asList(
                "Introduction to Computer Science",
                "Programming: C++",
                "Programming: Java",
                "Programming: VB.NET",
                "Building an App (Android)",
                "Building an App (Mac)",
                "Web Design for Beginners",
                "Computer Fundamentals"
        );
    }

    private List<String> buildCourseListPart2() {
        return Arrays.asList(
                "Graphic Design",
                "Introduction to Gaming andAnimation",
                "Intermediate Computer Science",
                "Advanced Computer Science",
                "Data Analysis",
                "Introduction to Cyber Security",
                "Introduction to SQL",
                "Advanced Web Design"
        );
    }
}
