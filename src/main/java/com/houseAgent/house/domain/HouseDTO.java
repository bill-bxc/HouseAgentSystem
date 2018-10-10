package com.houseAgent.house.domain;
import org.springframework.beans.BeanUtils;

import com.houseAgent.staff.domain.Staff;
import com.houseAgent.store.domain.Store;

public class HouseDTO {
	private Long id;
	private String region;//地区
	private Double price;//价格
	private Double area;//面积
	private String type;//房型
	private String buildDate;//建造时间
	private int room;//室
	private int hall;//厅
	private String orientation;//朝向
	private int floor;//楼层
	private String decorateLevel;//装修等级
	private String title;//标题
	private String address;//详细地址
	private String img1;
	private String img0;
	private String img2;
	private String img3;
	private String img4;
	private String video;
	private Double longitude;//经度
	private Double latitude;//纬度
	private String isElevator;//是否有电梯
	private String isParking;//是否有停车位
	private String introduce;//详细介绍，核心卖点
	private Double agencyFees;//中介费
	private int state;//状态
	private int propertyRights;//产权年限
	private Staff staff;//员工
	private Store store;//门店 
	
	private Long staffId;
	private String staffName;
	private String faceImg;
	private String phoneNumber;//手机号码
	
	private Long storeId;
	private String storeName;//店名
	
	public static void entityToDto(House house , HouseDTO dto) {
		BeanUtils.copyProperties(house, dto);
		String[] imgs = house.getImages().split("/");
		dto.img0 = imgs[0];
		dto.img1 = imgs[1];
		dto.img2 = imgs[2];
		dto.img3 = imgs[3];
		dto.img4 = imgs[4];
		if(house.getIsElevator()==1) {
			dto.setIsElevator("是");
		}else dto.setIsElevator("否");
		if(house.getIsParking()==1) {
			dto.setIsParking("是");
		}else dto.setIsParking("否");
	}
		
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBuildDate() {
		return buildDate;
	}
	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getHall() {
		return hall;
	}
	public void setHall(int hall) {
		this.hall = hall;
	}
	public String getOrientation() {
		return orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getDecorateLevel() {
		return decorateLevel;
	}
	public void setDecorateLevel(String decorateLevel) {
		this.decorateLevel = decorateLevel;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	
	public String getImg0() {
		return img0;
	}



	public void setImg0(String img0) {
		this.img0 = img0;
	}



	public String getImg2() {
		return img2;
	}



	public void setImg2(String img2) {
		this.img2 = img2;
	}



	public String getImg3() {
		return img3;
	}



	public void setImg3(String img3) {
		this.img3 = img3;
	}



	public String getImg4() {
		return img4;
	}



	public void setImg4(String img4) {
		this.img4 = img4;
	}



	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public String getIsElevator() {
		return isElevator;
	}
	public void setIsElevator(String isElevator) {
		this.isElevator = isElevator;
	}
	public String getIsParking() {
		return isParking;
	}
	public void setIsParking(String isParking) {
		this.isParking = isParking;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public Double getAgencyFees() {
		return agencyFees;
	}
	public void setAgencyFees(Double agencyFees) {
		this.agencyFees = agencyFees;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getPropertyRights() {
		return propertyRights;
	}
	public void setPropertyRights(int propertyRights) {
		this.propertyRights = propertyRights;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Long getStaffId() {
		return staffId;
	}
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getFaceImg() {
		return faceImg;
	}
	public void setFaceImg(String faceImg) {
		this.faceImg = faceImg;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	
}