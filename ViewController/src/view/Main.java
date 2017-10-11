package view;

import java.util.Map;

import oracle.adf.view.rich.context.AdfFacesContext;

public class Main {
    public Main() {
        super();
    }
    public void setParam(String input){
           Map pfs = AdfFacesContext.getCurrentInstance().getPageFlowScope();
           pfs.put("param", input);
    }
    public void setParam1(String input){
           Map pfs1 = AdfFacesContext.getCurrentInstance().getPageFlowScope();
           pfs1.put("inputParameter1", input);
    }
}
