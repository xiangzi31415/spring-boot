/*
 * Copyrght 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *uage governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.web.embedded.undertow;

import io.undertow.Undertow.Builder;

/**
 * Callback interface that can be used to customize an Undertow {@link Builder}.
 *
 
 */
@FunctionalInterface
public interface UndertowBuilderCustomizer {

	/**
	 * Customize the builder.
	 * @param builder the {@code Builder} to customize
	 */
	void customize(Builder builder);

}
