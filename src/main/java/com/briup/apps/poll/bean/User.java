package com.briup.apps.poll.bean;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_user.id
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_user.name
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_user.gender
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_user.birth
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    private String birth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_user.hiredate
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    private String hiredate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column poll_user.type
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_user.id
     *
     * @return the value of poll_user.id
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_user.id
     *
     * @param id the value for poll_user.id
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_user.name
     *
     * @return the value of poll_user.name
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_user.name
     *
     * @param name the value for poll_user.name
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_user.gender
     *
     * @return the value of poll_user.gender
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_user.gender
     *
     * @param gender the value for poll_user.gender
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_user.birth
     *
     * @return the value of poll_user.birth
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    public String getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_user.birth
     *
     * @param birth the value for poll_user.birth
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_user.hiredate
     *
     * @return the value of poll_user.hiredate
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    public String getHiredate() {
        return hiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_user.hiredate
     *
     * @param hiredate the value for poll_user.hiredate
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    public void setHiredate(String hiredate) {
        this.hiredate = hiredate == null ? null : hiredate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column poll_user.type
     *
     * @return the value of poll_user.type
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column poll_user.type
     *
     * @param type the value for poll_user.type
     *
     * @mbg.generated Mon Jun 25 16:38:05 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}