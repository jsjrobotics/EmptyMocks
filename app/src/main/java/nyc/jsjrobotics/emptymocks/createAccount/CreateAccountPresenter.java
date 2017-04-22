package nyc.jsjrobotics.emptymocks.createAccount;

import java.util.Arrays;
import java.util.List;
import nyc.jsjrobotics.emptymocks.template.IDefaultViewModel;

class CreateAccountPresenter implements IDefaultViewModel<CreateAccountView> {
    @Override public void bindView(final CreateAccountView view) {
        view.setInputBoxes(buildInputBoxes());
    }

    private List<EditTextDescriptor> buildInputBoxes() {
        return Arrays.asList(
                new EditTextDescriptor("FULL NAME", "FIRST AND LAST"),
                new EditTextDescriptor("EMAIL", "username@domain.co"),
                new EditTextDescriptor("USERNAME", "USERNAME"),
                new EditTextDescriptor("PASSWORD", "PASSWORD"),
                new EditTextDescriptor("COUNTRY", "UNITED STATES"),
                new EditTextDescriptor("GENDER", "OPTIONAL"),
                new EditTextDescriptor("GRADE", "6,7,8,9,10,11,12")
        );
    }
}
