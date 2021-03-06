/*
 * Velocity-Sandbox
 * API to create a Velocity Sandbox
 *
 * OpenAPI spec version: 1.0.0
 * Contact: alay.vakil@veritas.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ComposedObject;
import io.swagger.client.model.Error;
import io.swagger.client.model.Sandbox;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CreateSandboxApi
 */
@Ignore
public class CreateSandboxApiTest {

    private final CreateSandboxApi api = new CreateSandboxApi();

    
    /**
     * 
     *
     * Create Velocity Template , PointinTime and  Sandbox
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSandboxTest() throws ApiException {
        String velocityToken = null;
        ComposedObject body = null;
        Sandbox response = api.createSandbox(velocityToken, body);

        // TODO: test validations
    }
    
}
