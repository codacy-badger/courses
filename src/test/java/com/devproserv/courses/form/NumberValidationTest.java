/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Vladimir
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.devproserv.courses.form;

import com.devproserv.courses.validation.VldResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Contains tests to check functionality of {@link NumberValidation} class.
 *
 * @since 1.0.0
 */
class NumberValidationTest {
    /**
     * Test.
     */
    @Test
    void testValidatedOk() {
        final Validation validation = new NumberValidation("32");
        final VldResult result = validation.validate();
        Assertions.assertAll(
            () -> Assertions.assertTrue(result.valid()),
            () -> Assertions.assertFalse(result.reason().isPresent())
        );
    }

    /**
     * Test.
     */
    @Test
    void testValidatedNull() {
        final Validation validation = new NumberValidation(null);
        final VldResult result = validation.validate();
        Assertions.assertAll(
            () -> Assertions.assertFalse(result.valid()),
            () -> Assertions.assertEquals(
                "Field should not be null!",
                result.reason().orElse("")
            )
        );
    }

    /**
     * Test.
     */
    @Test
    void testValidatedEmpty() {
        final Validation validation = new NumberValidation("");
        final VldResult result = validation.validate();
        Assertions.assertAll(
            () -> Assertions.assertFalse(result.valid()),
            () -> Assertions.assertEquals(
                "Field should not be empty!",
                result.reason().orElse("")
            )
        );
    }

    /**
     * Test.
     */
    @Test
    void testValidatedNotNumber() {
        final Validation validation = new NumberValidation("3dh2");
        final VldResult result = validation.validate();
        Assertions.assertAll(
            () -> Assertions.assertFalse(result.valid()),
            () -> Assertions.assertEquals(
                "Field should contain only digits",
                result.reason().orElse("")
            )
        );
    }
}
