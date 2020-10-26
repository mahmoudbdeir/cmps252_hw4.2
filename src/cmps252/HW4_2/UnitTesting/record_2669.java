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

@Tag("38")
class Record_2669 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2669: FirstName is Kurtis")
	void FirstNameOfRecord2669() {
		assertEquals("Kurtis", customers.get(2668).getFirstName());
	}

	@Test
	@DisplayName("Record 2669: LastName is Pirkl")
	void LastNameOfRecord2669() {
		assertEquals("Pirkl", customers.get(2668).getLastName());
	}

	@Test
	@DisplayName("Record 2669: Company is Agri Marketing Corp")
	void CompanyOfRecord2669() {
		assertEquals("Agri Marketing Corp", customers.get(2668).getCompany());
	}

	@Test
	@DisplayName("Record 2669: Address is 10919 Downey Ave")
	void AddressOfRecord2669() {
		assertEquals("10919 Downey Ave", customers.get(2668).getAddress());
	}

	@Test
	@DisplayName("Record 2669: City is Downey")
	void CityOfRecord2669() {
		assertEquals("Downey", customers.get(2668).getCity());
	}

	@Test
	@DisplayName("Record 2669: County is Los Angeles")
	void CountyOfRecord2669() {
		assertEquals("Los Angeles", customers.get(2668).getCounty());
	}

	@Test
	@DisplayName("Record 2669: State is CA")
	void StateOfRecord2669() {
		assertEquals("CA", customers.get(2668).getState());
	}

	@Test
	@DisplayName("Record 2669: ZIP is 90241")
	void ZIPOfRecord2669() {
		assertEquals("90241", customers.get(2668).getZIP());
	}

	@Test
	@DisplayName("Record 2669: Phone is 562-862-7200")
	void PhoneOfRecord2669() {
		assertEquals("562-862-7200", customers.get(2668).getPhone());
	}

	@Test
	@DisplayName("Record 2669: Fax is 562-862-4369")
	void FaxOfRecord2669() {
		assertEquals("562-862-4369", customers.get(2668).getFax());
	}

	@Test
	@DisplayName("Record 2669: Email is kurtis@pirkl.com")
	void EmailOfRecord2669() {
		assertEquals("kurtis@pirkl.com", customers.get(2668).getEmail());
	}

	@Test
	@DisplayName("Record 2669: Web is http://www.kurtispirkl.com")
	void WebOfRecord2669() {
		assertEquals("http://www.kurtispirkl.com", customers.get(2668).getWeb());
	}
}
