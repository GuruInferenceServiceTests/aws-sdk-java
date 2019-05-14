/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.chime.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chime.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Bot JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotJsonUnmarshaller implements Unmarshaller<Bot, JsonUnmarshallerContext> {

    public Bot unmarshall(JsonUnmarshallerContext context) throws Exception {
        Bot bot = new Bot();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("BotId", targetDepth)) {
                    context.nextToken();
                    bot.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserId", targetDepth)) {
                    context.nextToken();
                    bot.setUserId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    context.nextToken();
                    bot.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BotType", targetDepth)) {
                    context.nextToken();
                    bot.setBotType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Disabled", targetDepth)) {
                    context.nextToken();
                    bot.setDisabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    context.nextToken();
                    bot.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    bot.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("BotEmail", targetDepth)) {
                    context.nextToken();
                    bot.setBotEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityToken", targetDepth)) {
                    context.nextToken();
                    bot.setSecurityToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return bot;
    }

    private static BotJsonUnmarshaller instance;

    public static BotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BotJsonUnmarshaller();
        return instance;
    }
}
