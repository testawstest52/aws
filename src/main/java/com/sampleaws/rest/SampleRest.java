/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sampleaws.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRest {

    @GetMapping(path = "/hello/{path}")
    String echoPath(@PathVariable(name = "path") String path) {
        return "AWS Deployment. You have sent the path " + path;
    }
}
