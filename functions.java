ObjectMapper objectMapper = new ObjectMapper();
ControllerResponse controllerResponse = objectMapper.readValue(mvcResult.getResponse().getContentAsByteArray(), ControllerResponse.class);

JSONObject cr = new JSONObject(mvcResult.getResponse().getContentAsString());
DataSourceData ds = gson.fromJson(cr.getJSONObject("data").toString(), DataSourceData.class);