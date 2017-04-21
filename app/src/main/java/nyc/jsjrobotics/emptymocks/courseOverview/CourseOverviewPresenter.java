package nyc.jsjrobotics.emptymocks.courseOverview;

import java.util.Arrays;
import java.util.List;
import nyc.jsjrobotics.emptymocks.template.IDefaultViewModel;

class CourseOverviewPresenter implements IDefaultViewModel<CourseOverviewView> {
    private CourseOverviewView view;

    @Override
    public void bindView(final CourseOverviewView v) {
        view = v;
        view.setCourseTitle(buildTitle());
        view.setCourseDescription(buildDescription());
        view.setList1Data(buildCourseListPart1());
        view.setList2Data(buildCourseListPart2());
    }

    private String buildTitle() {
        return "Introduction to Computer Science";
    }

    private String buildDescription() {
        return "This introductory course will explore key computer science concepts such as basic programming, problem solving techniques, and web basics.";
    }

    private List<String> buildCourseListPart1() {
        return Arrays.asList(
                "UNIT 1: Introduction to Visual Basic Integrated Development Environment",
                "UNIT 2: Logic and Problem-Solving",
                "UNIT 3: Creating Forms",
                "UNIT 4: Designing Applications",
                "UNIT 5: Designing the User Interface",
                "UNIT 6: Database Programming"
        );
    }

    private List<String> buildCourseListPart2() {
        return Arrays.asList(
                "Resources:",
                "Unit 1, Worksheet 1",
                "Unit 1, Worksheet 2",
                "Unit 1, Quiz",
                "Unit 2, Worksheet 1",
                "Unit 2, Worksheet 2",
                "Unit 2, Project 1",
                "Unit 2, Quiz",
                "Unit 3, Worksheet 1",
                "Unit 3, Project 1",
                "Unit 3, Quiz",
                "Unit 4, Worksheet 1",
                "Unit 4, Project 1",
                "Unit 4, Quiz",
                "Unit 5 Worksheet 1",
                "Unit 5, Project 1",
                "Unit 5, Quiz",
                "Unit 6 Worksheet 1",
                "Unit 6, Project 1",
                "FINAL TEST",
                "CAPSTONE PROJECT"
        );
    }
}
