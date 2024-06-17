package com.example.gps.tracker.controllers;

import com.example.gps.tracker.models.CoordinatesDTO;
import com.example.gps.tracker.services.CoordinatesService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "coordinates")
public class CoordinatesController {

    private final CoordinatesService coordinatesService;

    public CoordinatesController(CoordinatesService coordinatesService) {
        this.coordinatesService = coordinatesService;
    }

    @PostMapping
    public void postGPSData(@RequestBody CoordinatesDTO coordinatesDTO) {
        coordinatesService.postGPSData(coordinatesDTO);
    }
}
