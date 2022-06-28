package org.event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.context.CarbonContext;
import org.wso2.carbon.user.api.Permission;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.UserStoreManager;
import org.wso2.carbon.user.core.common.AbstractUserOperationEventListener;

import java.util.List;
import java.util.Map;


public class usereventlistenerUserOperationEventListener extends AbstractUserOperationEventListener {

    //Sample Code
    private static Log audit = LogFactory.getLog(usereventlistenerUserOperationEventListener.class);
    private static String AUDIT_MESSAGE = "Initiator: %s performed the Action: %s on Target: %s ";

    @Override
    public int getExecutionOrderId() {

        //TODO: Implementation required.

        //This listener should execute before the IdentityMgtEventListener.
        //Hence the number should be < 1357 (Execution order ID of IdentityMgtEventListener).
        return 1356;
    }

    @Override
    public boolean doPreAuthenticate(String userName, Object credential, UserStoreManager userStoreManager)
            throws UserStoreException {

        //TODO: Implement if required.

        //Runs before Authentication of User.

        //Sample Code.
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreAuthenticate", userName));
        return true;
    }

    @Override
    public boolean doPostAuthenticate(String userName, boolean authenticated, UserStoreManager userStoreManager)
            throws UserStoreException {

        //TODO: Implement if required.

        //Runs after Authentication of User.

        //Sample Code.
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostAuthenticateyyyy", userName));
        return true;
    }

    @Override
    public boolean doPreAddUser(String userName, Object credential, String[] roleList, Map<String, String> claims,
                                String profile, UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs before creating a User.

        //Sample Code.
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreAddUser", userName));
        return true;
    }

    @Override
    public boolean doPostAddUser(String userName, Object credential, String[] roleList, Map<String, String> claims,
                                 String profile, UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs after creating a User.

        //Sample Code.
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostAddUser", userName));
        return true;
    }

    @Override
    public boolean doPreUpdateCredential(String userName, Object newCredential, Object oldCredential,
                                         UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs before Updating the password of User.

        //Sample Code.
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreUpdateCredential", userName));
        return true;
    }

    @Override
    public boolean doPostUpdateCredential(String userName, Object credential, UserStoreManager userStoreManager)
            throws UserStoreException {

        //TODO: Implement if required.

        //Runs after Updating the password of User.

        //Sample Code.
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostUpdateCredential", userName));
        return true;
    }

    @Override
    public boolean doPreUpdateCredentialByAdmin(String userName, Object newCredential,
                                                UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs before updating the password of User by Admin.

        //Sample Code.
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreUpdateCredentialByAdmin", userName));
        return true;
    }

    @Override
    public boolean doPostUpdateCredentialByAdmin(String userName, Object credential, UserStoreManager userStoreManager)
            throws UserStoreException {

        //TODO: Implement if required.

        //Runs after updating the password of User by Admin.

        //Sample Code.
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostUpdateCredentialByAdmin", userName));
        return true;
    }

    @Override
    public boolean doPreDeleteUser(String userName, UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs before deleting a User.

        //Sample Code.
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreDeleteUser", userName));
        return true;
    }

    @Override
    public boolean doPostDeleteUser(String userName, UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs after deleting a User.

        //Sample Code.
        audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostDeleteUser", userName));
        return true;
    }

    @Override
    public boolean doPreSetUserClaimValue(String userName, String claimURI, String claimValue, String profileName,
                                          UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs before updating a claim of the user.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreSetUserClaimValue", userName));
        return true;
    }

    @Override
    public boolean doPostSetUserClaimValue(String userName, UserStoreManager userStoreManager)
            throws UserStoreException {

        //TODO: Implement if required.

        //Runs after updating a claim of the user.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostSetUserClaimValue", userName));
        return true;
    }

    @Override
    public boolean doPreSetUserClaimValues(String userName, Map<String, String> claims, String profileName,
                                           UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs before updating multiple claims of the user.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreSetUserClaimValues", userName));
        return true;
    }

    @Override
    public boolean doPostSetUserClaimValues(String userName, Map<String, String> claims, String profileName,
                                            UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs after updating multiple claims of the user.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostSetUserClaimValues", userName));
        return true;
    }

    @Override
    public boolean doPreDeleteUserClaimValues(String userName, String[] claims, String profileName,
                                              UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs before deleting claims of the user.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreDeleteUserClaimValues", userName));
        return true;
    }

