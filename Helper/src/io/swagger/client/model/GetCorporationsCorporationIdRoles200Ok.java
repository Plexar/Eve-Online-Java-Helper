package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T18:43:46.078Z")
public class GetCorporationsCorporationIdRoles200Ok {
  @SerializedName("character_id")
  private Integer characterId = null;

  /**
   * grantable_role string
   */
  public enum GrantableRolesEnum {
    @SerializedName("Director")
    DIRECTOR("Director"),
    
    @SerializedName("Personnel_Manager")
    PERSONNEL_MANAGER("Personnel_Manager"),
    
    @SerializedName("Accountant")
    ACCOUNTANT("Accountant"),
    
    @SerializedName("Security_Officer")
    SECURITY_OFFICER("Security_Officer"),
    
    @SerializedName("Factory_Manager")
    FACTORY_MANAGER("Factory_Manager"),
    
    @SerializedName("Station_Manager")
    STATION_MANAGER("Station_Manager"),
    
    @SerializedName("Auditor")
    AUDITOR("Auditor"),
    
    @SerializedName("Hangar_Take_1")
    HANGAR_TAKE_1("Hangar_Take_1"),
    
    @SerializedName("Hangar_Take_2")
    HANGAR_TAKE_2("Hangar_Take_2"),
    
    @SerializedName("Hangar_Take_3")
    HANGAR_TAKE_3("Hangar_Take_3"),
    
    @SerializedName("Hangar_Take_4")
    HANGAR_TAKE_4("Hangar_Take_4"),
    
    @SerializedName("Hangar_Take_5")
    HANGAR_TAKE_5("Hangar_Take_5"),
    
    @SerializedName("Hangar_Take_6")
    HANGAR_TAKE_6("Hangar_Take_6"),
    
    @SerializedName("Hangar_Take_7")
    HANGAR_TAKE_7("Hangar_Take_7"),
    
    @SerializedName("Hangar_Query_1")
    HANGAR_QUERY_1("Hangar_Query_1"),
    
    @SerializedName("Hangar_Query_2")
    HANGAR_QUERY_2("Hangar_Query_2"),
    
    @SerializedName("Hangar_Query_3")
    HANGAR_QUERY_3("Hangar_Query_3"),
    
    @SerializedName("Hangar_Query_4")
    HANGAR_QUERY_4("Hangar_Query_4"),
    
    @SerializedName("Hangar_Query_5")
    HANGAR_QUERY_5("Hangar_Query_5"),
    
    @SerializedName("Hangar_Query_6")
    HANGAR_QUERY_6("Hangar_Query_6"),
    
    @SerializedName("Hangar_Query_7")
    HANGAR_QUERY_7("Hangar_Query_7"),
    
    @SerializedName("Account_Take_1")
    ACCOUNT_TAKE_1("Account_Take_1"),
    
    @SerializedName("Account_Take_2")
    ACCOUNT_TAKE_2("Account_Take_2"),
    
    @SerializedName("Account_Take_3")
    ACCOUNT_TAKE_3("Account_Take_3"),
    
    @SerializedName("Account_Take_4")
    ACCOUNT_TAKE_4("Account_Take_4"),
    
    @SerializedName("Account_Take_5")
    ACCOUNT_TAKE_5("Account_Take_5"),
    
    @SerializedName("Account_Take_6")
    ACCOUNT_TAKE_6("Account_Take_6"),
    
    @SerializedName("Account_Take_7")
    ACCOUNT_TAKE_7("Account_Take_7"),
    
    @SerializedName("Diplomat")
    DIPLOMAT("Diplomat"),
    
    @SerializedName("Config_Equipment")
    CONFIG_EQUIPMENT("Config_Equipment"),
    
    @SerializedName("Container_Take_1")
    CONTAINER_TAKE_1("Container_Take_1"),
    
    @SerializedName("Container_Take_2")
    CONTAINER_TAKE_2("Container_Take_2"),
    
    @SerializedName("Container_Take_3")
    CONTAINER_TAKE_3("Container_Take_3"),
    
    @SerializedName("Container_Take_4")
    CONTAINER_TAKE_4("Container_Take_4"),
    
    @SerializedName("Container_Take_5")
    CONTAINER_TAKE_5("Container_Take_5"),
    
    @SerializedName("Container_Take_6")
    CONTAINER_TAKE_6("Container_Take_6"),
    
    @SerializedName("Container_Take_7")
    CONTAINER_TAKE_7("Container_Take_7"),
    
    @SerializedName("Rent_Office")
    RENT_OFFICE("Rent_Office"),
    
    @SerializedName("Rent_Factory_Facility")
    RENT_FACTORY_FACILITY("Rent_Factory_Facility"),
    
    @SerializedName("Rent_Research_Facility")
    RENT_RESEARCH_FACILITY("Rent_Research_Facility"),
    
    @SerializedName("Junior_Accountant")
    JUNIOR_ACCOUNTANT("Junior_Accountant"),
    
    @SerializedName("Config_Starbase_Equipment")
    CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),
    
    @SerializedName("Trader")
    TRADER("Trader"),
    
    @SerializedName("Communications_Officer")
    COMMUNICATIONS_OFFICER("Communications_Officer"),
    
    @SerializedName("Contract_Manager")
    CONTRACT_MANAGER("Contract_Manager"),
    
