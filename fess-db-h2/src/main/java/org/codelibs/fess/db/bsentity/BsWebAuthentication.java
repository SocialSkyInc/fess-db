package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of WEB_AUTHENTICATION as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, HOSTNAME, PORT, AUTH_REALM, PROTOCOL_SCHEME, USERNAME, PASSWORD, PARAMETERS, WEB_CRAWLING_CONFIG_ID, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     ID
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     WEB_CRAWLING_CONFIG
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     webCrawlingConfig
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String hostname = entity.getHostname();
 * Integer port = entity.getPort();
 * String authRealm = entity.getAuthRealm();
 * String protocolScheme = entity.getProtocolScheme();
 * String username = entity.getUsername();
 * String password = entity.getPassword();
 * String parameters = entity.getParameters();
 * Long webCrawlingConfigId = entity.getWebCrawlingConfigId();
 * String createdBy = entity.getCreatedBy();
 * java.time.LocalDateTime createdTime = entity.getCreatedTime();
 * String updatedBy = entity.getUpdatedBy();
 * java.time.LocalDateTime updatedTime = entity.getUpdatedTime();
 * String deletedBy = entity.getDeletedBy();
 * java.time.LocalDateTime deletedTime = entity.getDeletedTime();
 * Integer versionNo = entity.getVersionNo();
 * entity.setId(id);
 * entity.setHostname(hostname);
 * entity.setPort(port);
 * entity.setAuthRealm(authRealm);
 * entity.setProtocolScheme(protocolScheme);
 * entity.setUsername(username);
 * entity.setPassword(password);
 * entity.setParameters(parameters);
 * entity.setWebCrawlingConfigId(webCrawlingConfigId);
 * entity.setCreatedBy(createdBy);
 * entity.setCreatedTime(createdTime);
 * entity.setUpdatedBy(updatedBy);
 * entity.setUpdatedTime(updatedTime);
 * entity.setDeletedBy(deletedBy);
 * entity.setDeletedTime(deletedTime);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWebAuthentication extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _id;

    /** HOSTNAME: {VARCHAR(100)} */
    protected String _hostname;

    /** PORT: {NotNull, INTEGER(10)} */
    protected Integer _port;

    /** AUTH_REALM: {VARCHAR(100)} */
    protected String _authRealm;

    /** PROTOCOL_SCHEME: {VARCHAR(10)} */
    protected String _protocolScheme;

    /** USERNAME: {NotNull, VARCHAR(100)} */
    protected String _username;

    /** PASSWORD: {VARCHAR(100)} */
    protected String _password;

    /** PARAMETERS: {VARCHAR(1000)} */
    protected String _parameters;

    /** WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG} */
    protected Long _webCrawlingConfigId;

    /** CREATED_BY: {NotNull, VARCHAR(255)} */
    protected String _createdBy;

    /** CREATED_TIME: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _createdTime;

    /** UPDATED_BY: {VARCHAR(255)} */
    protected String _updatedBy;

    /** UPDATED_TIME: {TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _updatedTime;

    /** DELETED_BY: {VARCHAR(255)} */
    protected String _deletedBy;

    /** DELETED_TIME: {TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _deletedTime;

    /** VERSION_NO: {NotNull, INTEGER(10)} */
    protected Integer _versionNo;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WEB_AUTHENTICATION";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WEB_CRAWLING_CONFIG by my WEB_CRAWLING_CONFIG_ID, named 'webCrawlingConfig'. */
    protected OptionalEntity<WebCrawlingConfig> _webCrawlingConfig;

    /**
     * [get] WEB_CRAWLING_CONFIG by my WEB_CRAWLING_CONFIG_ID, named 'webCrawlingConfig'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'webCrawlingConfig'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WebCrawlingConfig> getWebCrawlingConfig() {
        if (_webCrawlingConfig == null) { _webCrawlingConfig = OptionalEntity.relationEmpty(this, "webCrawlingConfig"); }
        return _webCrawlingConfig;
    }

    /**
     * [set] WEB_CRAWLING_CONFIG by my WEB_CRAWLING_CONFIG_ID, named 'webCrawlingConfig'.
     * @param webCrawlingConfig The entity of foreign property 'webCrawlingConfig'. (NullAllowed)
     */
    public void setWebCrawlingConfig(OptionalEntity<WebCrawlingConfig> webCrawlingConfig) {
        _webCrawlingConfig = webCrawlingConfig;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWebAuthentication) {
            BsWebAuthentication other = (BsWebAuthentication)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_webCrawlingConfig != null && _webCrawlingConfig.isPresent())
        { sb.append(li).append(xbRDS(_webCrawlingConfig, "webCrawlingConfig")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_hostname));
        sb.append(dm).append(xfND(_port));
        sb.append(dm).append(xfND(_authRealm));
        sb.append(dm).append(xfND(_protocolScheme));
        sb.append(dm).append(xfND(_username));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_parameters));
        sb.append(dm).append(xfND(_webCrawlingConfigId));
        sb.append(dm).append(xfND(_createdBy));
        sb.append(dm).append(xfND(_createdTime));
        sb.append(dm).append(xfND(_updatedBy));
        sb.append(dm).append(xfND(_updatedTime));
        sb.append(dm).append(xfND(_deletedBy));
        sb.append(dm).append(xfND(_deletedTime));
        sb.append(dm).append(xfND(_versionNo));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_webCrawlingConfig != null && _webCrawlingConfig.isPresent())
        { sb.append(dm).append("webCrawlingConfig"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WebAuthentication clone() {
        return (WebAuthentication)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param id The value of the column 'ID'. (basically NotNull if update: for the constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] HOSTNAME: {VARCHAR(100)} <br>
     * @return The value of the column 'HOSTNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getHostname() {
        checkSpecifiedProperty("hostname");
        return _hostname;
    }

    /**
     * [set] HOSTNAME: {VARCHAR(100)} <br>
     * @param hostname The value of the column 'HOSTNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHostname(String hostname) {
        registerModifiedProperty("hostname");
        _hostname = hostname;
    }

    /**
     * [get] PORT: {NotNull, INTEGER(10)} <br>
     * @return The value of the column 'PORT'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPort() {
        checkSpecifiedProperty("port");
        return _port;
    }

    /**
     * [set] PORT: {NotNull, INTEGER(10)} <br>
     * @param port The value of the column 'PORT'. (basically NotNull if update: for the constraint)
     */
    public void setPort(Integer port) {
        registerModifiedProperty("port");
        _port = port;
    }

    /**
     * [get] AUTH_REALM: {VARCHAR(100)} <br>
     * @return The value of the column 'AUTH_REALM'. (NullAllowed even if selected: for no constraint)
     */
    public String getAuthRealm() {
        checkSpecifiedProperty("authRealm");
        return _authRealm;
    }

    /**
     * [set] AUTH_REALM: {VARCHAR(100)} <br>
     * @param authRealm The value of the column 'AUTH_REALM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAuthRealm(String authRealm) {
        registerModifiedProperty("authRealm");
        _authRealm = authRealm;
    }

    /**
     * [get] PROTOCOL_SCHEME: {VARCHAR(10)} <br>
     * @return The value of the column 'PROTOCOL_SCHEME'. (NullAllowed even if selected: for no constraint)
     */
    public String getProtocolScheme() {
        checkSpecifiedProperty("protocolScheme");
        return _protocolScheme;
    }

    /**
     * [set] PROTOCOL_SCHEME: {VARCHAR(10)} <br>
     * @param protocolScheme The value of the column 'PROTOCOL_SCHEME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProtocolScheme(String protocolScheme) {
        registerModifiedProperty("protocolScheme");
        _protocolScheme = protocolScheme;
    }

    /**
     * [get] USERNAME: {NotNull, VARCHAR(100)} <br>
     * @return The value of the column 'USERNAME'. (basically NotNull if selected: for the constraint)
     */
    public String getUsername() {
        checkSpecifiedProperty("username");
        return _username;
    }

    /**
     * [set] USERNAME: {NotNull, VARCHAR(100)} <br>
     * @param username The value of the column 'USERNAME'. (basically NotNull if update: for the constraint)
     */
    public void setUsername(String username) {
        registerModifiedProperty("username");
        _username = username;
    }

    /**
     * [get] PASSWORD: {VARCHAR(100)} <br>
     * @return The value of the column 'PASSWORD'. (NullAllowed even if selected: for no constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] PASSWORD: {VARCHAR(100)} <br>
     * @param password The value of the column 'PASSWORD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] PARAMETERS: {VARCHAR(1000)} <br>
     * @return The value of the column 'PARAMETERS'. (NullAllowed even if selected: for no constraint)
     */
    public String getParameters() {
        checkSpecifiedProperty("parameters");
        return _parameters;
    }

    /**
     * [set] PARAMETERS: {VARCHAR(1000)} <br>
     * @param parameters The value of the column 'PARAMETERS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setParameters(String parameters) {
        registerModifiedProperty("parameters");
        _parameters = parameters;
    }

    /**
     * [get] WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG} <br>
     * @return The value of the column 'WEB_CRAWLING_CONFIG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getWebCrawlingConfigId() {
        checkSpecifiedProperty("webCrawlingConfigId");
        return _webCrawlingConfigId;
    }

    /**
     * [set] WEB_CRAWLING_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG} <br>
     * @param webCrawlingConfigId The value of the column 'WEB_CRAWLING_CONFIG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWebCrawlingConfigId(Long webCrawlingConfigId) {
        registerModifiedProperty("webCrawlingConfigId");
        _webCrawlingConfigId = webCrawlingConfigId;
    }

    /**
     * [get] CREATED_BY: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'CREATED_BY'. (basically NotNull if selected: for the constraint)
     */
    public String getCreatedBy() {
        checkSpecifiedProperty("createdBy");
        return _createdBy;
    }

    /**
     * [set] CREATED_BY: {NotNull, VARCHAR(255)} <br>
     * @param createdBy The value of the column 'CREATED_BY'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedBy(String createdBy) {
        registerModifiedProperty("createdBy");
        _createdBy = createdBy;
    }

    /**
     * [get] CREATED_TIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'CREATED_TIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getCreatedTime() {
        checkSpecifiedProperty("createdTime");
        return _createdTime;
    }

    /**
     * [set] CREATED_TIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param createdTime The value of the column 'CREATED_TIME'. (basically NotNull if update: for the constraint)
     */
    public void setCreatedTime(java.time.LocalDateTime createdTime) {
        registerModifiedProperty("createdTime");
        _createdTime = createdTime;
    }

    /**
     * [get] UPDATED_BY: {VARCHAR(255)} <br>
     * @return The value of the column 'UPDATED_BY'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdatedBy() {
        checkSpecifiedProperty("updatedBy");
        return _updatedBy;
    }

    /**
     * [set] UPDATED_BY: {VARCHAR(255)} <br>
     * @param updatedBy The value of the column 'UPDATED_BY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdatedBy(String updatedBy) {
        registerModifiedProperty("updatedBy");
        _updatedBy = updatedBy;
    }

    /**
     * [get] UPDATED_TIME: {TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'UPDATED_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdatedTime() {
        checkSpecifiedProperty("updatedTime");
        return _updatedTime;
    }

    /**
     * [set] UPDATED_TIME: {TIMESTAMP(23, 10)} <br>
     * @param updatedTime The value of the column 'UPDATED_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdatedTime(java.time.LocalDateTime updatedTime) {
        registerModifiedProperty("updatedTime");
        _updatedTime = updatedTime;
    }

    /**
     * [get] DELETED_BY: {VARCHAR(255)} <br>
     * @return The value of the column 'DELETED_BY'. (NullAllowed even if selected: for no constraint)
     */
    public String getDeletedBy() {
        checkSpecifiedProperty("deletedBy");
        return _deletedBy;
    }

    /**
     * [set] DELETED_BY: {VARCHAR(255)} <br>
     * @param deletedBy The value of the column 'DELETED_BY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeletedBy(String deletedBy) {
        registerModifiedProperty("deletedBy");
        _deletedBy = deletedBy;
    }

    /**
     * [get] DELETED_TIME: {TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'DELETED_TIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getDeletedTime() {
        checkSpecifiedProperty("deletedTime");
        return _deletedTime;
    }

    /**
     * [set] DELETED_TIME: {TIMESTAMP(23, 10)} <br>
     * @param deletedTime The value of the column 'DELETED_TIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDeletedTime(java.time.LocalDateTime deletedTime) {
        registerModifiedProperty("deletedTime");
        _deletedTime = deletedTime;
    }

    /**
     * [get] VERSION_NO: {NotNull, INTEGER(10)} <br>
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Integer getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, INTEGER(10)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Integer versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }
}
