/*
Copyright 2007-2011 WebDriver committers
Copyright 2007-2011 Google Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */


package org.openqa.selenium;

/**
 * Indicates that activating an IME engine has failed.
 */
public class ImeActivationFailedException extends WebDriverException {

  private static final long serialVersionUID = -4871965510497524740L;

  public ImeActivationFailedException(String message) {
    super(message);
  }

  public ImeActivationFailedException(String message, Throwable cause) {
    super(message, cause);
  }
}
