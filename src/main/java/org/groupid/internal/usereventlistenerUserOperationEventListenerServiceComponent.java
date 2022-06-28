package org.groupid.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.wso2.carbon.user.core.listener.UserOperationEventListener;
import org.wso2.carbon.user.core.service.RealmService;
import org.groupid.usereventlistenerUserOperationEventListener;

@Component(name = "org.groupid.usereventlistenerUserOperationEventListenerServiceComponent",
        immediate = true)
public class usereventlistenerUserOperationEventListenerServiceComponent {

    private static Log log = LogFactory.getLog(usereventlistenerUserOperationEventListenerServiceComponent.class);
    private ServiceRegistration serviceRegistration = null;

    @Activate
    protected void activate(ComponentContext context) {

        //register the custom listener as an OSGI service.
        serviceRegistration = context.getBundleContext().registerService(UserOperationEventListener.class.getName(),
                new usereventlistenerUserOperationEventListener(),null);
        log.info("usereventlistenerUserOperationEventListenerServiceComponent bundle activated successfully.");
    }

    protected void deactivate(ComponentContext context) {

        if (log.isDebugEnabled()) {
            log.debug("usereventlistenerUserOperationEventListenerServiceComponent is deactivated.");
        }

        // Unregistering the custom listener service.
        if (serviceRegistration != null) {
            serviceRegistration.unregister();
        }
    }

    @Reference(name = "user.realm.service.default",
            service = RealmService.class,
            cardinality = ReferenceCardinality.MANDATORY,
            policy = ReferencePolicy.DYNAMIC,
            unbind = "unsetRealmService")
    protected void setRealmService(RealmService realmService) {

        usereventlistenerUserOperationEventListenerDataHolder.getInstance().setRealmService(realmService);
    }

    protected void unsetRealmService(RealmService realmService) {

        usereventlistenerUserOperationEventListenerDataHolder.getInstance().setRealmService(null);
    }

}
