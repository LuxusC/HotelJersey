package com.jersey.pojo;

/**
 * 
 * @author Luxus_C
 * @version $Id: Order.java, v 0.1 2017年10月20日 下午8:47:21 Luxus_C Exp $
 */
public class Order {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.room_id
     *
     * @mbggenerated
     */
    private Integer roomId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.book_num
     *
     * @mbggenerated
     */
    private Integer bookNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.guest
     *
     * @mbggenerated
     */
    private String  guest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.phone
     *
     * @mbggenerated
     */
    private String  phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.states
     *
     * @mbggenerated
     */
    private String  states;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.id
     *
     * @return the value of order.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.id
     *
     * @param id the value for order.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.user_id
     *
     * @return the value of order.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.user_id
     *
     * @param userId the value for order.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.room_id
     *
     * @return the value of order.room_id
     *
     * @mbggenerated
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.room_id
     *
     * @param roomId the value for order.room_id
     *
     * @mbggenerated
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.book_num
     *
     * @return the value of order.book_num
     *
     * @mbggenerated
     */
    public Integer getBookNum() {
        return bookNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.book_num
     *
     * @param bookNum the value for order.book_num
     *
     * @mbggenerated
     */
    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.guest
     *
     * @return the value of order.guest
     *
     * @mbggenerated
     */
    public String getGuest() {
        return guest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.guest
     *
     * @param guest the value for order.guest
     *
     * @mbggenerated
     */
    public void setGuest(String guest) {
        this.guest = guest == null ? null : guest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.phone
     *
     * @return the value of order.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.phone
     *
     * @param phone the value for order.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.states
     *
     * @return the value of order.states
     *
     * @mbggenerated
     */
    public String getStates() {
        return states;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.states
     *
     * @param states the value for order.states
     *
     * @mbggenerated
     */
    public void setStates(String states) {
        this.states = states == null ? null : states.trim();
    }
}