package nyc.jsjrobotics.emptymocks.certifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.template.ModelViewViewModel;

class CertificationMvvm implements ModelViewViewModel<CertificationPresenter, CertificationView> {
    @Override public CertificationPresenter buildPresenter() {
        return new CertificationPresenter();
    }

    @Override public CertificationView createView(final LayoutInflater inflater,
                                                  final ViewGroup parent,
                                                  final Bundle savedInstanceState) {
        return new CertificationView(inflater, parent, savedInstanceState);
    }
}