    @Override
    public boolean doPostDeleteUserClaimValues(String userName, UserStoreManager userStoreManager)
            throws UserStoreException {

        //TODO: Implement if required.

        //Runs after deleting claims of the user.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostDeleteUserClaimValues", userName));
        return true;
    }

    @Override
    public boolean doPreDeleteUserClaimValue(String userName, String claimURI, String profileName,
                                             UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs before updating a claim of the user.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreDeleteUserClaimValue", userName));
        return true;
    }

    @Override
    public boolean doPostDeleteUserClaimValue(String userName, UserStoreManager userStoreManager)
            throws UserStoreException {

        //TODO: Implement if required.

        //Runs after deleting a claim of the user.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostDeleteUserClaimValue", userName));
        return true;
    }

    @Override
    public boolean doPreAddRole(String roleName, String[] userList, Permission[] permissions,
                                UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs before adding a role.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreAddRole", roleName));
        return true;
    }

    @Override
    public boolean doPostAddRole(String roleName, String[] userList, Permission[] permissions,
                                 UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs after adding a role.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostAddRole", roleName));
        return true;
    }

    @Override
    public boolean doPreDeleteRole(String roleName, UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs after deleting a role.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreDeleteRole", roleName));
        return true;
    }

    @Override
    public boolean doPostDeleteRole(String roleName, UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs after deleting a role.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostDeleteRole", roleName));
        return true;
    }

    @Override
    public boolean doPreUpdateRoleName(String roleName, String newRoleName, UserStoreManager userStoreManager)
            throws UserStoreException{

        //TODO: Implement if required.

        //Runs before updating the rolename.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreUpdateRoleName", roleName));
        return true;
    }

    @Override
    public boolean doPostUpdateRoleName(String roleName, String newRoleName, UserStoreManager userStoreManager)
            throws UserStoreException {

        //TODO: Implement if required.

        //Runs after updating the rolename.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostUpdateRoleName", roleName));
        return true;
    }

    @Override
    public boolean doPreUpdateUserListOfRole(String roleName, String[] deletedUsers, String[] newUsers,
                                             UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs before updating the userlist of the rolename.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreUpdateUserListOfRole", roleName));
        return true;
    }

    @Override
    public boolean doPostUpdateUserListOfRole(String roleName, String[] deletedUsers, String[] newUsers,
                                              UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs after updating the userlist of the rolename.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostUpdateUserListOfRole", roleName));
        return true;
    }

    @Override
    public boolean doPreUpdateRoleListOfUser(String userName, String[] deletedRoles, String[] newRoles,
                                             UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs before updating the rolelist of the user.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreUpdateRoleListOfUser", userName));
        return true;
    }

    @Override
    public boolean doPostUpdateRoleListOfUser(String userName, String[] deletedRoles, String[] newRoles,
                                              UserStoreManager userStoreManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs after updating the rolelist of the user.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostUpdateRoleListOfUser", userName));
        return true;
    }

    @Override
    public boolean doPreGetUserClaimValue(String userName, String claim, String profileName,
                                          UserStoreManager storeManager) throws UserStoreException {


        //TODO: Implement if required.

        //Runs before getting the user claim value.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreGetUserClaimValue", userName));
        return true;
    }

    @Override
    public boolean doPreGetUserClaimValues(String userName, String[] claims, String profileName, Map<String,
            String> claimMap, UserStoreManager storeManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs before getting the user claim values.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPreGetUserClaimValues", userName));
        return true;
    }

    @Override
    public boolean doPostGetUserClaimValue(String userName, String claim, List<String> claimValue, String profileName,
                                           UserStoreManager storeManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs after getting the user claim value.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostGetUserClaimValue", userName));
        return true;
    }

    @Override
    public boolean doPostGetUserClaimValues(String userName, String[] claims, String profileName, Map<String,
            String> claimMap, UserStoreManager storeManager) throws UserStoreException {

        //TODO: Implement if required.

        //Runs after getting the user claim values.

        //Sample Code.
        //audit.info(String.format(AUDIT_MESSAGE, getUser(), "doPostGetUserClaimValues", userName));
        return true;
    }

    /**
     * Get the logged in user's username who is calling the operation.
     * This is method is needed to excute sample code.
     *
     * @return username
     */
    private String getUser() {

        return CarbonContext.getThreadLocalCarbonContext().getUsername() + "@" +
                CarbonContext.getThreadLocalCarbonContext().getTenantDomain();
    }

}
