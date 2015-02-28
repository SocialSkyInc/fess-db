package org.codelibs.fess.db.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.codelibs.fess.db.cbean.cq.ciq.*;
import org.codelibs.fess.db.cbean.*;
import org.codelibs.fess.db.cbean.cq.*;

/**
 * The base condition-query of LABEL_TYPE_TO_ROLE_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public class BsLabelTypeToRoleTypeMappingCQ extends AbstractBsLabelTypeToRoleTypeMappingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LabelTypeToRoleTypeMappingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLabelTypeToRoleTypeMappingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from LABEL_TYPE_TO_ROLE_TYPE_MAPPING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LabelTypeToRoleTypeMappingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LabelTypeToRoleTypeMappingCIQ xcreateCIQ() {
        LabelTypeToRoleTypeMappingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LabelTypeToRoleTypeMappingCIQ xnewCIQ() {
        return new LabelTypeToRoleTypeMappingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join LABEL_TYPE_TO_ROLE_TYPE_MAPPING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LabelTypeToRoleTypeMappingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LabelTypeToRoleTypeMappingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /** 
     * Add order-by as ascend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsLabelTypeToRoleTypeMappingCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsLabelTypeToRoleTypeMappingCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _labelTypeId;
    public ConditionValue xdfgetLabelTypeId()
    { if (_labelTypeId == null) { _labelTypeId = nCV(); }
      return _labelTypeId; }
    protected ConditionValue xgetCValueLabelTypeId() { return xdfgetLabelTypeId(); }

    /** 
     * Add order-by as ascend. <br>
     * LABEL_TYPE_ID: {IX, NotNull, BIGINT(19), FK to LABEL_TYPE}
     * @return this. (NotNull)
     */
    public BsLabelTypeToRoleTypeMappingCQ addOrderBy_LabelTypeId_Asc() { regOBA("LABEL_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * LABEL_TYPE_ID: {IX, NotNull, BIGINT(19), FK to LABEL_TYPE}
     * @return this. (NotNull)
     */
    public BsLabelTypeToRoleTypeMappingCQ addOrderBy_LabelTypeId_Desc() { regOBD("LABEL_TYPE_ID"); return this; }

    protected ConditionValue _roleTypeId;
    public ConditionValue xdfgetRoleTypeId()
    { if (_roleTypeId == null) { _roleTypeId = nCV(); }
      return _roleTypeId; }
    protected ConditionValue xgetCValueRoleTypeId() { return xdfgetRoleTypeId(); }

    /** 
     * Add order-by as ascend. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @return this. (NotNull)
     */
    public BsLabelTypeToRoleTypeMappingCQ addOrderBy_RoleTypeId_Asc() { regOBA("ROLE_TYPE_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE}
     * @return this. (NotNull)
     */
    public BsLabelTypeToRoleTypeMappingCQ addOrderBy_RoleTypeId_Desc() { regOBD("ROLE_TYPE_ID"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsLabelTypeToRoleTypeMappingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsLabelTypeToRoleTypeMappingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LabelTypeToRoleTypeMappingCQ bq = (LabelTypeToRoleTypeMappingCQ)bqs;
        LabelTypeToRoleTypeMappingCQ uq = (LabelTypeToRoleTypeMappingCQ)uqs;
        if (bq.hasConditionQueryLabelType()) {
            uq.queryLabelType().reflectRelationOnUnionQuery(bq.queryLabelType(), uq.queryLabelType());
        }
        if (bq.hasConditionQueryRoleType()) {
            uq.queryRoleType().reflectRelationOnUnionQuery(bq.queryRoleType(), uq.queryRoleType());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'.
     * @return The instance of condition-query. (NotNull)
     */
    public LabelTypeCQ queryLabelType() {
        return xdfgetConditionQueryLabelType();
    }
    public LabelTypeCQ xdfgetConditionQueryLabelType() {
        String prop = "labelType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLabelType()); xsetupOuterJoinLabelType(); }
        return xgetQueRlMap(prop);
    }
    protected LabelTypeCQ xcreateQueryLabelType() {
        String nrp = xresolveNRP("LABEL_TYPE_TO_ROLE_TYPE_MAPPING", "labelType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LabelTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "labelType", nrp);
    }
    protected void xsetupOuterJoinLabelType() { xregOutJo("labelType"); }
    public boolean hasConditionQueryLabelType() { return xhasQueRlMap("labelType"); }

    /**
     * Get the condition-query for relation table. <br>
     * ROLE_TYPE by my ROLE_TYPE_ID, named 'roleType'.
     * @return The instance of condition-query. (NotNull)
     */
    public RoleTypeCQ queryRoleType() {
        return xdfgetConditionQueryRoleType();
    }
    public RoleTypeCQ xdfgetConditionQueryRoleType() {
        String prop = "roleType";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryRoleType()); xsetupOuterJoinRoleType(); }
        return xgetQueRlMap(prop);
    }
    protected RoleTypeCQ xcreateQueryRoleType() {
        String nrp = xresolveNRP("LABEL_TYPE_TO_ROLE_TYPE_MAPPING", "roleType"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RoleTypeCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "roleType", nrp);
    }
    protected void xsetupOuterJoinRoleType() { xregOutJo("roleType"); }
    public boolean hasConditionQueryRoleType() { return xhasQueRlMap("roleType"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, LabelTypeToRoleTypeMappingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LabelTypeToRoleTypeMappingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, LabelTypeToRoleTypeMappingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(LabelTypeToRoleTypeMappingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, LabelTypeToRoleTypeMappingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(LabelTypeToRoleTypeMappingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, LabelTypeToRoleTypeMappingCQ> _myselfExistsMap;
    public Map<String, LabelTypeToRoleTypeMappingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(LabelTypeToRoleTypeMappingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, LabelTypeToRoleTypeMappingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(LabelTypeToRoleTypeMappingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LabelTypeToRoleTypeMappingCB.class.getName(); }
    protected String xCQ() { return LabelTypeToRoleTypeMappingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}