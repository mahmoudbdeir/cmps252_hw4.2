package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("45")
class Record_2806 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2806: FirstName is Tod")
	void FirstNameOfRecord2806() {
		assertEquals("Tod", customers.get(2805).getFirstName());
	}

	@Test
	@DisplayName("Record 2806: LastName is Snay")
	void LastNameOfRecord2806() {
		assertEquals("Snay", customers.get(2805).getLastName());
	}

	@Test
	@DisplayName("Record 2806: Company is Tore Beal Gwartney")
	void CompanyOfRecord2806() {
		assertEquals("Tore Beal Gwartney", customers.get(2805).getCompany());
	}

	@Test
	@DisplayName("Record 2806: Address is 15300 Sw 106th Ter  #-510")
	void AddressOfRecord2806() {
		assertEquals("15300 Sw 106th Ter  #-510", customers.get(2805).getAddress());
	}

	@Test
	@DisplayName("Record 2806: City is Miami")
	void CityOfRecord2806() {
		assertEquals("Miami", customers.get(2805).getCity());
	}

	@Test
	@DisplayName("Record 2806: County is Miami-Dade")
	void CountyOfRecord2806() {
		assertEquals("Miami-Dade", customers.get(2805).getCounty());
	}

	@Test
	@DisplayName("Record 2806: State is FL")
	void StateOfRecord2806() {
		assertEquals("FL", customers.get(2805).getState());
	}

	@Test
	@DisplayName("Record 2806: ZIP is 33196")
	void ZIPOfRecord2806() {
		assertEquals("33196", customers.get(2805).getZIP());
	}

	@Test
	@DisplayName("Record 2806: Phone is 305-232-0684")
	void PhoneOfRecord2806() {
		assertEquals("305-232-0684", customers.get(2805).getPhone());
	}

	@Test
	@DisplayName("Record 2806: Fax is 305-232-8037")
	void FaxOfRecord2806() {
		assertEquals("305-232-8037", customers.get(2805).getFax());
	}

	@Test
	@DisplayName("Record 2806: Email is tod@snay.com")
	void EmailOfRecord2806() {
		assertEquals("tod@snay.com", customers.get(2805).getEmail());
	}

	@Test
	@DisplayName("Record 2806: Web is http://www.todsnay.com")
	void WebOfRecord2806() {
		assertEquals("http://www.todsnay.com", customers.get(2805).getWeb());
	}
}
