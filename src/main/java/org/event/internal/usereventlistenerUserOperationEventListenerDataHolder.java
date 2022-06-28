package org.event.internal;



public class usereventlistenerUserOperationEventListenerDataHolder {

    private static usereventlistenerUserOperationEventListenerDataHolder instance =
            new usereventlistenerUserOperationEventListenerDataHolder();

    private String realmService;

    public static usereventlistenerUserOperationEventListenerDataHolder getInstance() {

        return instance;
    }

    public String getRealmService() {

        return realmService;
    }

    public void setRealmService(String realmService) {

        this.realmService = realmService;
    }

}
