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

@Tag("47")
class Record_1212 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1212: FirstName is Lloyd")
	void FirstNameOfRecord1212() {
		assertEquals("Lloyd", customers.get(1211).getFirstName());
	}

	@Test
	@DisplayName("Record 1212: LastName is Gomora")
	void LastNameOfRecord1212() {
		assertEquals("Gomora", customers.get(1211).getLastName());
	}

	@Test
	@DisplayName("Record 1212: Company is Bagatelos & Fadem")
	void CompanyOfRecord1212() {
		assertEquals("Bagatelos & Fadem", customers.get(1211).getCompany());
	}

	@Test
	@DisplayName("Record 1212: Address is 2007 N Mays St  #-101")
	void AddressOfRecord1212() {
		assertEquals("2007 N Mays St  #-101", customers.get(1211).getAddress());
	}

	@Test
	@DisplayName("Record 1212: City is Round Rock")
	void CityOfRecord1212() {
		assertEquals("Round Rock", customers.get(1211).getCity());
	}

	@Test
	@DisplayName("Record 1212: County is Williamson")
	void CountyOfRecord1212() {
		assertEquals("Williamson", customers.get(1211).getCounty());
	}

	@Test
	@DisplayName("Record 1212: State is TX")
	void StateOfRecord1212() {
		assertEquals("TX", customers.get(1211).getState());
	}

	@Test
	@DisplayName("Record 1212: ZIP is 78664")
	void ZIPOfRecord1212() {
		assertEquals("78664", customers.get(1211).getZIP());
	}

	@Test
	@DisplayName("Record 1212: Phone is 512-218-5167")
	void PhoneOfRecord1212() {
		assertEquals("512-218-5167", customers.get(1211).getPhone());
	}

	@Test
	@DisplayName("Record 1212: Fax is 512-218-6433")
	void FaxOfRecord1212() {
		assertEquals("512-218-6433", customers.get(1211).getFax());
	}

	@Test
	@DisplayName("Record 1212: Email is lloyd@gomora.com")
	void EmailOfRecord1212() {
		assertEquals("lloyd@gomora.com", customers.get(1211).getEmail());
	}

	@Test
	@DisplayName("Record 1212: Web is http://www.lloydgomora.com")
	void WebOfRecord1212() {
		assertEquals("http://www.lloydgomora.com", customers.get(1211).getWeb());
	}
}
