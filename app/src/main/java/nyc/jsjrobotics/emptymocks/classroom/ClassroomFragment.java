package nyc.jsjrobotics.emptymocks.classroom;

import nyc.jsjrobotics.emptymocks.MvvmFragment;

public class ClassroomFragment extends MvvmFragment<ClassroomMvvm> {
    @Override public ClassroomMvvm getArchitecture() {
        return new ClassroomMvvm();
    }
}
