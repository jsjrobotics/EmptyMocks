package nyc.jsjrobotics.emptymocks.certifications;

import nyc.jsjrobotics.emptymocks.MvvmFragment;

public class CertificationFragment extends MvvmFragment<CertificationMvvm> {
    @Override public CertificationMvvm getArchitecture() {
        return new CertificationMvvm();
    }
}
