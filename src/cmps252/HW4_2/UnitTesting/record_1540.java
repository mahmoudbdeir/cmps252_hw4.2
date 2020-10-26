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

@Tag("31")
class Record_1540 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1540: FirstName is Caryn")
	void FirstNameOfRecord1540() {
		assertEquals("Caryn", customers.get(1539).getFirstName());
	}

	@Test
	@DisplayName("Record 1540: LastName is Calicut")
	void LastNameOfRecord1540() {
		assertEquals("Calicut", customers.get(1539).getLastName());
	}

	@Test
	@DisplayName("Record 1540: Company is Kfdi Am & Fm")
	void CompanyOfRecord1540() {
		assertEquals("Kfdi Am & Fm", customers.get(1539).getCompany());
	}

	@Test
	@DisplayName("Record 1540: Address is 150 Varick St")
	void AddressOfRecord1540() {
		assertEquals("150 Varick St", customers.get(1539).getAddress());
	}

	@Test
	@DisplayName("Record 1540: City is New York")
	void CityOfRecord1540() {
		assertEquals("New York", customers.get(1539).getCity());
	}

	@Test
	@DisplayName("Record 1540: County is New York")
	void CountyOfRecord1540() {
		assertEquals("New York", customers.get(1539).getCounty());
	}

	@Test
	@DisplayName("Record 1540: State is NY")
	void StateOfRecord1540() {
		assertEquals("NY", customers.get(1539).getState());
	}

	@Test
	@DisplayName("Record 1540: ZIP is 10013")
	void ZIPOfRecord1540() {
		assertEquals("10013", customers.get(1539).getZIP());
	}

	@Test
	@DisplayName("Record 1540: Phone is 212-366-1151")
	void PhoneOfRecord1540() {
		assertEquals("212-366-1151", customers.get(1539).getPhone());
	}

	@Test
	@DisplayName("Record 1540: Fax is 212-366-5048")
	void FaxOfRecord1540() {
		assertEquals("212-366-5048", customers.get(1539).getFax());
	}

	@Test
	@DisplayName("Record 1540: Email is caryn@calicut.com")
	void EmailOfRecord1540() {
		assertEquals("caryn@calicut.com", customers.get(1539).getEmail());
	}

	@Test
	@DisplayName("Record 1540: Web is http://www.caryncalicut.com")
	void WebOfRecord1540() {
		assertEquals("http://www.caryncalicut.com", customers.get(1539).getWeb());
	}
}
