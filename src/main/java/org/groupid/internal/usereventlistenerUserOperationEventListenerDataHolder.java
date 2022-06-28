package org.groupid.internal;

import org.wso2.carbon.user.core.service.RealmService;

public class usereventlistenerUserOperationEventListenerDataHolder {

    private static usereventlistenerUserOperationEventListenerDataHolder instance =
            new usereventlistenerUserOperationEventListenerDataHolder();

    private RealmService realmService;

    public static usereventlistenerUserOperationEventListenerDataHolder getInstance() {

        return instance;
    }

    public RealmService getRealmService() {

        return realmService;
    }

    public void setRealmService(RealmService realmService) {

        this.realmService = realmService;
    }

}
