package opencommerce.collabase.pageobjects.addproperty;

import common.utilities.DataHelper;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.boardadmindetail.BoardAdminDetailActions;
import opencommerce.collabase.pageobjects.common.CommonActions;

public class AddPropertyActions {
    public static String propertyName;

    @Steps
    BoardAdminDetailActions boardAdminDetailActions;

    @Steps
    CommonActions commonActions;

    public void with(String modelName, String type, String position) {
        DataHelper data = DataHelper.getData();
        propertyName = data.getRandomNameWithPrefix("Property");

        boardAdminDetailActions.atModel(modelName).clickToAddFieldBtn();
        boardAdminDetailActions.atModel(modelName).atPosition(position).inputToPropertyNameTxtbx(propertyName);
        boardAdminDetailActions.atModel(modelName).atPosition(position).clickPropertyTypeDropdown();
        commonActions.clickToDropdownItem(type);
    }
}
