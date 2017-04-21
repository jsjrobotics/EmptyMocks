package nyc.jsjrobotics.emptymocks.classroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.template.ModelViewViewModel;

class ClassroomMvvm implements ModelViewViewModel<ClassroomPresenter, ClassroomView> {
    @Override public ClassroomPresenter buildPresenter() {
        return new ClassroomPresenter();
    }

    @Override public ClassroomView createView(final LayoutInflater inflater,
                                              final ViewGroup parent,
                                              final Bundle savedInstanceState) {
        return new ClassroomView(inflater, parent, savedInstanceState);
    }
}
