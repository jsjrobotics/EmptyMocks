package nyc.jsjrobotics.emptymocks;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.template.IDefaultView;
import nyc.jsjrobotics.emptymocks.template.IDefaultViewModel;
import nyc.jsjrobotics.emptymocks.template.ModelViewViewModel;

public abstract class MvvmFragment<Mvvm extends ModelViewViewModel> extends Fragment {
    private Mvvm mvvm;
    private IDefaultViewModel presenter;
    private IDefaultView view;

    public abstract Mvvm getArchitecture();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mvvm = getArchitecture();
        presenter = mvvm.buildPresenter();
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater,
                             @Nullable final ViewGroup container,
                             final Bundle savedInstanceState) {
        view = mvvm.createView(inflater, container, savedInstanceState);
        return view.getRoot();
    }

    @Override
    public void onStart() {
        super.onStart();
        presenter.bindView(view);
    }
}
