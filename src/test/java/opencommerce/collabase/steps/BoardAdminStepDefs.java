package opencommerce.collabase.steps;

import common.utilities.LoadObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import opencommerce.collabase.pageobjects.addnewboard.AddNewBoardActions;
import opencommerce.collabase.pageobjects.addnewmodel.AddNewModelActions;
import opencommerce.collabase.pageobjects.addproperty.AddPropertyActions;
import opencommerce.collabase.pageobjects.alert.AlertQuestions;
import opencommerce.collabase.pageobjects.boardadmindetail.BoardAdminDetailActions;
import opencommerce.collabase.pageobjects.boardadmindetail.BoardAdminDetailQuestions;
import opencommerce.collabase.pageobjects.boardadminlistpage.BoardAdminListActions;
import opencommerce.collabase.pageobjects.boardadminlistpage.BoardAdminListQuestions;
import opencommerce.collabase.pageobjects.chooseworkspace.ChooseWorkspaceActions;
import opencommerce.collabase.pageobjects.common.CommonActions;
import opencommerce.collabase.pageobjects.confirmationpopup.ConfirmationPopupActions;
import opencommerce.collabase.pageobjects.confirmationpopup.ConfirmationPopupQuestions;
import opencommerce.collabase.pageobjects.navigations.NavigateActions;

public class BoardAdminStepDefs {

    String numProperty;
    String oldModelName;

    @Steps
    NavigateActions navigateTo;

    @Steps
    BoardAdminListActions boardAdminListActions;

    @Steps
    BoardAdminListQuestions boardAdminListQuestions;

    @Steps
    BoardAdminDetailActions boardAdminDetailActions;

    @Steps
    BoardAdminDetailQuestions boardAdminDetailQuestions;

    @Steps
    ConfirmationPopupActions confirmationPopupActions;

    @Steps
    ConfirmationPopupQuestions confirmationPopupQuestions;

    @Steps
    AlertQuestions alertQuestions;

    @Steps
    AddNewBoardActions addNewBoardActions;

    @Steps
    AddNewModelActions addNewModelActions;

    @Steps
    AddPropertyActions addPropertyActions;

    @Steps
    CommonActions commonActions;

    @Steps
    ChooseWorkspaceActions chooseWorkspaceActions;

    @And("Anna go to board admin page")
    public void annaGoToBoardAdminPage() {
        chooseWorkspaceActions.chooseWorkspaceWithName(LoadObject.getProperty("workspace.name"));
        navigateTo.theBoardAdminPage();
    }

    @And("Anna open create new board page")
    public void annaOpenCreateNewBoardPage() {
        boardAdminListActions.clickToCreateNewBoardBtn();
    }

    @When("Anna create board without board name")
    public void annaCreateBoardWithoutBoardName() {
        addNewBoardActions.withoutBoardName();
    }

    @Then("Anna should see create board error message {string} at field Board name")
    public void annaShouldSeeCreateBoardErrorMessageAtFieldBoardName(String message) {
        boardAdminDetailQuestions.verifyErrorBlankBoardnameIs(message);
    }

    @When("Anna create board without main model")
    public void annaCreateBoardWithoutMainModel() {
        addNewBoardActions.withoutMainModel();
    }

    @And("she go back to board admin list page")
    public void sheGoBackToBoardAdminListPage() {
        boardAdminDetailActions.clickToBackArrowBtn();
    }

    @Then("she should see created board with status {string}")
    public void sheShouldSeeCreatedBoardWithStatus(String status) {
        boardAdminListQuestions.verifyBoard(AddNewBoardActions.boardName).statusIs(status);
    }

    @And("she should see created board with no available model message")
    public void sheShouldSeeCreatedBoardWithNoAvailableModelMessage() {
        boardAdminListQuestions.verifyBoard(AddNewBoardActions.boardName).modelIs("No available model");
    }

    @And("she search for created board")
    public void sheSearchForCreatedBoard() {
        boardAdminListActions.inputToSearchTxtbxWith(AddNewBoardActions.boardName);
    }

    @When("Anna/she create board with main model")
    public void annaCreateBoardWithMainModel() {
        addNewBoardActions.withMainModel();
        boardAdminDetailQuestions.verifyMainModelTitleIsDisplayed();
    }

    @And("she should see created board with models name")
    public void sheShouldSeeCreatedBoardWithModelsName() {
        boardAdminListQuestions.verifyBoard(AddNewBoardActions.boardName).modelIs(AddNewBoardActions.modelName);
    }

    @And("she publish board")
    public void shePublishBoard() {
        boardAdminDetailActions.clickToPublishBtn();
    }

