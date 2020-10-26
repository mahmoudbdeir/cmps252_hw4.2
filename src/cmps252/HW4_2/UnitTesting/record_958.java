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

@Tag("22")
class Record_958 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 958: FirstName is Roberto")
	void FirstNameOfRecord958() {
		assertEquals("Roberto", customers.get(957).getFirstName());
	}

	@Test
	@DisplayName("Record 958: LastName is Gurwell")
	void LastNameOfRecord958() {
		assertEquals("Gurwell", customers.get(957).getLastName());
	}

	@Test
	@DisplayName("Record 958: Company is Frisch Process Service")
	void CompanyOfRecord958() {
		assertEquals("Frisch Process Service", customers.get(957).getCompany());
	}

	@Test
	@DisplayName("Record 958: Address is 2555 Poplar Ave")
	void AddressOfRecord958() {
		assertEquals("2555 Poplar Ave", customers.get(957).getAddress());
	}

	@Test
	@DisplayName("Record 958: City is Memphis")
	void CityOfRecord958() {
		assertEquals("Memphis", customers.get(957).getCity());
	}

	@Test
	@DisplayName("Record 958: County is Shelby")
	void CountyOfRecord958() {
		assertEquals("Shelby", customers.get(957).getCounty());
	}

	@Test
	@DisplayName("Record 958: State is TN")
	void StateOfRecord958() {
		assertEquals("TN", customers.get(957).getState());
	}

	@Test
	@DisplayName("Record 958: ZIP is 38112")
	void ZIPOfRecord958() {
		assertEquals("38112", customers.get(957).getZIP());
	}

	@Test
	@DisplayName("Record 958: Phone is 901-452-9959")
	void PhoneOfRecord958() {
		assertEquals("901-452-9959", customers.get(957).getPhone());
	}

	@Test
	@DisplayName("Record 958: Fax is 901-452-3735")
	void FaxOfRecord958() {
		assertEquals("901-452-3735", customers.get(957).getFax());
	}

	@Test
	@DisplayName("Record 958: Email is roberto@gurwell.com")
	void EmailOfRecord958() {
		assertEquals("roberto@gurwell.com", customers.get(957).getEmail());
	}

	@Test
	@DisplayName("Record 958: Web is http://www.robertogurwell.com")
	void WebOfRecord958() {
		assertEquals("http://www.robertogurwell.com", customers.get(957).getWeb());
	}
}
