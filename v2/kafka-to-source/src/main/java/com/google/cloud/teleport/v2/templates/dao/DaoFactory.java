/*
 * Copyright (C) 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.cloud.teleport.v2.templates.dao;

public class DaoFactory {
  private String sqlUrl = "";
  private String sqlUser = "";
  private String sqlPasswd = "";

  private MySqlDao mySqlDao;

  public DaoFactory(String sqlUrl, String sqlUser, String sqlPasswd) {
    this.sqlUrl = sqlUrl;
    this.sqlUser = sqlUser;
    this.sqlPasswd = sqlPasswd;
  }

  public MySqlDao getMySqlDao() {
    if (this.mySqlDao != null) {
      return this.mySqlDao;
    }
    this.mySqlDao = new MySqlDao(this.sqlUrl, this.sqlUser, this.sqlPasswd);
    return this.mySqlDao;
  }
}