    @Then("she should see publish board success message is {string}")
    public void sheShouldSeePublishBoardSuccessMessageIs(String message) {
        alertQuestions.verifySuccessBottomMessageIs(message);
    }

    @And("Anna/she prepare to create new model")
    public void shePrepareToCreateNewModel() {
        boardAdminListActions.clickToCreateNewBoardBtn();
        addNewBoardActions.withoutMainModel();
    }

    @When("Anna create new model without name")
    public void annaCreateNewModelWithoutName() {
        addNewModelActions.withoutModelName();
    }

    @Then("she should see create model error message {string} at field Name")
    public void sheShouldSeeCreateModelErrorMessageAtFieldName(String message) {
        boardAdminDetailQuestions.verifyErrorMessageBlankModelIs(message);
    }

    @When("Anna create new model with a duplicate name")
    public void annaCreateNewModelWithADuplicateName() {
        addNewModelActions.withDuplicateModelName();
    }

    @Then("she should see the duplicate model error message is {string}")
    public void sheShouldSeeTheDuplicateModelErrorMessageIs(String message) {
        alertQuestions.verifyRedAlertBottmMessageIs(message);
    }

    @When("Anna/she create new main model with valid name")
    public void annaCreateNewMainModelWithValidName() {
        addNewModelActions.isMainWithValidName();
        oldModelName = AddNewModelActions.modelName;
    }

    @When("Anna/she create new main model with property number")
    public void annaCreateNewMainModelWithPropertyNumber() {
        addPropertyActions.with(AddNewModelActions.modelName, "Number", "2");
        oldModelName = AddNewModelActions.modelName;
        numProperty = AddPropertyActions.propertyName;
        addNewModelActions.isMainWithValidName();
    }

    @Then("Anna should see the created model in Model Relations")
    public void annaShouldSeeTheCreatedModelInModelRelations() {
        boardAdminDetailQuestions.verifyModel(AddNewModelActions.modelName).isDisplayedInRelation();
    }

    @And("she should see the created model is Main model")
    public void sheShouldSeeTheCreatedModelIsMainModel() {
        boardAdminDetailQuestions.verifyMainModelTitleInRelationIs("Main");
    }

    @When("Anna/she create new model with valid name")
    public void annaCreateNewModelWithValidName() {
        addNewModelActions.notMainWithValidName();
    }

    @When("Anna create new model without description")
    public void annaCreateNewModelWithoutDescription() {
        addNewModelActions.withoutDescription();
    }

    @And("she create another main model with valid name")
    public void sheCreateAnotherMainModelWithValidName() {
        addNewModelActions.isMainWithValidName();
    }

    @And("she should see old main model is not main model")
    public void sheShouldSeeOldMainModelIsNotMainModel() {
        boardAdminDetailQuestions.verifyMainModelTitleInRelationIsNot(oldModelName);
    }

    @And("she let the property name is blank")
    public void sheLetThePropertyNameIsBlank() {
        boardAdminDetailActions.atModel(AddNewModelActions.modelName).atPosition("1").pressTabToPropertyName();
    }

    @Then("she should see the create property error message {string} at the created model")
    public void sheShouldSeeTheCreatePropertyErrorMessageAtTheCreatedModel(String message) {
        boardAdminDetailQuestions.atModel(AddNewModelActions.modelName).atPosition("1").verifyPropertyNameErrorMessageIs(message);
    }

    @And("she input default property name")
    public void sheInputDefaultPropertyName() {
        boardAdminDetailActions.atModel(AddNewModelActions.modelName).atPosition("1").inputToPropertyNameTxtbx("Name");
    }

    @And("she create new property with type is {string}")
    public void sheCreateNewPropertyWithTypeIs(String propertyType) {
        addPropertyActions.with(AddNewModelActions.modelName, propertyType, "2");
    }

    @Then("she should see the created property with type is {string}")
    public void sheShouldSeeTheCreatedPropertyWithTypeIs(String propertyType) {
        boardAdminDetailQuestions.atModel(AddNewModelActions.modelName).atPosition("2").verifyPropertyTypeDropdownTxtIs(propertyType);
    }

    @And("she link main model with new model same board")
    public void sheLinkMainModelWithNewModelSameBoard() {
        addPropertyActions.with(oldModelName, "Link to model(s)", "2");
        boardAdminDetailActions.atModel(oldModelName).clickToSelectModelDropdown();
        commonActions.clickToDropdownItem(AddNewModelActions.modelName);
        boardAdminDetailQuestions.atModel(oldModelName).verifySelectModelDropdownTxtIs(AddNewModelActions.modelName);
    }

