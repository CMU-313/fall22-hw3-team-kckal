package com.sismics.docs.core.model.jpa;

import com.google.common.base.MoreObjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import java.util.Date;

/**
 * Document entity.
 * 
 * @author bgamard
 */
@Entity
@Table(name = "T_DOCUMENT")
@SecondaryTables({
@SecondaryTable(name = "T_EDUCATION", foreignKey = @ForeignKey(name="EDU_IDDOC_C", foreignKeyDefinition =  "(EDU_IDDOC_C) references T_DOCUMENT (DOC_ID_C)")),
 @SecondaryTable(name = "T_EXPERIENCE", foreignKey= @ForeignKey(name="EXP_IDDOC_C", foreignKeyDefinition =  "(EXP_IDDOC_C) references T_DOCUMENT (DOC_ID_C)"))
})
 public class Document implements Loggable {
    /**
     * Document ID.
     */
    @Id
    @Column(name = "DOC_ID_C", length = 36, table="T_DOCUMENT")
    private String id;
    
    /**
     * User ID.
     */
    @Column(name = "DOC_IDUSER_C", nullable = false, length = 36, table="T_DOCUMENT")
    private String userId;
    
    /**
     * Main file ID.
     */
    @Column(name = "DOC_IDFILE_C", length = 36, table="T_DOCUMENT")
    private String fileId;

    /**
     * Language (ISO 639-9).
     */
    @Column(name = "DOC_LANGUAGE_C", nullable = false, length = 3, table="T_DOCUMENT")
    private String language;
    
    /**
     * Title.
     */
    @Column(name = "DOC_TITLE_C", nullable = false, length = 100, table="T_DOCUMENT")
    private String title;
    
    /**
     * Description.
     */
    @Column(name = "DOC_DESCRIPTION_C", length = 4000, table="T_DOCUMENT")
    private String description;
    
    /**
     * Subject.
     */
    @Column(name = "DOC_SUBJECT_C", length = 500, table="T_DOCUMENT")
    private String subject;
    
    /**
     * Identifer.
     */
    @Column(name = "DOC_IDENTIFIER_C", length = 500, table="T_DOCUMENT")
    private String identifier;
    
    /**
     * Publisher.
     */
    @Column(name = "DOC_PUBLISHER_C", length = 500, table="T_DOCUMENT")
    private String publisher;
    
    /**
     * Format.
     */
    @Column(name = "DOC_FORMAT_C", length = 500, table="T_DOCUMENT")
    private String format;
    
    /**
     * Source.
     */
    @Column(name = "DOC_SOURCE_C", length = 500, table="T_DOCUMENT")
    private String source;
    
    /**
     * Type.
     */
    @Column(name = "DOC_TYPE_C", length = 100, table="T_DOCUMENT")
    private String type;
    
    /**
     * Coverage.
     */
    @Column(name = "DOC_COVERAGE_C", length = 100, table="T_DOCUMENT")
    private String coverage;
    
    /**
     * Rights.
     */
    @Column(name = "DOC_RIGHTS_C", length = 100, table="T_DOCUMENT")
    private String rights;
    
    /**
     * Creation date.
     */
    @Column(name = "DOC_CREATEDATE_D", nullable = false, table="T_DOCUMENT")
    private Date createDate;

    /**
     * Creation date.
     */
    @Column(name = "DOC_UPDATEDATE_D", nullable = false, table="T_DOCUMENT")
    private Date updateDate;

    /**
     * Deletion date.
     */
    @Column(name = "DOC_DELETEDATE_D", table="T_DOCUMENT")
    private Date deleteDate;

    // @Id
    @Column(name = "EDU_ID_C", length = 36, table="T_EDUCATION")
    private String eduId;
    
    // @Id
    @Column(name = "EDU_IDDOC_C", length = 36, table="T_EDUCATION")
    private String eduDocId;

    @Column(name = "EDU_NAME_C", nullable = false, length = 100, table = "T_EDUCATION")
    private String universityName;


    @Column(name = "EDU_MAJOR_C", nullable = false, length = 100, table = "T_EDUCATION")
    private String majorName;


    @Column(name = "EDU_GRAD_DATE_D", nullable = false,  table = "T_EDUCATION")
    private Date graduationDate;


    @Column(name = "EDU_GPA", nullable = false, precision = 3, scale = 2, table = "T_EDUCATION")
    private String GPA;

    // @id
    @Column(name = "EXP_ID_C", length = 36, table="T_EXPERIENCE")
    private String expId;

    // @Id
    @Column(name = "EXP_IDDOC_C", length = 36, table="T_EXPERIENCE")
    private String expDocId;
    
    @Column(name = "EXP_COMPANY_C", nullable = false, length = 100, table = "T_EXPERIENCE")
    private String companyName;

    @Column(name = "EXP_ROLE_C", nullable = false, length = 100, table = "T_EXPERIENCE")
    private String titleName;


    @Column(name = "EXP_DESCRIP_C", nullable = false, length = 100, table = "T_EXPERIENCE")
    private String jobDescription;


    @Column(name = "EXP_START_DATE_D", nullable = false,  table = "T_EXPERIENCE")
    private Date startDate;


    @Column(name = " EXP_END_DATE_D", nullable = false, precision = 3, scale = 2, table = "T_EXPERIENCE")
    private Date endDate;



    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFileId() {
        return fileId;
    }

    public Document setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }


    public String getEduId() {
        return eduId;
    }

    public void setEduId(String eduId) {
        this.eduId = eduId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }


    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }
    

    public String getExpId() {
        return expId;
    }

    public void setExpId(String expId) {
        this.expId = expId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription)
     {
        this.jobDescription = jobDescription;
    }



  public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    

  public Date getEndDate() {
    return endDate;
}

public void setEndDate(Date endDate) {
    this.endDate = endDate;
}





    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .toString();
    }

    @Override
    public String toMessage() {
        return title;
    }
}
