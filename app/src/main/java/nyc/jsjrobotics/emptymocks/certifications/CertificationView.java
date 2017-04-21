package nyc.jsjrobotics.emptymocks.certifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.R;
import nyc.jsjrobotics.emptymocks.template.DefaultView;

class CertificationView extends DefaultView{
    public CertificationView(final LayoutInflater inflater,
                             final ViewGroup container,
                             final Bundle savedInstanceState) {
        super(inflater, container, savedInstanceState);
    }

    @Override protected int getLayoutId() {
        return R.layout.certification_view;
    }

    @Override protected int getLoadingViewId() {
        return 0;
    }

    @Override protected int getLoadedViewId() {
        return 0;
    }

    @Override protected int getErrorViewId() {
        return 0;
    }
}
