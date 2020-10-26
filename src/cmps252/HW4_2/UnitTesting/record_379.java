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

@Tag("21")
class Record_379 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 379: FirstName is Anderson")
	void FirstNameOfRecord379() {
		assertEquals("Anderson", customers.get(378).getFirstName());
	}

	@Test
	@DisplayName("Record 379: LastName is Rustrian")
	void LastNameOfRecord379() {
		assertEquals("Rustrian", customers.get(378).getLastName());
	}

	@Test
	@DisplayName("Record 379: Company is Rse International")
	void CompanyOfRecord379() {
		assertEquals("Rse International", customers.get(378).getCompany());
	}

	@Test
	@DisplayName("Record 379: Address is Rr 1")
	void AddressOfRecord379() {
		assertEquals("Rr 1", customers.get(378).getAddress());
	}

	@Test
	@DisplayName("Record 379: City is Cicero")
	void CityOfRecord379() {
		assertEquals("Cicero", customers.get(378).getCity());
	}

	@Test
	@DisplayName("Record 379: County is Onondaga")
	void CountyOfRecord379() {
		assertEquals("Onondaga", customers.get(378).getCounty());
	}

	@Test
	@DisplayName("Record 379: State is NY")
	void StateOfRecord379() {
		assertEquals("NY", customers.get(378).getState());
	}

	@Test
	@DisplayName("Record 379: ZIP is 13039")
	void ZIPOfRecord379() {
		assertEquals("13039", customers.get(378).getZIP());
	}

	@Test
	@DisplayName("Record 379: Phone is 315-699-1035")
	void PhoneOfRecord379() {
		assertEquals("315-699-1035", customers.get(378).getPhone());
	}

	@Test
	@DisplayName("Record 379: Fax is 315-699-7164")
	void FaxOfRecord379() {
		assertEquals("315-699-7164", customers.get(378).getFax());
	}

	@Test
	@DisplayName("Record 379: Email is anderson@rustrian.com")
	void EmailOfRecord379() {
		assertEquals("anderson@rustrian.com", customers.get(378).getEmail());
	}

	@Test
	@DisplayName("Record 379: Web is http://www.andersonrustrian.com")
	void WebOfRecord379() {
		assertEquals("http://www.andersonrustrian.com", customers.get(378).getWeb());
	}
}
