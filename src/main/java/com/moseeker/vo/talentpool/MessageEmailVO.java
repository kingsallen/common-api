package com.moseeker.vo.talentpool;

import lombok.Data;

/**
 * @Date: 2018/12/18
 * @Author: JackYang
 */
@Data
public class MessageEmailVO {
     int positionId;
     int applierId;
     int recommenderUserId;
     int origin;
     int applyType;
     int emailStatus;
     int applicationId;

     public MessageEmailVO(int positionId, int applierId, int recommenderUserId, int origin, int applyType, int emailStatus, int applicationId) {
          this.positionId = positionId;
          this.applierId = applierId;
          this.recommenderUserId = recommenderUserId;
          this.origin = origin;
          this.applyType = applyType;
          this.emailStatus = emailStatus;
          this.applicationId = applicationId;
     }
}