    @And("she link main model with model from another board")
    public void sheLinkMainModelWithModelFromAnotherBoard() {
        String modelFromAnotherBoard =
                LoadObject.getProperty("anotherboard.name") + " > " + LoadObject.getProperty("anotherboard.model");

        addPropertyActions.with(oldModelName, "Link to model(s)", "2");
        boardAdminDetailActions.atModel(oldModelName).clickToSelectModelDropdown();
        commonActions.clickToDropdownItem(modelFromAnotherBoard);
        boardAdminDetailQuestions.atModel(oldModelName).verifySelectModelDropdownTxtIsNot("Select model");
    }

    @Then("she should see the created property is linked to new model")
    public void sheShouldSeeTheCreatedPropertyIsLinkedToNewModel() {
        boardAdminDetailQuestions.atModel(oldModelName).verifySelectModelDropdownTxtIs(AddNewModelActions.modelName);
    }

    @And("Anna/she add a model from another board")
    public void sheAddAModelFromAnotherBoard() {
        addNewModelActions.fromAnotherBoard();
    }

    @Then("she should see the created property is linked to added model")
    public void sheShouldSeeTheCreatedPropertyIsLinkedToAddedModel() {
        boardAdminDetailQuestions.atModel(oldModelName).verifySelectModelDropdownTxtIs(
                LoadObject.getProperty("anotherboard.name") + " > " + LoadObject.getProperty("anotherboard.model"));

    }

    @When("Anna create two linked model")
    public void annaCreateTwoLinkedModel() {
        addNewModelActions.isMainWithValidName();
        oldModelName = AddNewModelActions.modelName;
        boardAdminDetailActions.atModel(AddNewModelActions.modelName).atPosition("1").inputToPropertyNameTxtbx("Name");
        addNewModelActions.notMainWithValidName();
        addPropertyActions.with(oldModelName, "Link to model(s)", "2");
        boardAdminDetailActions.atModel(oldModelName).clickToSelectModelDropdown();
        commonActions.clickToDropdownItem(AddNewModelActions.modelName);
        boardAdminDetailQuestions.atModel(oldModelName).verifySelectModelDropdownTxtIsDisplayed();
    }

    @And("she delete property {string}")
    public void sheDeleteProperty(String propertyType) {
        boardAdminDetailActions.atModel(oldModelName).atPropertyType(propertyType).clickToPropertyOptionBtn();
        commonActions.clickToDropdownItem("Delete");
        confirmationPopupActions.clickToYesBtn();
        confirmationPopupQuestions.verifyPopupIsNotDisplayed();
    }

    @Then("she should see the {string} property is deleted")
    public void sheShouldSeeThePropertyIsDeleted(String propertyType) {
        boardAdminDetailQuestions.atModel(oldModelName).atPropertyType(propertyType).verifyPropertyOptionBtnIsNotDisplayed();
    }

    @And("she create new property with type is {string} at position {string}")
    public void sheCreateNewPropertyWithTypeIsAtPosition(String propertyType, String position) {
        addPropertyActions.with(AddNewModelActions.modelName, propertyType, position);
    }

    @Then("she should see close board button is disabled")
    public void sheShouldSeeCloseBoardButtonIsDisabled() {
        boardAdminDetailActions.clickToMoreBtn();
        boardAdminDetailQuestions.verifyCloseBoardBtnIsDisabled();
    }

    @Then("she should see close board button is enabled")
    public void sheShouldSeeCloseBoardButtonIsEnabled() {
        boardAdminDetailActions.clickToMoreBtn();
        boardAdminDetailQuestions.verifyCloseBoardBtnIsEnabled();
    }

    @And("she click to close board button")
    public void sheClickToCloseBoardButton() {
        boardAdminDetailActions.openCloseBoardConfirmation();
    }

    @And("she confirm to close board")
    public void sheConfirmToCloseBoard() {
        confirmationPopupActions.clickToYesBtn();
    }

    @Then("she should see publish button is hided")
    public void sheShouldSeePublishButtonIsHided() {
        boardAdminDetailQuestions.verifyPublishBtnIsNotDisplayed();
    }

    @When("Anna prepare to create board")
    public void annaPrepareToCreateBoard() {
        navigateTo.theBoardAdminPage();
        boardAdminListActions.clickToCreateNewBoardBtn();
    }

    @And("she close prepared board")
    public void sheClosePreparedBoard() {
        navigateTo.theBoardAdminPage();
        boardAdminListActions.inputToSearchTxtbxWith(AddNewBoardActions.boardName);
        boardAdminListActions.clickToBoardStatus(AddNewBoardActions.boardName);
        boardAdminDetailActions.openCloseBoardConfirmation();
        confirmationPopupActions.clickToYesBtn();
        confirmationPopupQuestions.verifyPopupIsNotDisplayed();
    }
}
