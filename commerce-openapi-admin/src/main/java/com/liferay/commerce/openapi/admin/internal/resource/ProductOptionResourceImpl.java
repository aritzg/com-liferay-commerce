/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.commerce.openapi.admin.internal.resource;

import com.liferay.commerce.openapi.admin.model.CollectionDTO;
import com.liferay.commerce.openapi.admin.model.ProductOptionDTO;
import com.liferay.commerce.openapi.admin.model.ProductOptionValueDTO;
import com.liferay.commerce.openapi.admin.resource.ProductOptionResource;
import com.liferay.commerce.openapi.core.context.Pagination;

import java.util.Collections;
import java.util.Locale;

import javax.annotation.Generated;

import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * @author Igor Beslic
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_SELECT + "=(osgi.jaxrs.name=CommerceOpenApiAdmin.Rest)",
		JaxrsWhiteboardConstants.JAX_RS_RESOURCE + "=true", "api.version=1.0"
	},
	scope = ServiceScope.PROTOTYPE, service = ProductOptionResource.class
)
@Generated(value = "OSGiRESTModuleGenerator")
public class ProductOptionResourceImpl implements ProductOptionResource {

	@Override
	public Response deleteProductOption(String id, long groupId, Locale locale)
		throws Exception {

		Response.ResponseBuilder responseBuilder = Response.noContent();

		return responseBuilder.build();
	}

	@Override
	public ProductOptionDTO getProductOption(
			String id, long groupId, Locale locale)
		throws Exception {

		return new ProductOptionDTO();
	}

	@Override
	public CollectionDTO<ProductOptionDTO> getProductOptions(
			long groupId, Locale locale, Pagination pagination)
		throws Exception {

		return new CollectionDTO(Collections.emptyList(), 0);
	}

	@Override
	public CollectionDTO<ProductOptionValueDTO> getProductOptionValues(
			String id, long groupId, Locale locale, Pagination pagination)
		throws Exception {

		return new CollectionDTO(Collections.emptyList(), 0);
	}

	@Override
	public Response updateProductOption(
			String id, long groupId, ProductOptionDTO productOptionDTO,
			Locale locale)
		throws Exception {

		Response.ResponseBuilder responseBuilder = Response.accepted();

		return responseBuilder.build();
	}

	@Override
	public ProductOptionDTO upsertProductOption(
			long groupId, ProductOptionDTO productOptionDTO, Locale locale)
		throws Exception {

		return new ProductOptionDTO();
	}

	@Override
	public ProductOptionValueDTO upsertProductOptionValue(
			String id, long groupId,
			ProductOptionValueDTO productOptionValueDTO, Locale locale)
		throws Exception {

		return new ProductOptionValueDTO();
	}

}