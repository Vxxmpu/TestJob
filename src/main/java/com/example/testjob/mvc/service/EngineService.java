package com.example.testjob.mvc.service;

import com.example.testjob.mvc.entity.Engine;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
@Transactional
public class EngineService {
    static final Logger LOGGER =
            Logger.getLogger(Engine.class.getName());
    private Double OverallKm = 500d;
    private Double kilometres = 0d;
    public Double getProductKm() {
        return OverallKm;

    }

    public void setKilometres(Double kilometres) {
        this.kilometres = kilometres;
    }

    @Scheduled(fixedDelay = 12000)
    public void computeKm() throws InterruptedException {
        OverallKm += kilometres;
        LOGGER.info("computing km at "+
                LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
    }
    @Scheduled(fixedRate = 4000)
    @Async
    public void refreshKmParameter() {

        LOGGER.info("current km: "+ OverallKm +" at: "+
                LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
    }

}
