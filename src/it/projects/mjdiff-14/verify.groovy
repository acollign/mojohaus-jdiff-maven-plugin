/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
assert new File( basedir, 'target/site/testapidocs/changes' ).isDirectory()
assert new File( basedir, 'target/site/testapidocs/changes.html' ).exists()
assert new File( basedir, 'target/site/testapidocs/black.gif' ).exists()
assert new File( basedir, 'target/jdiff/1.0-test.xml' ).exists()
assert new File( basedir, 'target/jdiff/1.1-SNAPSHOT-test.xml' ).exists()
