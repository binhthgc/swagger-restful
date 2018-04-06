package io.swagger.model;

import io.swagger.model.Pet;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement public class PetArray  {
  
  @ApiModelProperty(example = "null", value = "")
  private Long total = null;
  @ApiModelProperty(example = "null", value = "")
  private List<Pet> data = new ArrayList<Pet>();

 /**
   * Get total
   * @return total
  **/
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public PetArray total(Long total) {
    this.total = total;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  public List<Pet> getData() {
    return data;
  }

  public void setData(List<Pet> data) {
    this.data = data;
  }

  public PetArray data(List<Pet> data) {
    this.data = data;
    return this;
  }

  public PetArray addDataItem(Pet dataItem) {
    this.data.add(dataItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PetArray {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

