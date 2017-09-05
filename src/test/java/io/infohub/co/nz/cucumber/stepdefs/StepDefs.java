package io.infohub.co.nz.cucumber.stepdefs;

import io.infohub.co.nz.InfohubApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = InfohubApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
