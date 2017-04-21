package nyc.jsjrobotics.emptymocks.selectSubject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.template.ModelViewViewModel;

class SelectSubjectMvvm implements ModelViewViewModel<SelectSubjectPresenter, SelectSubjectView>{
    @Override
    public SelectSubjectPresenter buildPresenter() {
        return new SelectSubjectPresenter();
    }

    @Override
    public SelectSubjectView createView(final LayoutInflater inflater,
                                        final ViewGroup parent,
                                        final Bundle savedInstanceState) {
        return new SelectSubjectView(inflater, parent, savedInstanceState);
    }
}
