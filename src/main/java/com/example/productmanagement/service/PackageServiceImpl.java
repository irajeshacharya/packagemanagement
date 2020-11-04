package com.example.productmanagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.example.productmanagement.document.PackagePOJO;
import com.example.productmanagement.exceptionhandler.PackageInternalServerError;
import com.example.productmanagement.exceptionhandler.ProductNotFoundException;
import com.example.productmanagement.exceptionhandler.ProductPayloadError;
import com.example.productmanagement.request.PackageRequest;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 4, 2020
 *
 */
@Service
public class PackageServiceImpl implements PackageService {

	ConcurrentHashMap<Integer, PackagePOJO> map = new ConcurrentHashMap<>();

	@Override
	public PackagePOJO createPackage(PackageRequest request) {
		payloadValidation(request);
		PackagePOJO packagePojo = null;
		try {
			packagePojo = new PackagePOJO(request.getName(), request.getDescription(), request.getProducts(),
					request.getPrice(), request.getBase());
			map.put(packagePojo.getId(), packagePojo);
		} catch (Exception e) {
			throw new PackageInternalServerError("Internal Server Error");
		}
		return packagePojo;
	}

	@Override
	public PackagePOJO getPackage(Integer id) {
		isPackageIdExist(id);
		return map.get(id);
	}

	@Override
	public List<PackagePOJO> getAllPackage() {
		return new ArrayList<>(map.values());
	}

	@Override
	public PackagePOJO updatePackage(Integer id, PackageRequest request) {
		isPackageIdExist(id);
		payloadValidation(request);
		PackagePOJO packagePOJO = map.get(id);
		if (!packagePOJO.getName().equalsIgnoreCase(request.getName())) {
			packagePOJO.setName(request.getName());
		}

		if (!packagePOJO.getDescription().equalsIgnoreCase(request.getDescription())) {
			packagePOJO.setDescription(request.getDescription());
		}

		packagePOJO.setProducts(request.getProducts());
		packagePOJO.setPrice(request.getPrice());
		packagePOJO.setBase(request.getBase());

		return map.put(id, packagePOJO);
	}

	@Override
	public PackagePOJO deletePackage(Integer id) {
		isPackageIdExist(id);
		return map.remove(id);
	}

	private void payloadValidation(PackageRequest request) {
		if (request == null || StringUtils.isEmpty(request.getName())
				|| CollectionUtils.isEmpty(request.getProducts())) {
			throw new ProductPayloadError("Invalid Payload");
		}
	}

	private void isPackageIdExist(Integer id) {
		if (!map.containsKey(id)) {
			throw new ProductNotFoundException("ID : " + id);
		}
	}

}
