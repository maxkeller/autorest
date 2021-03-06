/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;


/**
 * The Dog model.
 */
public class Dog extends Pet {
    /**
     * The food property.
     */
    private String food;

    /**
     * Get the food value.
     *
     * @return the food value
     */
    public String getFood() {
        return this.food;
    }

    /**
     * Set the food value.
     *
     * @param food the food value to set
     */
    public void setFood(String food) {
        this.food = food;
    }

}
