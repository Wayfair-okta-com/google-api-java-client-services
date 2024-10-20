/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.merchantapi.accounts_v1beta.model;

/**
 * Transit time range (min-max) in business days.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Merchant API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransitTimeValue extends com.google.api.client.json.GenericJson {

  /**
   * Must be greater than or equal to `min_transit_days`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxTransitDays;

  /**
   * Minimum transit time range in business days. 0 means same day delivery, 1 means next day
   * delivery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minTransitDays;

  /**
   * Must be greater than or equal to `min_transit_days`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxTransitDays() {
    return maxTransitDays;
  }

  /**
   * Must be greater than or equal to `min_transit_days`.
   * @param maxTransitDays maxTransitDays or {@code null} for none
   */
  public TransitTimeValue setMaxTransitDays(java.lang.Integer maxTransitDays) {
    this.maxTransitDays = maxTransitDays;
    return this;
  }

  /**
   * Minimum transit time range in business days. 0 means same day delivery, 1 means next day
   * delivery.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinTransitDays() {
    return minTransitDays;
  }

  /**
   * Minimum transit time range in business days. 0 means same day delivery, 1 means next day
   * delivery.
   * @param minTransitDays minTransitDays or {@code null} for none
   */
  public TransitTimeValue setMinTransitDays(java.lang.Integer minTransitDays) {
    this.minTransitDays = minTransitDays;
    return this;
  }

  @Override
  public TransitTimeValue set(String fieldName, Object value) {
    return (TransitTimeValue) super.set(fieldName, value);
  }

  @Override
  public TransitTimeValue clone() {
    return (TransitTimeValue) super.clone();
  }

}
