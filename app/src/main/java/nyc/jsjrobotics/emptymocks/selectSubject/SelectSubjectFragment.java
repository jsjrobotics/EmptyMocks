package nyc.jsjrobotics.emptymocks.selectSubject;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.MvvmFragment;

public class SelectSubjectFragment extends MvvmFragment<SelectSubjectMvvm> {

    @Override public SelectSubjectMvvm getArchitecture() {
        return new SelectSubjectMvvm();
    }
}
