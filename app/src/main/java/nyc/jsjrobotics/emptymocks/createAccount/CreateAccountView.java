package nyc.jsjrobotics.emptymocks.createAccount;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.R;
import nyc.jsjrobotics.emptymocks.template.DefaultView;
import nyc.jsjrobotics.emptymocks.template.IDefaultView;

class CreateAccountView extends DefaultView {
    public CreateAccountView(final LayoutInflater inflater,
                             final ViewGroup parent,
                             final Bundle savedInstanceState) {
        super(inflater, parent, savedInstanceState);
    }

    @Override protected int getLayoutId() {
        return R.layout.enroll;
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
