package model;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 18 15:41:02 NOVT 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesImpl extends EntityImpl {
    /**
     * Validation method for Email.
     */
    public boolean validateEmail(String email) {
        return true;
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        EmployeeId,
        FirstName,
        LastName,
        Email,
        PhoneNumber,
        HireDate,
        JobId,
        Salary,
        CommissionPct,
        ManagerId,
        DepartmentId,
        Departments1,
        Employees,
        ManagerIdEmployees,
        Departments11,
        Jobs1,
        JobHistory;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int PHONENUMBER = AttributesEnum.PhoneNumber.index();
    public static final int HIREDATE = AttributesEnum.HireDate.index();
    public static final int JOBID = AttributesEnum.JobId.index();
    public static final int SALARY = AttributesEnum.Salary.index();
    public static final int COMMISSIONPCT = AttributesEnum.CommissionPct.index();
    public static final int MANAGERID = AttributesEnum.ManagerId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int DEPARTMENTS1 = AttributesEnum.Departments1.index();
    public static final int EMPLOYEES = AttributesEnum.Employees.index();
    public static final int MANAGERIDEMPLOYEES = AttributesEnum.ManagerIdEmployees.index();
    public static final int DEPARTMENTS11 = AttributesEnum.Departments11.index();
    public static final int JOBS1 = AttributesEnum.Jobs1.index();
    public static final int JOBHISTORY = AttributesEnum.JobHistory.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmployeesImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.Employees");
    }

    /**
     * Gets the attribute value for EmployeeId, using the alias name EmployeeId.
     * @return the value of EmployeeId
     */
    public Integer getEmployeeId() {
        return (Integer) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeId.
     * @param value value to set the EmployeeId
     */
    public void setEmployeeId(Integer value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for FirstName, using the alias name FirstName.
     * @return the value of FirstName
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstName.
     * @param value value to set the FirstName
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for LastName, using the alias name LastName.
     * @return the value of LastName
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastName.
     * @param value value to set the LastName
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the value of Email
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for PhoneNumber, using the alias name PhoneNumber.
     * @return the value of PhoneNumber
     */
    public String getPhoneNumber() {
        return (String) getAttributeInternal(PHONENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for PhoneNumber.
     * @param value value to set the PhoneNumber
     */
    public void setPhoneNumber(String value) {
        setAttributeInternal(PHONENUMBER, value);
    }

    /**
     * Gets the attribute value for HireDate, using the alias name HireDate.
     * @return the value of HireDate
     */
    public Timestamp getHireDate() {
        return (Timestamp) getAttributeInternal(HIREDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for HireDate.
     * @param value value to set the HireDate
     */
    public void setHireDate(Timestamp value) {
        setAttributeInternal(HIREDATE, value);
    }

    /**
     * Gets the attribute value for JobId, using the alias name JobId.
     * @return the value of JobId
     */
    public String getJobId() {
        return (String) getAttributeInternal(JOBID);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobId.
     * @param value value to set the JobId
     */
    public void setJobId(String value) {
        setAttributeInternal(JOBID, value);
    }

    /**
     * Gets the attribute value for Salary, using the alias name Salary.
     * @return the value of Salary
     */
    public BigDecimal getSalary() {
        return (BigDecimal) getAttributeInternal(SALARY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Salary.
     * @param value value to set the Salary
     */
    public void setSalary(BigDecimal value) {
        setAttributeInternal(SALARY, value);
    }

    /**
     * Gets the attribute value for CommissionPct, using the alias name CommissionPct.
     * @return the value of CommissionPct
     */
    public BigDecimal getCommissionPct() {
        return (BigDecimal) getAttributeInternal(COMMISSIONPCT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CommissionPct.
     * @param value value to set the CommissionPct
     */
    public void setCommissionPct(BigDecimal value) {
        setAttributeInternal(COMMISSIONPCT, value);
    }

    /**
     * Gets the attribute value for ManagerId, using the alias name ManagerId.
     * @return the value of ManagerId
     */
    public Integer getManagerId() {
        return (Integer) getAttributeInternal(MANAGERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ManagerId.
     * @param value value to set the ManagerId
     */
    public void setManagerId(Integer value) {
        setAttributeInternal(MANAGERID, value);
    }

    /**
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the value of DepartmentId
     */
    public Integer getDepartmentId() {
        return (Integer) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(Integer value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDepartments1() {
        return (RowIterator) getAttributeInternal(DEPARTMENTS1);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getEmployees() {
        return (RowIterator) getAttributeInternal(EMPLOYEES);
    }

    /**
     * @return the associated entity EmployeesImpl.
     */
    public EmployeesImpl getManagerIdEmployees() {
        return (EmployeesImpl) getAttributeInternal(MANAGERIDEMPLOYEES);
    }

    /**
     * Sets <code>value</code> as the associated entity EmployeesImpl.
     */
    public void setManagerIdEmployees(EmployeesImpl value) {
        setAttributeInternal(MANAGERIDEMPLOYEES, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getDepartments11() {
        return (EntityImpl) getAttributeInternal(DEPARTMENTS11);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setDepartments11(EntityImpl value) {
        setAttributeInternal(DEPARTMENTS11, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getJobs1() {
        return (EntityImpl) getAttributeInternal(JOBS1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setJobs1(EntityImpl value) {
        setAttributeInternal(JOBS1, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getJobHistory() {
        return (RowIterator) getAttributeInternal(JOBHISTORY);
    }

    /**
     * @param employeeId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer employeeId) {
        return new Key(new Object[] { employeeId });
    }


}