    @SerializedName("Starbase_Defense_Operator")
    STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),
    
    @SerializedName("Starbase_Fuel_Technician")
    STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),
    
    @SerializedName("Fitting_Manager")
    FITTING_MANAGER("Fitting_Manager"),
    
    @SerializedName("Terrestrial_Combat_Officer")
    TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),
    
    @SerializedName("Terrestrial_Logistics_Officer")
    TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

    private String value;

    GrantableRolesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("grantable_roles")
  private List<GrantableRolesEnum> grantableRoles = new ArrayList<GrantableRolesEnum>();

  /**
   * grantable_roles_at_base string
   */
  public enum GrantableRolesAtBaseEnum {
    @SerializedName("Director")
    DIRECTOR("Director"),
    
    @SerializedName("Personnel_Manager")
    PERSONNEL_MANAGER("Personnel_Manager"),
    
    @SerializedName("Accountant")
    ACCOUNTANT("Accountant"),
    
    @SerializedName("Security_Officer")
    SECURITY_OFFICER("Security_Officer"),
    
    @SerializedName("Factory_Manager")
    FACTORY_MANAGER("Factory_Manager"),
    
    @SerializedName("Station_Manager")
    STATION_MANAGER("Station_Manager"),
    
    @SerializedName("Auditor")
    AUDITOR("Auditor"),
    
    @SerializedName("Hangar_Take_1")
    HANGAR_TAKE_1("Hangar_Take_1"),
    
    @SerializedName("Hangar_Take_2")
    HANGAR_TAKE_2("Hangar_Take_2"),
    
    @SerializedName("Hangar_Take_3")
    HANGAR_TAKE_3("Hangar_Take_3"),
    
    @SerializedName("Hangar_Take_4")
    HANGAR_TAKE_4("Hangar_Take_4"),
    
    @SerializedName("Hangar_Take_5")
    HANGAR_TAKE_5("Hangar_Take_5"),
    
    @SerializedName("Hangar_Take_6")
    HANGAR_TAKE_6("Hangar_Take_6"),
    
    @SerializedName("Hangar_Take_7")
    HANGAR_TAKE_7("Hangar_Take_7"),
    
    @SerializedName("Hangar_Query_1")
    HANGAR_QUERY_1("Hangar_Query_1"),
    
    @SerializedName("Hangar_Query_2")
    HANGAR_QUERY_2("Hangar_Query_2"),
    
    @SerializedName("Hangar_Query_3")
    HANGAR_QUERY_3("Hangar_Query_3"),
    
    @SerializedName("Hangar_Query_4")
    HANGAR_QUERY_4("Hangar_Query_4"),
    
    @SerializedName("Hangar_Query_5")
    HANGAR_QUERY_5("Hangar_Query_5"),
    
    @SerializedName("Hangar_Query_6")
    HANGAR_QUERY_6("Hangar_Query_6"),
    
    @SerializedName("Hangar_Query_7")
    HANGAR_QUERY_7("Hangar_Query_7"),
    
    @SerializedName("Account_Take_1")
    ACCOUNT_TAKE_1("Account_Take_1"),
    
    @SerializedName("Account_Take_2")
    ACCOUNT_TAKE_2("Account_Take_2"),
    
    @SerializedName("Account_Take_3")
    ACCOUNT_TAKE_3("Account_Take_3"),
    
    @SerializedName("Account_Take_4")
    ACCOUNT_TAKE_4("Account_Take_4"),
    
    @SerializedName("Account_Take_5")
    ACCOUNT_TAKE_5("Account_Take_5"),
    
    @SerializedName("Account_Take_6")
    ACCOUNT_TAKE_6("Account_Take_6"),
    
    @SerializedName("Account_Take_7")
    ACCOUNT_TAKE_7("Account_Take_7"),
    
    @SerializedName("Diplomat")
    DIPLOMAT("Diplomat"),
    
    @SerializedName("Config_Equipment")
    CONFIG_EQUIPMENT("Config_Equipment"),
    
    @SerializedName("Container_Take_1")
    CONTAINER_TAKE_1("Container_Take_1"),
    
    @SerializedName("Container_Take_2")
    CONTAINER_TAKE_2("Container_Take_2"),
    
    @SerializedName("Container_Take_3")
    CONTAINER_TAKE_3("Container_Take_3"),
    
    @SerializedName("Container_Take_4")
    CONTAINER_TAKE_4("Container_Take_4"),
    
    @SerializedName("Container_Take_5")
    CONTAINER_TAKE_5("Container_Take_5"),
    
    @SerializedName("Container_Take_6")
    CONTAINER_TAKE_6("Container_Take_6"),
    
    @SerializedName("Container_Take_7")
    CONTAINER_TAKE_7("Container_Take_7"),
    
    @SerializedName("Rent_Office")
    RENT_OFFICE("Rent_Office"),
    
    @SerializedName("Rent_Factory_Facility")
    RENT_FACTORY_FACILITY("Rent_Factory_Facility"),
    
    @SerializedName("Rent_Research_Facility")
    RENT_RESEARCH_FACILITY("Rent_Research_Facility"),
    
    @SerializedName("Junior_Accountant")
    JUNIOR_ACCOUNTANT("Junior_Accountant"),
    
    @SerializedName("Config_Starbase_Equipment")
    CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),
    
    @SerializedName("Trader")
    TRADER("Trader"),
    
    @SerializedName("Communications_Officer")
    COMMUNICATIONS_OFFICER("Communications_Officer"),
    
    @SerializedName("Contract_Manager")
    CONTRACT_MANAGER("Contract_Manager"),
    
    @SerializedName("Starbase_Defense_Operator")
    STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),
    
    @SerializedName("Starbase_Fuel_Technician")
    STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),
    
    @SerializedName("Fitting_Manager")
    FITTING_MANAGER("Fitting_Manager"),
    
    @SerializedName("Terrestrial_Combat_Officer")
    TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),
    
    @SerializedName("Terrestrial_Logistics_Officer")
    TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

    private String value;

    GrantableRolesAtBaseEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("grantable_roles_at_base")
  private List<GrantableRolesAtBaseEnum> grantableRolesAtBase = new ArrayList<GrantableRolesAtBaseEnum>();

  /**
   * grantable_roles_at_hq string
   */
  public enum GrantableRolesAtHqEnum {
    @SerializedName("Director")
    DIRECTOR("Director"),
    
    @SerializedName("Personnel_Manager")
    PERSONNEL_MANAGER("Personnel_Manager"),
    
    @SerializedName("Accountant")
    ACCOUNTANT("Accountant"),
    
    @SerializedName("Security_Officer")
    SECURITY_OFFICER("Security_Officer"),
    
    @SerializedName("Factory_Manager")
    FACTORY_MANAGER("Factory_Manager"),
    
    @SerializedName("Station_Manager")
    STATION_MANAGER("Station_Manager"),
    
    @SerializedName("Auditor")
    AUDITOR("Auditor"),
    
    @SerializedName("Hangar_Take_1")
    HANGAR_TAKE_1("Hangar_Take_1"),
    
    @SerializedName("Hangar_Take_2")
    HANGAR_TAKE_2("Hangar_Take_2"),
    
    @SerializedName("Hangar_Take_3")
    HANGAR_TAKE_3("Hangar_Take_3"),
    
    @SerializedName("Hangar_Take_4")
    HANGAR_TAKE_4("Hangar_Take_4"),
    
    @SerializedName("Hangar_Take_5")
    HANGAR_TAKE_5("Hangar_Take_5"),
    
    @SerializedName("Hangar_Take_6")
    HANGAR_TAKE_6("Hangar_Take_6"),
    
    @SerializedName("Hangar_Take_7")
    HANGAR_TAKE_7("Hangar_Take_7"),
    
    @SerializedName("Hangar_Query_1")
    HANGAR_QUERY_1("Hangar_Query_1"),
    
    @SerializedName("Hangar_Query_2")
    HANGAR_QUERY_2("Hangar_Query_2"),
    
    @SerializedName("Hangar_Query_3")
    HANGAR_QUERY_3("Hangar_Query_3"),
    
    @SerializedName("Hangar_Query_4")
    HANGAR_QUERY_4("Hangar_Query_4"),
    
    @SerializedName("Hangar_Query_5")
    HANGAR_QUERY_5("Hangar_Query_5"),
    
    @SerializedName("Hangar_Query_6")
    HANGAR_QUERY_6("Hangar_Query_6"),
    
    @SerializedName("Hangar_Query_7")
    HANGAR_QUERY_7("Hangar_Query_7"),
    
    @SerializedName("Account_Take_1")
    ACCOUNT_TAKE_1("Account_Take_1"),
    
    @SerializedName("Account_Take_2")
    ACCOUNT_TAKE_2("Account_Take_2"),
    
    @SerializedName("Account_Take_3")
    ACCOUNT_TAKE_3("Account_Take_3"),
    
    @SerializedName("Account_Take_4")
    ACCOUNT_TAKE_4("Account_Take_4"),
    
    @SerializedName("Account_Take_5")
    ACCOUNT_TAKE_5("Account_Take_5"),
    
    @SerializedName("Account_Take_6")
    ACCOUNT_TAKE_6("Account_Take_6"),
    
    @SerializedName("Account_Take_7")
    ACCOUNT_TAKE_7("Account_Take_7"),
    
    @SerializedName("Diplomat")
    DIPLOMAT("Diplomat"),
    
    @SerializedName("Config_Equipment")
    CONFIG_EQUIPMENT("Config_Equipment"),
    
    @SerializedName("Container_Take_1")
    CONTAINER_TAKE_1("Container_Take_1"),
    
    @SerializedName("Container_Take_2")
    CONTAINER_TAKE_2("Container_Take_2"),
    
    @SerializedName("Container_Take_3")
    CONTAINER_TAKE_3("Container_Take_3"),
    
    @SerializedName("Container_Take_4")
    CONTAINER_TAKE_4("Container_Take_4"),
    
    @SerializedName("Container_Take_5")
    CONTAINER_TAKE_5("Container_Take_5"),
    
    @SerializedName("Container_Take_6")
    CONTAINER_TAKE_6("Container_Take_6"),
    
    @SerializedName("Container_Take_7")
    CONTAINER_TAKE_7("Container_Take_7"),
    
    @SerializedName("Rent_Office")
    RENT_OFFICE("Rent_Office"),
    
    @SerializedName("Rent_Factory_Facility")
    RENT_FACTORY_FACILITY("Rent_Factory_Facility"),
    
    @SerializedName("Rent_Research_Facility")
    RENT_RESEARCH_FACILITY("Rent_Research_Facility"),
    
    @SerializedName("Junior_Accountant")
    JUNIOR_ACCOUNTANT("Junior_Accountant"),
    
    @SerializedName("Config_Starbase_Equipment")
    CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),
    
    @SerializedName("Trader")
    TRADER("Trader"),
    
    @SerializedName("Communications_Officer")
    COMMUNICATIONS_OFFICER("Communications_Officer"),
    
    @SerializedName("Contract_Manager")
    CONTRACT_MANAGER("Contract_Manager"),
    
    @SerializedName("Starbase_Defense_Operator")
    STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),
    
    @SerializedName("Starbase_Fuel_Technician")
    STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),
    
    @SerializedName("Fitting_Manager")
    FITTING_MANAGER("Fitting_Manager"),
    
    @SerializedName("Terrestrial_Combat_Officer")
    TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),
    
    @SerializedName("Terrestrial_Logistics_Officer")
    TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

    private String value;

    GrantableRolesAtHqEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("grantable_roles_at_hq")
  private List<GrantableRolesAtHqEnum> grantableRolesAtHq = new ArrayList<GrantableRolesAtHqEnum>();

  /**
   * grantable_roles_at_other string
   */
  public enum GrantableRolesAtOtherEnum {
    @SerializedName("Director")
    DIRECTOR("Director"),
    
    @SerializedName("Personnel_Manager")
    PERSONNEL_MANAGER("Personnel_Manager"),
    
    @SerializedName("Accountant")
    ACCOUNTANT("Accountant"),
    
    @SerializedName("Security_Officer")
    SECURITY_OFFICER("Security_Officer"),
    
    @SerializedName("Factory_Manager")
    FACTORY_MANAGER("Factory_Manager"),
    
    @SerializedName("Station_Manager")
    STATION_MANAGER("Station_Manager"),
    
    @SerializedName("Auditor")
    AUDITOR("Auditor"),
    
    @SerializedName("Hangar_Take_1")
    HANGAR_TAKE_1("Hangar_Take_1"),
    
    @SerializedName("Hangar_Take_2")
    HANGAR_TAKE_2("Hangar_Take_2"),
    
    @SerializedName("Hangar_Take_3")
    HANGAR_TAKE_3("Hangar_Take_3"),
    
    @SerializedName("Hangar_Take_4")
    HANGAR_TAKE_4("Hangar_Take_4"),
    
    @SerializedName("Hangar_Take_5")
    HANGAR_TAKE_5("Hangar_Take_5"),
    
    @SerializedName("Hangar_Take_6")
    HANGAR_TAKE_6("Hangar_Take_6"),
    
    @SerializedName("Hangar_Take_7")
    HANGAR_TAKE_7("Hangar_Take_7"),
    
    @SerializedName("Hangar_Query_1")
    HANGAR_QUERY_1("Hangar_Query_1"),
    
    @SerializedName("Hangar_Query_2")
    HANGAR_QUERY_2("Hangar_Query_2"),
    
    @SerializedName("Hangar_Query_3")
    HANGAR_QUERY_3("Hangar_Query_3"),
    
    @SerializedName("Hangar_Query_4")
    HANGAR_QUERY_4("Hangar_Query_4"),
    
    @SerializedName("Hangar_Query_5")
    HANGAR_QUERY_5("Hangar_Query_5"),
    
    @SerializedName("Hangar_Query_6")
    HANGAR_QUERY_6("Hangar_Query_6"),
    
    @SerializedName("Hangar_Query_7")
    HANGAR_QUERY_7("Hangar_Query_7"),
    
    @SerializedName("Account_Take_1")
    ACCOUNT_TAKE_1("Account_Take_1"),
    
    @SerializedName("Account_Take_2")
    ACCOUNT_TAKE_2("Account_Take_2"),
    
    @SerializedName("Account_Take_3")
    ACCOUNT_TAKE_3("Account_Take_3"),
    
    @SerializedName("Account_Take_4")
    ACCOUNT_TAKE_4("Account_Take_4"),
    
    @SerializedName("Account_Take_5")
    ACCOUNT_TAKE_5("Account_Take_5"),
    
    @SerializedName("Account_Take_6")
    ACCOUNT_TAKE_6("Account_Take_6"),
    
    @SerializedName("Account_Take_7")
    ACCOUNT_TAKE_7("Account_Take_7"),
    
    @SerializedName("Diplomat")
    DIPLOMAT("Diplomat"),
    
    @SerializedName("Config_Equipment")
    CONFIG_EQUIPMENT("Config_Equipment"),
    
    @SerializedName("Container_Take_1")
    CONTAINER_TAKE_1("Container_Take_1"),
    
    @SerializedName("Container_Take_2")
    CONTAINER_TAKE_2("Container_Take_2"),
    
    @SerializedName("Container_Take_3")
    CONTAINER_TAKE_3("Container_Take_3"),
    
    @SerializedName("Container_Take_4")
    CONTAINER_TAKE_4("Container_Take_4"),
    
    @SerializedName("Container_Take_5")
    CONTAINER_TAKE_5("Container_Take_5"),
    
    @SerializedName("Container_Take_6")
    CONTAINER_TAKE_6("Container_Take_6"),
    
    @SerializedName("Container_Take_7")
    CONTAINER_TAKE_7("Container_Take_7"),
    
    @SerializedName("Rent_Office")
    RENT_OFFICE("Rent_Office"),
    
    @SerializedName("Rent_Factory_Facility")
    RENT_FACTORY_FACILITY("Rent_Factory_Facility"),
    
    @SerializedName("Rent_Research_Facility")
    RENT_RESEARCH_FACILITY("Rent_Research_Facility"),
    
    @SerializedName("Junior_Accountant")
    JUNIOR_ACCOUNTANT("Junior_Accountant"),
    
    @SerializedName("Config_Starbase_Equipment")
    CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),
    
    @SerializedName("Trader")
    TRADER("Trader"),
    
    @SerializedName("Communications_Officer")
    COMMUNICATIONS_OFFICER("Communications_Officer"),
    
    @SerializedName("Contract_Manager")
    CONTRACT_MANAGER("Contract_Manager"),
    
    @SerializedName("Starbase_Defense_Operator")
    STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),
    
    @SerializedName("Starbase_Fuel_Technician")
    STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),
    
    @SerializedName("Fitting_Manager")
    FITTING_MANAGER("Fitting_Manager"),
    
    @SerializedName("Terrestrial_Combat_Officer")
    TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),
    
    @SerializedName("Terrestrial_Logistics_Officer")
    TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

    private String value;

    GrantableRolesAtOtherEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("grantable_roles_at_other")
  private List<GrantableRolesAtOtherEnum> grantableRolesAtOther = new ArrayList<GrantableRolesAtOtherEnum>();

  /**
   * role string
   */
  public enum RolesEnum {
    @SerializedName("Director")
    DIRECTOR("Director"),
    
    @SerializedName("Personnel_Manager")
    PERSONNEL_MANAGER("Personnel_Manager"),
    
    @SerializedName("Accountant")
    ACCOUNTANT("Accountant"),
    
    @SerializedName("Security_Officer")
    SECURITY_OFFICER("Security_Officer"),
    
    @SerializedName("Factory_Manager")
    FACTORY_MANAGER("Factory_Manager"),
    
    @SerializedName("Station_Manager")
    STATION_MANAGER("Station_Manager"),
    
    @SerializedName("Auditor")
    AUDITOR("Auditor"),
    
    @SerializedName("Hangar_Take_1")
    HANGAR_TAKE_1("Hangar_Take_1"),
    
    @SerializedName("Hangar_Take_2")
    HANGAR_TAKE_2("Hangar_Take_2"),
    
    @SerializedName("Hangar_Take_3")
    HANGAR_TAKE_3("Hangar_Take_3"),
    
    @SerializedName("Hangar_Take_4")
    HANGAR_TAKE_4("Hangar_Take_4"),
    
    @SerializedName("Hangar_Take_5")
    HANGAR_TAKE_5("Hangar_Take_5"),
    
    @SerializedName("Hangar_Take_6")
    HANGAR_TAKE_6("Hangar_Take_6"),
    
    @SerializedName("Hangar_Take_7")
    HANGAR_TAKE_7("Hangar_Take_7"),
    
    @SerializedName("Hangar_Query_1")
    HANGAR_QUERY_1("Hangar_Query_1"),
    
    @SerializedName("Hangar_Query_2")
    HANGAR_QUERY_2("Hangar_Query_2"),
    
    @SerializedName("Hangar_Query_3")
    HANGAR_QUERY_3("Hangar_Query_3"),
    
    @SerializedName("Hangar_Query_4")
    HANGAR_QUERY_4("Hangar_Query_4"),
    
    @SerializedName("Hangar_Query_5")
    HANGAR_QUERY_5("Hangar_Query_5"),
    
    @SerializedName("Hangar_Query_6")
    HANGAR_QUERY_6("Hangar_Query_6"),
    
    @SerializedName("Hangar_Query_7")
    HANGAR_QUERY_7("Hangar_Query_7"),
    
    @SerializedName("Account_Take_1")
    ACCOUNT_TAKE_1("Account_Take_1"),
    
    @SerializedName("Account_Take_2")
    ACCOUNT_TAKE_2("Account_Take_2"),
    
    @SerializedName("Account_Take_3")
    ACCOUNT_TAKE_3("Account_Take_3"),
    
    @SerializedName("Account_Take_4")
    ACCOUNT_TAKE_4("Account_Take_4"),
    
    @SerializedName("Account_Take_5")
    ACCOUNT_TAKE_5("Account_Take_5"),
    
    @SerializedName("Account_Take_6")
    ACCOUNT_TAKE_6("Account_Take_6"),
    
    @SerializedName("Account_Take_7")
    ACCOUNT_TAKE_7("Account_Take_7"),
    
    @SerializedName("Diplomat")
    DIPLOMAT("Diplomat"),
    
    @SerializedName("Config_Equipment")
    CONFIG_EQUIPMENT("Config_Equipment"),
    
    @SerializedName("Container_Take_1")
    CONTAINER_TAKE_1("Container_Take_1"),
    
    @SerializedName("Container_Take_2")
    CONTAINER_TAKE_2("Container_Take_2"),
    
    @SerializedName("Container_Take_3")
    CONTAINER_TAKE_3("Container_Take_3"),
    
    @SerializedName("Container_Take_4")
    CONTAINER_TAKE_4("Container_Take_4"),
    
    @SerializedName("Container_Take_5")
    CONTAINER_TAKE_5("Container_Take_5"),
    
    @SerializedName("Container_Take_6")
    CONTAINER_TAKE_6("Container_Take_6"),
    
    @SerializedName("Container_Take_7")
    CONTAINER_TAKE_7("Container_Take_7"),
    
    @SerializedName("Rent_Office")
    RENT_OFFICE("Rent_Office"),
    
    @SerializedName("Rent_Factory_Facility")
    RENT_FACTORY_FACILITY("Rent_Factory_Facility"),
    
    @SerializedName("Rent_Research_Facility")
    RENT_RESEARCH_FACILITY("Rent_Research_Facility"),
    
    @SerializedName("Junior_Accountant")
    JUNIOR_ACCOUNTANT("Junior_Accountant"),
    
    @SerializedName("Config_Starbase_Equipment")
    CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),
    
    @SerializedName("Trader")
    TRADER("Trader"),
    
    @SerializedName("Communications_Officer")
    COMMUNICATIONS_OFFICER("Communications_Officer"),
    
    @SerializedName("Contract_Manager")
    CONTRACT_MANAGER("Contract_Manager"),
    
    @SerializedName("Starbase_Defense_Operator")
    STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),
    
    @SerializedName("Starbase_Fuel_Technician")
    STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),
    
    @SerializedName("Fitting_Manager")
    FITTING_MANAGER("Fitting_Manager"),
    
    @SerializedName("Terrestrial_Combat_Officer")
    TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),
    
    @SerializedName("Terrestrial_Logistics_Officer")
    TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

    private String value;

    RolesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("roles")
  private List<RolesEnum> roles = new ArrayList<RolesEnum>();

  /**
   * roles_at_base string
   */
  public enum RolesAtBaseEnum {
    @SerializedName("Director")
    DIRECTOR("Director"),
    
    @SerializedName("Personnel_Manager")
    PERSONNEL_MANAGER("Personnel_Manager"),
    
    @SerializedName("Accountant")
    ACCOUNTANT("Accountant"),
    
    @SerializedName("Security_Officer")
    SECURITY_OFFICER("Security_Officer"),
    
    @SerializedName("Factory_Manager")
    FACTORY_MANAGER("Factory_Manager"),
    
    @SerializedName("Station_Manager")
    STATION_MANAGER("Station_Manager"),
    
    @SerializedName("Auditor")
    AUDITOR("Auditor"),
    
    @SerializedName("Hangar_Take_1")
    HANGAR_TAKE_1("Hangar_Take_1"),
    
    @SerializedName("Hangar_Take_2")
    HANGAR_TAKE_2("Hangar_Take_2"),
    
    @SerializedName("Hangar_Take_3")
    HANGAR_TAKE_3("Hangar_Take_3"),
    
    @SerializedName("Hangar_Take_4")
    HANGAR_TAKE_4("Hangar_Take_4"),
    
    @SerializedName("Hangar_Take_5")
    HANGAR_TAKE_5("Hangar_Take_5"),
    
    @SerializedName("Hangar_Take_6")
    HANGAR_TAKE_6("Hangar_Take_6"),
    
    @SerializedName("Hangar_Take_7")
    HANGAR_TAKE_7("Hangar_Take_7"),
    
    @SerializedName("Hangar_Query_1")
    HANGAR_QUERY_1("Hangar_Query_1"),
    
    @SerializedName("Hangar_Query_2")
    HANGAR_QUERY_2("Hangar_Query_2"),
    
    @SerializedName("Hangar_Query_3")
    HANGAR_QUERY_3("Hangar_Query_3"),
    
    @SerializedName("Hangar_Query_4")
    HANGAR_QUERY_4("Hangar_Query_4"),
    
    @SerializedName("Hangar_Query_5")
    HANGAR_QUERY_5("Hangar_Query_5"),
    
    @SerializedName("Hangar_Query_6")
    HANGAR_QUERY_6("Hangar_Query_6"),
    
    @SerializedName("Hangar_Query_7")
    HANGAR_QUERY_7("Hangar_Query_7"),
    
    @SerializedName("Account_Take_1")
    ACCOUNT_TAKE_1("Account_Take_1"),
    
    @SerializedName("Account_Take_2")
    ACCOUNT_TAKE_2("Account_Take_2"),
    
    @SerializedName("Account_Take_3")
    ACCOUNT_TAKE_3("Account_Take_3"),
    
    @SerializedName("Account_Take_4")
    ACCOUNT_TAKE_4("Account_Take_4"),
    
    @SerializedName("Account_Take_5")
    ACCOUNT_TAKE_5("Account_Take_5"),
    
    @SerializedName("Account_Take_6")
    ACCOUNT_TAKE_6("Account_Take_6"),
    
    @SerializedName("Account_Take_7")
    ACCOUNT_TAKE_7("Account_Take_7"),
    
    @SerializedName("Diplomat")
    DIPLOMAT("Diplomat"),
    
    @SerializedName("Config_Equipment")
    CONFIG_EQUIPMENT("Config_Equipment"),
    
    @SerializedName("Container_Take_1")
    CONTAINER_TAKE_1("Container_Take_1"),
    
    @SerializedName("Container_Take_2")
    CONTAINER_TAKE_2("Container_Take_2"),
    
    @SerializedName("Container_Take_3")
    CONTAINER_TAKE_3("Container_Take_3"),
    
    @SerializedName("Container_Take_4")
    CONTAINER_TAKE_4("Container_Take_4"),
    
    @SerializedName("Container_Take_5")
    CONTAINER_TAKE_5("Container_Take_5"),
    
    @SerializedName("Container_Take_6")
    CONTAINER_TAKE_6("Container_Take_6"),
    
    @SerializedName("Container_Take_7")
    CONTAINER_TAKE_7("Container_Take_7"),
    
    @SerializedName("Rent_Office")
    RENT_OFFICE("Rent_Office"),
    
    @SerializedName("Rent_Factory_Facility")
    RENT_FACTORY_FACILITY("Rent_Factory_Facility"),
    
    @SerializedName("Rent_Research_Facility")
    RENT_RESEARCH_FACILITY("Rent_Research_Facility"),
    
    @SerializedName("Junior_Accountant")
    JUNIOR_ACCOUNTANT("Junior_Accountant"),
    
    @SerializedName("Config_Starbase_Equipment")
    CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),
    
    @SerializedName("Trader")
    TRADER("Trader"),
    
    @SerializedName("Communications_Officer")
    COMMUNICATIONS_OFFICER("Communications_Officer"),
    
    @SerializedName("Contract_Manager")
    CONTRACT_MANAGER("Contract_Manager"),
    
    @SerializedName("Starbase_Defense_Operator")
    STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),
    
    @SerializedName("Starbase_Fuel_Technician")
    STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),
    
    @SerializedName("Fitting_Manager")
    FITTING_MANAGER("Fitting_Manager"),
    
    @SerializedName("Terrestrial_Combat_Officer")
    TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),
    
    @SerializedName("Terrestrial_Logistics_Officer")
    TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

    private String value;

    RolesAtBaseEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("roles_at_base")
  private List<RolesAtBaseEnum> rolesAtBase = new ArrayList<RolesAtBaseEnum>();

  /**
   * roles_at_hq string
   */
  public enum RolesAtHqEnum {
    @SerializedName("Director")
    DIRECTOR("Director"),
    
    @SerializedName("Personnel_Manager")
    PERSONNEL_MANAGER("Personnel_Manager"),
    
    @SerializedName("Accountant")
    ACCOUNTANT("Accountant"),
    
    @SerializedName("Security_Officer")
    SECURITY_OFFICER("Security_Officer"),
    
    @SerializedName("Factory_Manager")
    FACTORY_MANAGER("Factory_Manager"),
    
    @SerializedName("Station_Manager")
    STATION_MANAGER("Station_Manager"),
    
    @SerializedName("Auditor")
    AUDITOR("Auditor"),
    
    @SerializedName("Hangar_Take_1")
    HANGAR_TAKE_1("Hangar_Take_1"),
    
    @SerializedName("Hangar_Take_2")
    HANGAR_TAKE_2("Hangar_Take_2"),
    
    @SerializedName("Hangar_Take_3")
    HANGAR_TAKE_3("Hangar_Take_3"),
    
    @SerializedName("Hangar_Take_4")
    HANGAR_TAKE_4("Hangar_Take_4"),
    
    @SerializedName("Hangar_Take_5")
    HANGAR_TAKE_5("Hangar_Take_5"),
    
    @SerializedName("Hangar_Take_6")
    HANGAR_TAKE_6("Hangar_Take_6"),
    
    @SerializedName("Hangar_Take_7")
    HANGAR_TAKE_7("Hangar_Take_7"),
    
    @SerializedName("Hangar_Query_1")
    HANGAR_QUERY_1("Hangar_Query_1"),
    
    @SerializedName("Hangar_Query_2")
    HANGAR_QUERY_2("Hangar_Query_2"),
    
    @SerializedName("Hangar_Query_3")
    HANGAR_QUERY_3("Hangar_Query_3"),
    
    @SerializedName("Hangar_Query_4")
    HANGAR_QUERY_4("Hangar_Query_4"),
    
    @SerializedName("Hangar_Query_5")
    HANGAR_QUERY_5("Hangar_Query_5"),
    
    @SerializedName("Hangar_Query_6")
    HANGAR_QUERY_6("Hangar_Query_6"),
    
    @SerializedName("Hangar_Query_7")
    HANGAR_QUERY_7("Hangar_Query_7"),
    
    @SerializedName("Account_Take_1")
    ACCOUNT_TAKE_1("Account_Take_1"),
    
    @SerializedName("Account_Take_2")
    ACCOUNT_TAKE_2("Account_Take_2"),
    
    @SerializedName("Account_Take_3")
    ACCOUNT_TAKE_3("Account_Take_3"),
    
    @SerializedName("Account_Take_4")
    ACCOUNT_TAKE_4("Account_Take_4"),
    
    @SerializedName("Account_Take_5")
    ACCOUNT_TAKE_5("Account_Take_5"),
    
    @SerializedName("Account_Take_6")
    ACCOUNT_TAKE_6("Account_Take_6"),
    
    @SerializedName("Account_Take_7")
    ACCOUNT_TAKE_7("Account_Take_7"),
    
    @SerializedName("Diplomat")
    DIPLOMAT("Diplomat"),
    
    @SerializedName("Config_Equipment")
    CONFIG_EQUIPMENT("Config_Equipment"),
    
    @SerializedName("Container_Take_1")
    CONTAINER_TAKE_1("Container_Take_1"),
    
    @SerializedName("Container_Take_2")
    CONTAINER_TAKE_2("Container_Take_2"),
    
    @SerializedName("Container_Take_3")
    CONTAINER_TAKE_3("Container_Take_3"),
    
    @SerializedName("Container_Take_4")
    CONTAINER_TAKE_4("Container_Take_4"),
    
    @SerializedName("Container_Take_5")
    CONTAINER_TAKE_5("Container_Take_5"),
    
    @SerializedName("Container_Take_6")
    CONTAINER_TAKE_6("Container_Take_6"),
    
    @SerializedName("Container_Take_7")
    CONTAINER_TAKE_7("Container_Take_7"),
    
    @SerializedName("Rent_Office")
    RENT_OFFICE("Rent_Office"),
    
    @SerializedName("Rent_Factory_Facility")
    RENT_FACTORY_FACILITY("Rent_Factory_Facility"),
    
    @SerializedName("Rent_Research_Facility")
    RENT_RESEARCH_FACILITY("Rent_Research_Facility"),
    
    @SerializedName("Junior_Accountant")
    JUNIOR_ACCOUNTANT("Junior_Accountant"),
    
    @SerializedName("Config_Starbase_Equipment")
    CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),
    
    @SerializedName("Trader")
    TRADER("Trader"),
    
    @SerializedName("Communications_Officer")
    COMMUNICATIONS_OFFICER("Communications_Officer"),
    
    @SerializedName("Contract_Manager")
    CONTRACT_MANAGER("Contract_Manager"),
    
    @SerializedName("Starbase_Defense_Operator")
    STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),
    
    @SerializedName("Starbase_Fuel_Technician")
    STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),
    
    @SerializedName("Fitting_Manager")
    FITTING_MANAGER("Fitting_Manager"),
    
    @SerializedName("Terrestrial_Combat_Officer")
    TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),
    
    @SerializedName("Terrestrial_Logistics_Officer")
    TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

    private String value;

    RolesAtHqEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("roles_at_hq")
  private List<RolesAtHqEnum> rolesAtHq = new ArrayList<RolesAtHqEnum>();

  /**
   * roles_at_other string
   */
  public enum RolesAtOtherEnum {
    @SerializedName("Director")
    DIRECTOR("Director"),
    
    @SerializedName("Personnel_Manager")
    PERSONNEL_MANAGER("Personnel_Manager"),
    
    @SerializedName("Accountant")
    ACCOUNTANT("Accountant"),
    
    @SerializedName("Security_Officer")
    SECURITY_OFFICER("Security_Officer"),
    
    @SerializedName("Factory_Manager")
    FACTORY_MANAGER("Factory_Manager"),
    
    @SerializedName("Station_Manager")
    STATION_MANAGER("Station_Manager"),
    
    @SerializedName("Auditor")
    AUDITOR("Auditor"),
    
    @SerializedName("Hangar_Take_1")
    HANGAR_TAKE_1("Hangar_Take_1"),
    
    @SerializedName("Hangar_Take_2")
    HANGAR_TAKE_2("Hangar_Take_2"),
    
    @SerializedName("Hangar_Take_3")
    HANGAR_TAKE_3("Hangar_Take_3"),
    
    @SerializedName("Hangar_Take_4")
    HANGAR_TAKE_4("Hangar_Take_4"),
    
    @SerializedName("Hangar_Take_5")
    HANGAR_TAKE_5("Hangar_Take_5"),
    
    @SerializedName("Hangar_Take_6")
    HANGAR_TAKE_6("Hangar_Take_6"),
    
    @SerializedName("Hangar_Take_7")
    HANGAR_TAKE_7("Hangar_Take_7"),
    
    @SerializedName("Hangar_Query_1")
    HANGAR_QUERY_1("Hangar_Query_1"),
    
    @SerializedName("Hangar_Query_2")
    HANGAR_QUERY_2("Hangar_Query_2"),
    
    @SerializedName("Hangar_Query_3")
    HANGAR_QUERY_3("Hangar_Query_3"),
    
    @SerializedName("Hangar_Query_4")
    HANGAR_QUERY_4("Hangar_Query_4"),
    
    @SerializedName("Hangar_Query_5")
    HANGAR_QUERY_5("Hangar_Query_5"),
    
    @SerializedName("Hangar_Query_6")
    HANGAR_QUERY_6("Hangar_Query_6"),
    
    @SerializedName("Hangar_Query_7")
    HANGAR_QUERY_7("Hangar_Query_7"),
    
    @SerializedName("Account_Take_1")
    ACCOUNT_TAKE_1("Account_Take_1"),
    
    @SerializedName("Account_Take_2")
    ACCOUNT_TAKE_2("Account_Take_2"),
    
    @SerializedName("Account_Take_3")
    ACCOUNT_TAKE_3("Account_Take_3"),
    
    @SerializedName("Account_Take_4")
    ACCOUNT_TAKE_4("Account_Take_4"),
    
    @SerializedName("Account_Take_5")
    ACCOUNT_TAKE_5("Account_Take_5"),
    
    @SerializedName("Account_Take_6")
    ACCOUNT_TAKE_6("Account_Take_6"),
    
    @SerializedName("Account_Take_7")
    ACCOUNT_TAKE_7("Account_Take_7"),
    
    @SerializedName("Diplomat")
    DIPLOMAT("Diplomat"),
    
    @SerializedName("Config_Equipment")
    CONFIG_EQUIPMENT("Config_Equipment"),
    
    @SerializedName("Container_Take_1")
    CONTAINER_TAKE_1("Container_Take_1"),
    
    @SerializedName("Container_Take_2")
    CONTAINER_TAKE_2("Container_Take_2"),
    
    @SerializedName("Container_Take_3")
    CONTAINER_TAKE_3("Container_Take_3"),
    
    @SerializedName("Container_Take_4")
    CONTAINER_TAKE_4("Container_Take_4"),
    
    @SerializedName("Container_Take_5")
    CONTAINER_TAKE_5("Container_Take_5"),
    
    @SerializedName("Container_Take_6")
    CONTAINER_TAKE_6("Container_Take_6"),
    
    @SerializedName("Container_Take_7")
    CONTAINER_TAKE_7("Container_Take_7"),
    
    @SerializedName("Rent_Office")
    RENT_OFFICE("Rent_Office"),
    
    @SerializedName("Rent_Factory_Facility")
    RENT_FACTORY_FACILITY("Rent_Factory_Facility"),
    
    @SerializedName("Rent_Research_Facility")
    RENT_RESEARCH_FACILITY("Rent_Research_Facility"),
    
    @SerializedName("Junior_Accountant")
    JUNIOR_ACCOUNTANT("Junior_Accountant"),
    
    @SerializedName("Config_Starbase_Equipment")
    CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),
    
    @SerializedName("Trader")
    TRADER("Trader"),
    
    @SerializedName("Communications_Officer")
    COMMUNICATIONS_OFFICER("Communications_Officer"),
    
    @SerializedName("Contract_Manager")
    CONTRACT_MANAGER("Contract_Manager"),
    
    @SerializedName("Starbase_Defense_Operator")
    STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),
    
    @SerializedName("Starbase_Fuel_Technician")
    STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),
    
    @SerializedName("Fitting_Manager")
    FITTING_MANAGER("Fitting_Manager"),
    
    @SerializedName("Terrestrial_Combat_Officer")
    TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),
    
    @SerializedName("Terrestrial_Logistics_Officer")
    TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer");

    private String value;

    RolesAtOtherEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("roles_at_other")
  private List<RolesAtOtherEnum> rolesAtOther = new ArrayList<RolesAtOtherEnum>();

  public GetCorporationsCorporationIdRoles200Ok characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * character_id integer
   * @return characterId
  **/
  @ApiModelProperty(required = true, value = "character_id integer")
  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetCorporationsCorporationIdRoles200Ok grantableRoles(List<GrantableRolesEnum> grantableRoles) {
    this.grantableRoles = grantableRoles;
    return this;
  }

  public GetCorporationsCorporationIdRoles200Ok addGrantableRolesItem(GrantableRolesEnum grantableRolesItem) {
    this.grantableRoles.add(grantableRolesItem);
    return this;
  }

   /**
   * grantable_roles array
   * @return grantableRoles
  **/
  @ApiModelProperty(value = "grantable_roles array")
  public List<GrantableRolesEnum> getGrantableRoles() {
    return grantableRoles;
  }

  public void setGrantableRoles(List<GrantableRolesEnum> grantableRoles) {
    this.grantableRoles = grantableRoles;
  }

  public GetCorporationsCorporationIdRoles200Ok grantableRolesAtBase(List<GrantableRolesAtBaseEnum> grantableRolesAtBase) {
    this.grantableRolesAtBase = grantableRolesAtBase;
    return this;
  }

  public GetCorporationsCorporationIdRoles200Ok addGrantableRolesAtBaseItem(GrantableRolesAtBaseEnum grantableRolesAtBaseItem) {
    this.grantableRolesAtBase.add(grantableRolesAtBaseItem);
    return this;
  }

   /**
   * grantable_roles_at_base array
   * @return grantableRolesAtBase
  **/
  @ApiModelProperty(value = "grantable_roles_at_base array")
  public List<GrantableRolesAtBaseEnum> getGrantableRolesAtBase() {
    return grantableRolesAtBase;
  }

  public void setGrantableRolesAtBase(List<GrantableRolesAtBaseEnum> grantableRolesAtBase) {
    this.grantableRolesAtBase = grantableRolesAtBase;
  }

  public GetCorporationsCorporationIdRoles200Ok grantableRolesAtHq(List<GrantableRolesAtHqEnum> grantableRolesAtHq) {
    this.grantableRolesAtHq = grantableRolesAtHq;
    return this;
  }

  public GetCorporationsCorporationIdRoles200Ok addGrantableRolesAtHqItem(GrantableRolesAtHqEnum grantableRolesAtHqItem) {
    this.grantableRolesAtHq.add(grantableRolesAtHqItem);
    return this;
  }

   /**
   * grantable_roles_at_hq array
   * @return grantableRolesAtHq
  **/
  @ApiModelProperty(value = "grantable_roles_at_hq array")
  public List<GrantableRolesAtHqEnum> getGrantableRolesAtHq() {
    return grantableRolesAtHq;
  }

  public void setGrantableRolesAtHq(List<GrantableRolesAtHqEnum> grantableRolesAtHq) {
    this.grantableRolesAtHq = grantableRolesAtHq;
  }

  public GetCorporationsCorporationIdRoles200Ok grantableRolesAtOther(List<GrantableRolesAtOtherEnum> grantableRolesAtOther) {
    this.grantableRolesAtOther = grantableRolesAtOther;
    return this;
  }

  public GetCorporationsCorporationIdRoles200Ok addGrantableRolesAtOtherItem(GrantableRolesAtOtherEnum grantableRolesAtOtherItem) {
    this.grantableRolesAtOther.add(grantableRolesAtOtherItem);
    return this;
  }

   /**
   * grantable_roles_at_other array
   * @return grantableRolesAtOther
  **/
  @ApiModelProperty(value = "grantable_roles_at_other array")
  public List<GrantableRolesAtOtherEnum> getGrantableRolesAtOther() {
    return grantableRolesAtOther;
  }

  public void setGrantableRolesAtOther(List<GrantableRolesAtOtherEnum> grantableRolesAtOther) {
    this.grantableRolesAtOther = grantableRolesAtOther;
  }

  public GetCorporationsCorporationIdRoles200Ok roles(List<RolesEnum> roles) {
    this.roles = roles;
    return this;
  }

  public GetCorporationsCorporationIdRoles200Ok addRolesItem(RolesEnum rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * roles array
   * @return roles
  **/
  @ApiModelProperty(value = "roles array")
  public List<RolesEnum> getRoles() {
    return roles;
  }

  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  public GetCorporationsCorporationIdRoles200Ok rolesAtBase(List<RolesAtBaseEnum> rolesAtBase) {
    this.rolesAtBase = rolesAtBase;
    return this;
  }

  public GetCorporationsCorporationIdRoles200Ok addRolesAtBaseItem(RolesAtBaseEnum rolesAtBaseItem) {
    this.rolesAtBase.add(rolesAtBaseItem);
    return this;
  }

   /**
   * roles_at_base array
   * @return rolesAtBase
  **/
  @ApiModelProperty(value = "roles_at_base array")
  public List<RolesAtBaseEnum> getRolesAtBase() {
    return rolesAtBase;
  }

  public void setRolesAtBase(List<RolesAtBaseEnum> rolesAtBase) {
    this.rolesAtBase = rolesAtBase;
  }

  public GetCorporationsCorporationIdRoles200Ok rolesAtHq(List<RolesAtHqEnum> rolesAtHq) {
    this.rolesAtHq = rolesAtHq;
    return this;
  }

  public GetCorporationsCorporationIdRoles200Ok addRolesAtHqItem(RolesAtHqEnum rolesAtHqItem) {
    this.rolesAtHq.add(rolesAtHqItem);
    return this;
  }

   /**
   * roles_at_hq array
   * @return rolesAtHq
  **/
  @ApiModelProperty(value = "roles_at_hq array")
  public List<RolesAtHqEnum> getRolesAtHq() {
    return rolesAtHq;
  }

  public void setRolesAtHq(List<RolesAtHqEnum> rolesAtHq) {
    this.rolesAtHq = rolesAtHq;
  }

  public GetCorporationsCorporationIdRoles200Ok rolesAtOther(List<RolesAtOtherEnum> rolesAtOther) {
    this.rolesAtOther = rolesAtOther;
    return this;
  }

  public GetCorporationsCorporationIdRoles200Ok addRolesAtOtherItem(RolesAtOtherEnum rolesAtOtherItem) {
    this.rolesAtOther.add(rolesAtOtherItem);
    return this;
  }

   /**
   * roles_at_other array
   * @return rolesAtOther
  **/
  @ApiModelProperty(value = "roles_at_other array")
  public List<RolesAtOtherEnum> getRolesAtOther() {
    return rolesAtOther;
  }

  public void setRolesAtOther(List<RolesAtOtherEnum> rolesAtOther) {
    this.rolesAtOther = rolesAtOther;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdRoles200Ok getCorporationsCorporationIdRoles200Ok = (GetCorporationsCorporationIdRoles200Ok) o;
    return Objects.equals(this.characterId, getCorporationsCorporationIdRoles200Ok.characterId) &&
        Objects.equals(this.grantableRoles, getCorporationsCorporationIdRoles200Ok.grantableRoles) &&
        Objects.equals(this.grantableRolesAtBase, getCorporationsCorporationIdRoles200Ok.grantableRolesAtBase) &&
        Objects.equals(this.grantableRolesAtHq, getCorporationsCorporationIdRoles200Ok.grantableRolesAtHq) &&
        Objects.equals(this.grantableRolesAtOther, getCorporationsCorporationIdRoles200Ok.grantableRolesAtOther) &&
        Objects.equals(this.roles, getCorporationsCorporationIdRoles200Ok.roles) &&
        Objects.equals(this.rolesAtBase, getCorporationsCorporationIdRoles200Ok.rolesAtBase) &&
        Objects.equals(this.rolesAtHq, getCorporationsCorporationIdRoles200Ok.rolesAtHq) &&
        Objects.equals(this.rolesAtOther, getCorporationsCorporationIdRoles200Ok.rolesAtOther);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterId, grantableRoles, grantableRolesAtBase, grantableRolesAtHq, grantableRolesAtOther, roles, rolesAtBase, rolesAtHq, rolesAtOther);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdRoles200Ok {\n");
    
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    grantableRoles: ").append(toIndentedString(grantableRoles)).append("\n");
    sb.append("    grantableRolesAtBase: ").append(toIndentedString(grantableRolesAtBase)).append("\n");
    sb.append("    grantableRolesAtHq: ").append(toIndentedString(grantableRolesAtHq)).append("\n");
    sb.append("    grantableRolesAtOther: ").append(toIndentedString(grantableRolesAtOther)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    rolesAtBase: ").append(toIndentedString(rolesAtBase)).append("\n");
    sb.append("    rolesAtHq: ").append(toIndentedString(rolesAtHq)).append("\n");
    sb.append("    rolesAtOther: ").append(toIndentedString(rolesAtOther)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

