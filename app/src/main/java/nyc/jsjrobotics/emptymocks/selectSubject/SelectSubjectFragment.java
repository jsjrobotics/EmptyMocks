package nyc.jsjrobotics.emptymocks.selectSubject;

import nyc.jsjrobotics.emptymocks.MvvmFragment;

public class SelectSubjectFragment extends MvvmFragment<SelectSubjectMvvm> {

    @Override public SelectSubjectMvvm getArchitecture() {
        return new SelectSubjectMvvm();
    }
}
