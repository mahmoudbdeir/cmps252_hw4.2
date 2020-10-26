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

@Tag("8")
class Record_1340 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1340: FirstName is Rachelle")
	void FirstNameOfRecord1340() {
		assertEquals("Rachelle", customers.get(1339).getFirstName());
	}

	@Test
	@DisplayName("Record 1340: LastName is Almaras")
	void LastNameOfRecord1340() {
		assertEquals("Almaras", customers.get(1339).getLastName());
	}

	@Test
	@DisplayName("Record 1340: Company is Aztec Media Company Llc")
	void CompanyOfRecord1340() {
		assertEquals("Aztec Media Company Llc", customers.get(1339).getCompany());
	}

	@Test
	@DisplayName("Record 1340: Address is 2030 Nw 94th Ave")
	void AddressOfRecord1340() {
		assertEquals("2030 Nw 94th Ave", customers.get(1339).getAddress());
	}

	@Test
	@DisplayName("Record 1340: City is Miami")
	void CityOfRecord1340() {
		assertEquals("Miami", customers.get(1339).getCity());
	}

	@Test
	@DisplayName("Record 1340: County is Miami-Dade")
	void CountyOfRecord1340() {
		assertEquals("Miami-Dade", customers.get(1339).getCounty());
	}

	@Test
	@DisplayName("Record 1340: State is FL")
	void StateOfRecord1340() {
		assertEquals("FL", customers.get(1339).getState());
	}

	@Test
	@DisplayName("Record 1340: ZIP is 33172")
	void ZIPOfRecord1340() {
		assertEquals("33172", customers.get(1339).getZIP());
	}

	@Test
	@DisplayName("Record 1340: Phone is 305-593-7851")
	void PhoneOfRecord1340() {
		assertEquals("305-593-7851", customers.get(1339).getPhone());
	}

	@Test
	@DisplayName("Record 1340: Fax is 305-593-5694")
	void FaxOfRecord1340() {
		assertEquals("305-593-5694", customers.get(1339).getFax());
	}

	@Test
	@DisplayName("Record 1340: Email is rachelle@almaras.com")
	void EmailOfRecord1340() {
		assertEquals("rachelle@almaras.com", customers.get(1339).getEmail());
	}

	@Test
	@DisplayName("Record 1340: Web is http://www.rachellealmaras.com")
	void WebOfRecord1340() {
		assertEquals("http://www.rachellealmaras.com", customers.get(1339).getWeb());
	}
}
