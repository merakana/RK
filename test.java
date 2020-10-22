{
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 5,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/scan/project/ScanProjectMockDataRestController.java",
               "line": 56,
               "column": 50,
               "source": "\t\t\t@RequestBody ScanProjectMockDataConfiguration configuration",
               "relevantPart": "configuration",
               "calls": {
                  "location": "com/rakesh/project/domain/scan/project/ScanProjectMockDataConfiguration.java",
                  "line": 27,
                  "column": 33,
                  "source": "\tprivate Optional<ScanMockData> webScan = Optional.empty();",
                  "relevantPart": "webScan"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 6,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/scan/project/ScanProjectMockDataRestController.java",
               "line": 56,
               "column": 50,
               "source": "\t\t\t@RequestBody ScanProjectMockDataConfiguration configuration",
               "relevantPart": "configuration",
               "calls": {
                  "location": "com/rakesh/project/domain/scan/project/ScanProjectMockDataConfiguration.java",
                  "line": 26,
                  "column": 33,
                  "source": "\tprivate Optional<ScanMockData> codeScan = Optional.empty();",
                  "relevantPart": "codeScan"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 7,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/scan/project/ScanProjectMockDataRestController.java",
               "line": 56,
               "column": 50,
               "source": "\t\t\t@RequestBody ScanProjectMockDataConfiguration configuration",
               "relevantPart": "configuration",
               "calls": {
                  "location": "com/rakesh/project/domain/scan/project/ScanProjectMockDataConfiguration.java",
                  "line": 28,
                  "column": 33,
                  "source": "\tprivate Optional<ScanMockData> infraScan = Optional.empty();",
                  "relevantPart": "infraScan"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 8,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/schedule/SchedulerRestController.java",
               "line": 67,
               "column": 44,
               "source": "\t\t\t@RequestBody @Valid projectConfiguration configuration) {",
               "relevantPart": "configuration",
               "calls": {
                  "location": "com/rakesh/project/sharedkernel/configuration/projectConfiguration.java",
                  "line": 33,
                  "column": 48,
                  "source": "\tprivate Optional<projectCodeScanConfiguration> codeScan = Optional.empty();",
                  "relevantPart": "codeScan"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 9,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/schedule/SchedulerRestController.java",
               "line": 67,
               "column": 44,
               "source": "\t\t\t@RequestBody @Valid projectConfiguration configuration) {",
               "relevantPart": "configuration",
               "calls": {
                  "location": "com/rakesh/project/sharedkernel/configuration/projectConfiguration.java",
                  "line": 31,
                  "column": 47,
                  "source": "\tprivate Optional<projectWebScanConfiguration> webScan = Optional.empty();",
                  "relevantPart": "webScan"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 10,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/schedule/SchedulerRestController.java",
               "line": 67,
               "column": 44,
               "source": "\t\t\t@RequestBody @Valid projectConfiguration configuration) {",
               "relevantPart": "configuration",
               "calls": {
                  "location": "com/rakesh/project/sharedkernel/configuration/projectConfiguration.java",
                  "line": 32,
                  "column": 58,
                  "source": "\tprivate Optional<projectInfrastructureScanConfiguration> infraScan = Optional.empty();",
                  "relevantPart": "infraScan"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 11,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/mapping/MappingAdministrationRestController.java",
               "line": 57,
               "column": 106,
               "source": "    public void updateMapping(@PathVariable(name=\"mappingId\") String mappingId, @RequestBody MappingData mappingData) {",
               "relevantPart": "mappingData",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/mapping/MappingAdministrationRestController.java",
                  "line": 59,
                  "column": 55,
                  "source": "        updateMappingService.updateMapping(mappingId, mappingData);",
                  "relevantPart": "mappingData",
                  "calls": {
                     "location": "com/rakesh/project/domain/administration/mapping/UpdateMappingService.java",
                     "line": 43,
                     "column": 61,
                     "source": "    public void updateMapping(String mappingId, MappingData mappingData) {",
                     "relevantPart": "mappingData",
                     "calls": {
                        "location": "com/rakesh/project/domain/administration/mapping/UpdateMappingService.java",
                        "line": 54,
                        "column": 28,
                        "source": "        mappingObj.setData(mappingData.toJSON());",
                        "relevantPart": "mappingData",
                        "calls": {
                           "location": "com/rakesh/project/domain/administration/mapping/UpdateMappingService.java",
                           "line": 54,
                           "column": 46,
                           "source": "        mappingObj.setData(mappingData.toJSON());",
                           "relevantPart": "toJSON",
                           "calls": {
                              "location": "com/rakesh/project/domain/administration/mapping/Mapping.java",
                              "line": 51,
                              "column": 32,
                              "source": "    public void setData(String json) {",
                              "relevantPart": "json",
                              "calls": {
                                 "location": "com/rakesh/project/domain/administration/mapping/Mapping.java",
                                 "line": 52,
                                 "column": 15,
                                 "source": "\t\tthis.data = json;",
                                 "relevantPart": "json",
                                 "calls": {
                                    "location": "com/rakesh/project/domain/administration/mapping/Mapping.java",
                                    "line": 52,
                                    "column": 7,
                                    "source": "\t\tthis.data = json;",
                                    "relevantPart": "data",
                                    "calls": {
                                       "location": "com/rakesh/project/domain/administration/mapping/UpdateMappingService.java",
                                       "line": 54,
                                       "column": 9,
                                       "source": "        mappingObj.setData(mappingData.toJSON());",
                                       "relevantPart": "mappingObj",
                                       "calls": {
                                          "location": "com/rakesh/project/domain/administration/mapping/UpdateMappingService.java",
                                          "line": 56,
                                          "column": 63,
                                          "source": "        mappingTransactionService.saveMappingInOwnTransaction(mappingObj);",
                                          "relevantPart": "mappingObj",
                                          "calls": {
                                             "location": "com/rakesh/project/domain/administration/mapping/MappingTransactionService.java",
                                             "line": 17,
                                             "column": 56,
                                             "source": "    public Mapping saveMappingInOwnTransaction(Mapping mapping) {",
                                             "relevantPart": "mapping",
                                             "calls": {
                                                "location": "com/rakesh/project/domain/administration/mapping/MappingTransactionService.java",
                                                "line": 19,
                                                "column": 31,
                                                "source": "        return repository.save(mapping);",
                                                "relevantPart": "save"
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 12,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/scan/IntegrationTestScanRestController.java",
               "line": 117,
               "column": 55,
               "source": "    public void changeScanResults(@RequestBody String body, @PathVariable(\"projectId\")String projectId, @PathVariable(\"projectJobUUID\") UUID projectJobUUID ,@PathVariable(\"productIdentifier\") ProductIdentifier productIdentifier) {",
               "relevantPart": "body",
               "calls": {
                  "location": "com/rakesh/project/domain/scan/IntegrationTestScanRestController.java",
                  "line": 133,
                  "column": 21,
                  "source": "        r.setResult(body);",
                  "relevantPart": "body",
                  "calls": {
                     "location": "com/rakesh/project/domain/scan/product/ProductResult.java",
                     "line": 122,
                     "column": 34,
                     "source": "    public void setResult(String result) {",
                     "relevantPart": "result",
                     "calls": {
                        "location": "com/rakesh/project/domain/scan/product/ProductResult.java",
                        "line": 123,
                        "column": 23,
                        "source": "        this.result = result;",
                        "relevantPart": "result",
                        "calls": {
                           "location": "com/rakesh/project/domain/scan/product/ProductResult.java",
                           "line": 123,
                           "column": 13,
                           "source": "        this.result = result;",
                           "relevantPart": "result",
                           "calls": {
                              "location": "com/rakesh/project/domain/scan/IntegrationTestScanRestController.java",
                              "line": 133,
                              "column": 9,
                              "source": "        r.setResult(body);",
                              "relevantPart": "r",
                              "calls": {
                                 "location": "com/rakesh/project/domain/scan/IntegrationTestScanRestController.java",
                                 "line": 134,
                                 "column": 37,
                                 "source": "        productResultRepository.save(r);",
                                 "relevantPart": "save"
                              }
                           }
                        }
                     }
                  }
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 13,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/scan/IntegrationTestScanRestController.java",
               "line": 159,
               "column": 105,
               "source": "    public void updateScanMapping(@PathVariable(\"mappingId\") String mappingId, @RequestBody MappingData mappingData) {",
               "relevantPart": "mappingData",
               "calls": {
                  "location": "com/rakesh/project/domain/scan/IntegrationTestScanRestController.java",
                  "line": 160,
                  "column": 63,
                  "source": "        updateScanMappingService.updateScanMapping(mappingId, mappingData);",
                  "relevantPart": "mappingData",
                  "calls": {
                     "location": "com/rakesh/project/domain/scan/config/UpdateScanMappingService.java",
                     "line": 43,
                     "column": 65,
                     "source": "    public void updateScanMapping(String mappingId, MappingData mappingData) {",
                     "relevantPart": "mappingData",
                     "calls": {
                        "location": "com/rakesh/project/domain/scan/config/UpdateScanMappingService.java",
                        "line": 47,
                        "column": 37,
                        "source": "        updateInDatabase(mappingId, mappingData);",
                        "relevantPart": "mappingData",
                        "calls": {
                           "location": "com/rakesh/project/domain/scan/config/UpdateScanMappingService.java",
                           "line": 52,
                           "column": 65,
                           "source": "    private void updateInDatabase(String mappingId, MappingData mappingData) {",
                           "relevantPart": "mappingData",
                           "calls": {
                              "location": "com/rakesh/project/domain/scan/config/UpdateScanMappingService.java",
                              "line": 60,
                              "column": 23,
                              "source": "        String json = mappingData.toJSON();",
                              "relevantPart": "mappingData",
                              "calls": {
                                 "location": "com/rakesh/project/domain/scan/config/UpdateScanMappingService.java",
                                 "line": 60,
                                 "column": 41,
                                 "source": "        String json = mappingData.toJSON();",
                                 "relevantPart": "toJSON",
                                 "calls": {
                                    "location": "com/rakesh/project/domain/scan/config/UpdateScanMappingService.java",
                                    "line": 60,
                                    "column": 16,
                                    "source": "        String json = mappingData.toJSON();",
                                    "relevantPart": "json",
                                    "calls": {
                                       "location": "com/rakesh/project/domain/scan/config/UpdateScanMappingService.java",
                                       "line": 61,
                                       "column": 28,
                                       "source": "        mappingObj.setData(json);",
                                       "relevantPart": "json",
                                       "calls": {
                                          "location": "com/rakesh/project/domain/scan/config/ScanMapping.java",
                                          "line": 51,
                                          "column": 32,
                                          "source": "    public void setData(String json) {",
                                          "relevantPart": "json",
                                          "calls": {
                                             "location": "com/rakesh/project/domain/scan/config/ScanMapping.java",
                                             "line": 52,
                                             "column": 15,
                                             "source": "\t\tthis.data = json;",
                                             "relevantPart": "json",
                                             "calls": {
                                                "location": "com/rakesh/project/domain/scan/config/ScanMapping.java",
                                                "line": 52,
                                                "column": 7,
                                                "source": "\t\tthis.data = json;",
                                                "relevantPart": "data",
                                                "calls": {
                                                   "location": "com/rakesh/project/domain/scan/config/UpdateScanMappingService.java",
                                                   "line": 61,
                                                   "column": 9,
                                                   "source": "        mappingObj.setData(json);",
                                                   "relevantPart": "mappingObj",
                                                   "calls": {
                                                      "location": "com/rakesh/project/domain/scan/config/UpdateScanMappingService.java",
                                                      "line": 63,
                                                      "column": 24,
                                                      "source": "        repository.save(mappingObj);",
                                                      "relevantPart": "save"
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 14,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/scan/project/ScanProjectMockDataRestController.java",
               "line": 56,
               "column": 50,
               "source": "\t\t\t@RequestBody ScanProjectMockDataConfiguration configuration",
               "relevantPart": "configuration",
               "calls": {
                  "location": "com/rakesh/project/domain/scan/project/ScanProjectMockDataRestController.java",
                  "line": 59,
                  "column": 80,
                  "source": "\t\tprojectMockConfigurationService.defineProjectMockDataConfiguration(projectId,configuration);",
                  "relevantPart": "configuration",
                  "calls": {
                     "location": "com/rakesh/project/domain/scan/project/ScanProjectMockDataConfigurationService.java",
                     "line": 31,
                     "column": 100,
                     "source": "\tpublic void defineProjectMockDataConfiguration(String projectId, ScanProjectMockDataConfiguration configuration) {",
                     "relevantPart": "configuration",
                     "calls": {
                        "location": "com/rakesh/project/domain/scan/project/ScanProjectMockDataConfigurationService.java",
                        "line": 32,
                        "column": 71,
                        "source": "\t\tconfigService.set(projectId,ScanProjectConfigID.MOCK_CONFIGURATION, configuration.toJSON());",
                        "relevantPart": "configuration",
                        "calls": {
                           "location": "com/rakesh/project/domain/scan/project/ScanProjectMockDataConfigurationService.java",
                           "line": 32,
                           "column": 91,
                           "source": "\t\tconfigService.set(projectId,ScanProjectConfigID.MOCK_CONFIGURATION, configuration.toJSON());",
                           "relevantPart": "toJSON",
                           "calls": {
                              "location": "com/rakesh/project/domain/scan/project/ScanProjectConfigService.java",
                              "line": 82,
                              "column": 76,
                              "source": "    public void set(String projectId, ScanProjectConfigID configId, String data) {",
                              "relevantPart": "data",
                              "calls": {
                                 "location": "com/rakesh/project/domain/scan/project/ScanProjectConfigService.java",
                                 "line": 102,
                                 "column": 28,
                                 "source": "            config.setData(data);",
                                 "relevantPart": "data",
                                 "calls": {
                                    "location": "com/rakesh/project/domain/scan/project/ScanProjectConfig.java",
                                    "line": 77,
                                    "column": 29,
                                    "source": "\tpublic void setData(String data) {",
                                    "relevantPart": "data",
                                    "calls": {
                                       "location": "com/rakesh/project/domain/scan/project/ScanProjectConfig.java",
                                       "line": 78,
                                       "column": 15,
                                       "source": "\t\tthis.data = data;",
                                       "relevantPart": "data",
                                       "calls": {
                                          "location": "com/rakesh/project/domain/scan/project/ScanProjectConfig.java",
                                          "line": 78,
                                          "column": 7,
                                          "source": "\t\tthis.data = data;",
                                          "relevantPart": "data",
                                          "calls": {
                                             "location": "com/rakesh/project/domain/scan/project/ScanProjectConfigService.java",
                                             "line": 102,
                                             "column": 13,
                                             "source": "            config.setData(data);",
                                             "relevantPart": "config",
                                             "calls": {
                                                "location": "com/rakesh/project/domain/scan/project/ScanProjectConfigService.java",
                                                "line": 103,
                                                "column": 28,
                                                "source": "            repository.save(config);",
                                                "relevantPart": "save"
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 21,
            "name": "Denial Of Service Resource Exhaustion",
            "severity": "MEDIUM",
            "code": {
               "location": "secret.com/project/util/consoleHelpers.go",
               "line": 52,
               "column": 22,
               "source": "\tresult, err = reader.ReadString('\\n')",
               "relevantPart": "ReadString",
               "calls": {
                  "location": "secret.com/project/util/consoleHelpers.go",
                  "line": 52,
                  "column": 10,
                  "source": "\tresult, err = reader.ReadString('\\n')",
                  "relevantPart": "err",
                  "calls": {
                     "location": "secret.com/project/util/consoleHelpers.go",
                     "line": 53,
                     "column": 43,
                     "source": "\treturn strings.TrimSuffix(result, \"\\n\"), err",
                     "relevantPart": "err",
                     "calls": {
                        "location": "secret.com/project/util/consoleHelpers.go",
                        "line": 36,
                        "column": 16,
                        "source": "\t\tinput, err = ReadFromConsole()",
                        "relevantPart": "ReadFromConsole",
                        "calls": {
                           "location": "secret.com/project/util/consoleHelpers.go",
                           "line": 36,
                           "column": 3,
                           "source": "\t\tinput, err = ReadFromConsole()",
                           "relevantPart": "input",
                           "calls": {
                              "location": "secret.com/project/util/consoleHelpers.go",
                              "line": 40,
                              "column": 14,
                              "source": "\t\t\t\tresult = input",
                              "relevantPart": "input",
                              "calls": {
                                 "location": "secret.com/project/util/consoleHelpers.go",
                                 "line": 40,
                                 "column": 5,
                                 "source": "\t\t\t\tresult = input",
                                 "relevantPart": "result",
                                 "calls": {
                                    "location": "secret.com/project/util/consoleHelpers.go",
                                    "line": 34,
                                    "column": 6,
                                    "source": "\tfor result == \"\" {",
                                    "relevantPart": "result",
                                    "calls": {
                                       "location": "secret.com/project/util/consoleHelpers.go",
                                       "line": 34,
                                       "column": 13,
                                       "source": "\tfor result == \"\" {",
                                       "relevantPart": "=="
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            },
            "type": "codeScan",
            "cweId": 400
         },
         {
            "id": 22,
            "name": "Denial Of Service Resource Exhaustion",
            "severity": "MEDIUM",
            "code": {
               "location": "secret.com/project/util/consoleHelpers.go",
               "line": 52,
               "column": 22,
               "source": "\tresult, err = reader.ReadString('\\n')",
               "relevantPart": "ReadString",
               "calls": {
                  "location": "secret.com/project/util/consoleHelpers.go",
                  "line": 52,
                  "column": 2,
                  "source": "\tresult, err = reader.ReadString('\\n')",
                  "relevantPart": "result",
                  "calls": {
                     "location": "secret.com/project/util/consoleHelpers.go",
                     "line": 53,
                     "column": 28,
                     "source": "\treturn strings.TrimSuffix(result, \"\\n\"), err",
                     "relevantPart": "result",
                     "calls": {
                        "location": "secret.com/project/util/consoleHelpers.go",
                        "line": 53,
                        "column": 16,
                        "source": "\treturn strings.TrimSuffix(result, \"\\n\"), err",
                        "relevantPart": "TrimSuffix",
                        "calls": {
                           "location": "secret.com/project/util/consoleHelpers.go",
                           "line": 36,
                           "column": 16,
                           "source": "\t\tinput, err = ReadFromConsole()",
                           "relevantPart": "ReadFromConsole",
                           "calls": {
                              "location": "secret.com/project/util/consoleHelpers.go",
                              "line": 36,
                              "column": 3,
                              "source": "\t\tinput, err = ReadFromConsole()",
                              "relevantPart": "input",
                              "calls": {
                                 "location": "secret.com/project/util/consoleHelpers.go",
                                 "line": 40,
                                 "column": 14,
                                 "source": "\t\t\t\tresult = input",
                                 "relevantPart": "input",
                                 "calls": {
                                    "location": "secret.com/project/util/consoleHelpers.go",
                                    "line": 40,
                                    "column": 5,
                                    "source": "\t\t\t\tresult = input",
                                    "relevantPart": "result",
                                    "calls": {
                                       "location": "secret.com/project/util/consoleHelpers.go",
                                       "line": 34,
                                       "column": 6,
                                       "source": "\tfor result == \"\" {",
                                       "relevantPart": "result",
                                       "calls": {
                                          "location": "secret.com/project/util/consoleHelpers.go",
                                          "line": 34,
                                          "column": 13,
                                          "source": "\tfor result == \"\" {",
                                          "relevantPart": "=="
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            },
            "type": "codeScan",
            "cweId": 400
         },
         {
    {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
		 {
   "jobUUID": "061234c8-40aa-4dcf-81f8-7bb8f723b780",
   "result": {
      "count": 0,
      "findings": [
         {
            "id": 3,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectAdministrationRestController.java",
               "line": 82,
               "column": 65,
               "source": "\tpublic void createProject(@RequestBody @Valid ProjectJsonInput input) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
         {
            "id": 4,
            "name": "Unsafe Object Binding",
            "severity": "MEDIUM",
            "code": {
               "location": "com/rakesh/project/domain/administration/project/ProjectUpdateAdministrationRestController.java",
               "line": 55,
               "column": 78,
               "source": "\tpublic void updateProjectWhitelist(@Validated @RequestBody ProjectJsonInput input, @PathVariable(name=\"projectId\") String projectId) {",
               "relevantPart": "input",
               "calls": {
                  "location": "com/rakesh/project/domain/administration/project/ProjectJsonInput.java",
                  "line": 36,
                  "column": 37,
                  "source": "\tprivate Optional<ProjectWhiteList> whiteList = Optional.empty();",
                  "relevantPart": "whiteList"
               }
            },
            "type": "codeScan",
            "cweId": 915
         },
