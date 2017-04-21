package nyc.jsjrobotics.emptymocks.selectSubject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.R;
import nyc.jsjrobotics.emptymocks.template.DefaultView;

class SelectSubjectView extends DefaultView {

    SelectSubjectView(final LayoutInflater inflater,
                      final ViewGroup container,
                      final Bundle savedInstanceState) {
        super(inflater, container, savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.select_subject;
    }

    @Override
    protected int getLoadingViewId() {
        return 0;
    }

    @Override protected int getLoadedViewId() {
        return 0;
    }

    @Override protected int getErrorViewId() {
        return 0;
    }
}
