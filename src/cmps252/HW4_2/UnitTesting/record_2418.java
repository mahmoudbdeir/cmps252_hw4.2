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

@Tag("3")
class Record_2418 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2418: FirstName is Mercedes")
	void FirstNameOfRecord2418() {
		assertEquals("Mercedes", customers.get(2417).getFirstName());
	}

	@Test
	@DisplayName("Record 2418: LastName is Collella")
	void LastNameOfRecord2418() {
		assertEquals("Collella", customers.get(2417).getLastName());
	}

	@Test
	@DisplayName("Record 2418: Company is All Points Travel Inc")
	void CompanyOfRecord2418() {
		assertEquals("All Points Travel Inc", customers.get(2417).getCompany());
	}

	@Test
	@DisplayName("Record 2418: Address is 23319 Cooper Dr")
	void AddressOfRecord2418() {
		assertEquals("23319 Cooper Dr", customers.get(2417).getAddress());
	}

	@Test
	@DisplayName("Record 2418: City is Elkhart")
	void CityOfRecord2418() {
		assertEquals("Elkhart", customers.get(2417).getCity());
	}

	@Test
	@DisplayName("Record 2418: County is Elkhart")
	void CountyOfRecord2418() {
		assertEquals("Elkhart", customers.get(2417).getCounty());
	}

	@Test
	@DisplayName("Record 2418: State is IN")
	void StateOfRecord2418() {
		assertEquals("IN", customers.get(2417).getState());
	}

	@Test
	@DisplayName("Record 2418: ZIP is 46514")
	void ZIPOfRecord2418() {
		assertEquals("46514", customers.get(2417).getZIP());
	}

	@Test
	@DisplayName("Record 2418: Phone is 574-266-2063")
	void PhoneOfRecord2418() {
		assertEquals("574-266-2063", customers.get(2417).getPhone());
	}

	@Test
	@DisplayName("Record 2418: Fax is 574-266-6387")
	void FaxOfRecord2418() {
		assertEquals("574-266-6387", customers.get(2417).getFax());
	}

	@Test
	@DisplayName("Record 2418: Email is mercedes@collella.com")
	void EmailOfRecord2418() {
		assertEquals("mercedes@collella.com", customers.get(2417).getEmail());
	}

	@Test
	@DisplayName("Record 2418: Web is http://www.mercedescollella.com")
	void WebOfRecord2418() {
		assertEquals("http://www.mercedescollella.com", customers.get(2417).getWeb());
	}
}
