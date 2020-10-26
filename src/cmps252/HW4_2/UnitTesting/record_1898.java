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

@Tag("48")
class Record_1898 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1898: FirstName is Kimberlee")
	void FirstNameOfRecord1898() {
		assertEquals("Kimberlee", customers.get(1897).getFirstName());
	}

	@Test
	@DisplayName("Record 1898: LastName is Sou")
	void LastNameOfRecord1898() {
		assertEquals("Sou", customers.get(1897).getLastName());
	}

	@Test
	@DisplayName("Record 1898: Company is Advanced Instruments Inc")
	void CompanyOfRecord1898() {
		assertEquals("Advanced Instruments Inc", customers.get(1897).getCompany());
	}

	@Test
	@DisplayName("Record 1898: Address is Rt 116")
	void AddressOfRecord1898() {
		assertEquals("Rt 116", customers.get(1897).getAddress());
	}

	@Test
	@DisplayName("Record 1898: City is Bristol")
	void CityOfRecord1898() {
		assertEquals("Bristol", customers.get(1897).getCity());
	}

	@Test
	@DisplayName("Record 1898: County is Addison")
	void CountyOfRecord1898() {
		assertEquals("Addison", customers.get(1897).getCounty());
	}

	@Test
	@DisplayName("Record 1898: State is VT")
	void StateOfRecord1898() {
		assertEquals("VT", customers.get(1897).getState());
	}

	@Test
	@DisplayName("Record 1898: ZIP is 5443")
	void ZIPOfRecord1898() {
		assertEquals("5443", customers.get(1897).getZIP());
	}

	@Test
	@DisplayName("Record 1898: Phone is 802-453-7453")
	void PhoneOfRecord1898() {
		assertEquals("802-453-7453", customers.get(1897).getPhone());
	}

	@Test
	@DisplayName("Record 1898: Fax is 802-453-9586")
	void FaxOfRecord1898() {
		assertEquals("802-453-9586", customers.get(1897).getFax());
	}

	@Test
	@DisplayName("Record 1898: Email is kimberlee@sou.com")
	void EmailOfRecord1898() {
		assertEquals("kimberlee@sou.com", customers.get(1897).getEmail());
	}

	@Test
	@DisplayName("Record 1898: Web is http://www.kimberleesou.com")
	void WebOfRecord1898() {
		assertEquals("http://www.kimberleesou.com", customers.get(1897).getWeb());
	}
}
