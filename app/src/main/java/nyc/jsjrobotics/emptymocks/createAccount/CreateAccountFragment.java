package nyc.jsjrobotics.emptymocks.createAccount;

import nyc.jsjrobotics.emptymocks.MvvmFragment;

public class CreateAccountFragment extends MvvmFragment<CreateAccountMvvm> {

    @Override public CreateAccountMvvm getArchitecture() {
        return new CreateAccountMvvm();
    }
}
