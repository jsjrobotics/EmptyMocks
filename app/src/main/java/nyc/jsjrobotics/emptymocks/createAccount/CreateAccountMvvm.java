package nyc.jsjrobotics.emptymocks.createAccount;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import nyc.jsjrobotics.emptymocks.template.ModelViewViewModel;

class CreateAccountMvvm implements ModelViewViewModel<CreateAccountPresenter, CreateAccountView> {
    @Override
    public CreateAccountPresenter buildPresenter() {
        return new CreateAccountPresenter();
    }

    @Override public CreateAccountView createView(final LayoutInflater inflater,
                                                  final ViewGroup parent,
                                                  final Bundle savedInstanceState) {
        return new CreateAccountView(inflater, parent, savedInstanceState);
    }
}
