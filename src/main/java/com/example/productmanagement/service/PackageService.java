package com.example.productmanagement.service;

import java.util.List;

import com.example.productmanagement.document.PackagePOJO;
import com.example.productmanagement.request.PackageRequest;

/**
 * @author rajeshacharya
 *
 *         Modified Date : Nov 4, 2020
 *
 */
public interface PackageService {

	PackagePOJO createPackage(PackageRequest request);

	PackagePOJO getPackage(Integer id);

	List<PackagePOJO> getAllPackage();

	PackagePOJO updatePackage(Integer id, PackageRequest request);

	PackagePOJO deletePackage(Integer id);

}
