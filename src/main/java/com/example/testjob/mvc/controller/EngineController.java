package com.example.testjob.mvc.controller;

import com.example.testjob.mvc.service.EngineService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Engine")
@Slf4j
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@Tag(name = "Engine", description = "Engine Controller")
public class EngineController {

    EngineService engineService;
    @PostMapping("/addKm")
    public ResponseEntity<Void> addKm(@RequestParam double kilometers) throws InterruptedException {
        engineService.setKilometres(kilometers);
        engineService.getProductKm();
        log.info("Adding {} kilometers to the engine counter", kilometers);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
