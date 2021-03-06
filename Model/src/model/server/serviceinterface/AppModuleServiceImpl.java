package model.server.serviceinterface;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import javax.interceptor.Interceptors;

import model.AppModuleImpl;

import model.common.serviceinterface.AppModuleService;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.common.Diagnostic;
import oracle.jbo.common.sdo.SDOHelper;
import oracle.jbo.server.svc.ServiceContextInterceptor;
import oracle.jbo.server.svc.ServiceImpl;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 18 15:59:23 NOVT 2017
// ---------------------------------------------------------------------
@Stateless(name = "model.common.AppModuleServiceBean", mappedName = "AppModuleServiceBean")
@Remote(AppModuleService.class)
@PortableWebService(targetNamespace = "/model/common/", serviceName = "AppModuleService",
                    portName = "AppModuleServiceSoapHttpPort",
                    endpointInterface = "model.common.serviceinterface.AppModuleService")
@Interceptors({ ServiceContextInterceptor.class })
public class AppModuleServiceImpl extends ServiceImpl implements AppModuleService {
    private static boolean _isInited = false;
    private static final Map _map = new HashMap();

    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleServiceImpl() {
        init();
        setApplicationModuleDefName("model.AppModule");
        setConfigurationName("AppModuleService");
    }

    /**
     * Generated method. Do not modify. Do initialization in the constructor
     */
    protected void init() {
        if (_isInited) {
            return;
        }
        synchronized (AppModuleServiceImpl.class) {
            if (_isInited) {
                return;
            }
            try {
                SDOHelper.INSTANCE.defineSchema("model/common/serviceinterface/", "AppModuleService.xsd");
                _map.put("DeleteAllEmps", AppModuleImpl.class.getMethod("DeleteAllEmps", new Class[] { }));
                _isInited = true;
            } catch (Throwable t) {
                ADFLogger.createADFLogger(Diagnostic.SERVINT_RT_LOGGER).severe(t);
            }
        }
    }

    /**
     * DeleteAllEmps: generated method. Do not modify.
     */
    public void DeleteAllEmps() throws ServiceException {
        invokeCustom((Method) _map.get("DeleteAllEmps"), new Object[] { }, new String[] { }, false);
    }
}

