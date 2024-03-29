package com.bitcoin.autotrading.user.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "user_condition")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @JsonProperty("id")
    private Long   id;

    @JsonProperty("deposit")
    private Long   deposit; //예수금

    @JsonProperty("market")
    private String market; //마켓(BTC)

    @JsonProperty("buy_cnt")
    private Long   buyCnt; //분할 매수 횟수

    @JsonProperty("sell_cnt")
    private Long   sellCnt; //분할 매도 횟수

    @JsonProperty("sell_condition")
    private Double sellCondition; //매도조건

    @JsonProperty("buy_condition")
    private Double buyCondition; //매수조건

    @JsonProperty("srt_dttm")
    private LocalDateTime srtDttm; //시작시각

    @JsonProperty("end_dttm")
    private LocalDateTime endDttm; //종료시각

    @JsonProperty("take_profit_rate")
    private Double takeProfitRate; //익절률

    @JsonProperty("stop_loss_rate")
    private Double stopLossRate;   //손절률

    @JsonProperty("unit")
    private String unit;

    @JsonProperty("unit_val")
    private Long unitVal;

}