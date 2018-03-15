/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateNatGatewayRequest extends RpcAcsRequest<CreateNatGatewayResponse> {
	
	public CreateNatGatewayRequest() {
		super("Vpc", "2016-04-28", "CreateNatGateway", "vpc");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String clientToken;

	private String ownerAccount;

	private String vpcId;

	private String name;

	private String description;

	private Long ownerId;

	private List<BandwidthPackage> bandwidthPackages;

	private String spec;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<BandwidthPackage> getBandwidthPackages() {
		return this.bandwidthPackages;
	}

	public void setBandwidthPackages(List<BandwidthPackage> bandwidthPackages) {
		this.bandwidthPackages = bandwidthPackages;	
		if (bandwidthPackages != null) {
			for (int depth1 = 0; depth1 < bandwidthPackages.size(); depth1++) {
				putQueryParameter("BandwidthPackage." + (depth1 + 1) + ".IpCount" , bandwidthPackages.get(depth1).getIpCount());
				putQueryParameter("BandwidthPackage." + (depth1 + 1) + ".Bandwidth" , bandwidthPackages.get(depth1).getBandwidth());
				putQueryParameter("BandwidthPackage." + (depth1 + 1) + ".Zone" , bandwidthPackages.get(depth1).getZone());
				putQueryParameter("BandwidthPackage." + (depth1 + 1) + ".ISP" , bandwidthPackages.get(depth1).getISP());
				putQueryParameter("BandwidthPackage." + (depth1 + 1) + ".InternetChargeType" , bandwidthPackages.get(depth1).getInternetChargeType());
			}
		}	
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		if(spec != null){
			putQueryParameter("Spec", spec);
		}
	}

	public static class BandwidthPackage {

		private Integer ipCount;

		private Integer bandwidth;

		private String zone;

		private String iSP;

		private String internetChargeType;

		public Integer getIpCount() {
			return this.ipCount;
		}

		public void setIpCount(Integer ipCount) {
			this.ipCount = ipCount;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}
	}

	@Override
	public Class<CreateNatGatewayResponse> getResponseClass() {
		return CreateNatGatewayResponse.class;
	}

}
