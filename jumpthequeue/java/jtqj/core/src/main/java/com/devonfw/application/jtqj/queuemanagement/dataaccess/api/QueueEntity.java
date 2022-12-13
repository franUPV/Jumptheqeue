package com.devonfw.application.jtqj.queuemanagement.dataaccess.api;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.devonfw.application.jtqj.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.jtqj.queuemanagement.common.api.Queue;

@Entity
@Table(name = "DailyQueue")
public class QueueEntity extends ApplicationPersistenceEntity implements Queue {

  private String name;

  private String logo;

  private String currentNumber;

  @Temporal(TemporalType.TIMESTAMP)
  private Timestamp attentionTime;

  @Temporal(TemporalType.TIMESTAMP)
  private Timestamp minAttentionTime;

  private Boolean active;

  private int customers;

  private static final long serialVersionUID = 1L;

  /**
   * @return name
   */
  @Override
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  @Override
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return logo
   */
  @Override
  public String getLogo() {

    return this.logo;
  }

  /**
   * @param logo new value of {@link #getlogo}.
   */
  @Override
  public void setLogo(String logo) {

    this.logo = logo;
  }

  /**
   * @return currentNumber
   */
  @Override
  public String getCurrentNumber() {

    return this.currentNumber;
  }

  /**
   * @param currentNumber new value of {@link #getcurrentNumber}.
   */
  @Override
  public void setCurrentNumber(String currentNumber) {

    this.currentNumber = currentNumber;
  }

  /**
   * @return attentionTime
   */
  @Override
  public Timestamp getAttentionTime() {

    return this.attentionTime;
  }

  /**
   * @param attentionTime new value of {@link #getattentionTime}.
   */
  public void setAttentionTime(Timestamp attentionTime) {

    this.attentionTime = attentionTime;
  }

  /**
   * @return minAttentionTime
   */
  @Override
  public Timestamp getMinAttentionTime() {

    return this.minAttentionTime;
  }

  /**
   * @param minAttentionTime new value of {@link #getminAttentionTime}.
   */
  public void setMinAttentionTime(Timestamp minAttentionTime) {

    this.minAttentionTime = minAttentionTime;
  }

  /**
   * @return active
   */
  @Override
  public Boolean getActive() {

    return this.active;
  }

  /**
   * @param active new value of {@link #getactive}.
   */
  @Override
  public void setActive(Boolean active) {

    this.active = active;
  }

  /**
   * @return customers
   */
  @Override
  public int getCustomers() {

    return this.customers;
  }

  /**
   * @param customers new value of {@link #getcustomers}.
   */
  @Override
  public void setCustomers(int customers) {

    this.customers = customers;
  }

}
