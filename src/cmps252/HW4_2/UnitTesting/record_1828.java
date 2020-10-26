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

@Tag("5")
class Record_1828 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1828: FirstName is Darrell")
	void FirstNameOfRecord1828() {
		assertEquals("Darrell", customers.get(1827).getFirstName());
	}

	@Test
	@DisplayName("Record 1828: LastName is Minning")
	void LastNameOfRecord1828() {
		assertEquals("Minning", customers.get(1827).getLastName());
	}

	@Test
	@DisplayName("Record 1828: Company is Wise, Tracey N Esq")
	void CompanyOfRecord1828() {
		assertEquals("Wise, Tracey N Esq", customers.get(1827).getCompany());
	}

	@Test
	@DisplayName("Record 1828: Address is 2600 Crooks Rd")
	void AddressOfRecord1828() {
		assertEquals("2600 Crooks Rd", customers.get(1827).getAddress());
	}

	@Test
	@DisplayName("Record 1828: City is Troy")
	void CityOfRecord1828() {
		assertEquals("Troy", customers.get(1827).getCity());
	}

	@Test
	@DisplayName("Record 1828: County is Oakland")
	void CountyOfRecord1828() {
		assertEquals("Oakland", customers.get(1827).getCounty());
	}

	@Test
	@DisplayName("Record 1828: State is MI")
	void StateOfRecord1828() {
		assertEquals("MI", customers.get(1827).getState());
	}

	@Test
	@DisplayName("Record 1828: ZIP is 48084")
	void ZIPOfRecord1828() {
		assertEquals("48084", customers.get(1827).getZIP());
	}

	@Test
	@DisplayName("Record 1828: Phone is 248-362-7289")
	void PhoneOfRecord1828() {
		assertEquals("248-362-7289", customers.get(1827).getPhone());
	}

	@Test
	@DisplayName("Record 1828: Fax is 248-362-8509")
	void FaxOfRecord1828() {
		assertEquals("248-362-8509", customers.get(1827).getFax());
	}

	@Test
	@DisplayName("Record 1828: Email is darrell@minning.com")
	void EmailOfRecord1828() {
		assertEquals("darrell@minning.com", customers.get(1827).getEmail());
	}

	@Test
	@DisplayName("Record 1828: Web is http://www.darrellminning.com")
	void WebOfRecord1828() {
		assertEquals("http://www.darrellminning.com", customers.get(1827).getWeb());
	}
}
