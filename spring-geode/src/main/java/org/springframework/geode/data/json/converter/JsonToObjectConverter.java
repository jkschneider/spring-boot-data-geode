/*
 * Copyright 2017-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.springframework.geode.data.json.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;

/**
 * Spring {@link Converter} interface extension defining a contract to convert
 * from {@link String JSON} to an {@link Object} (POJO).
 *
 * @author John Blum
 * @see java.lang.Object
 * @see java.lang.String
 * @see org.springframework.core.convert.converter.Converter
 * @since 1.3.0
 */
public interface JsonToObjectConverter extends Converter<String, Object> {

	/**
	 * Converts the array of {@link Byte#TYPE bytes} containing JSON into an {@link Object} (POJO).
	 *
	 * @param json array of {@link Byte#TYPE bytes} containing JSON to convert into an {@link Object} (POJO);
	 * must not be {@literal null}.
	 * @return an {@link Object} (POJO) converted from the array of {@link Byte#TYPE bytes} containing JSON.
	 * @see #convert(Object)
	 */
	default @NonNull Object convert(@NonNull byte[] json) {
		return convert(new String(json));
	}
}
