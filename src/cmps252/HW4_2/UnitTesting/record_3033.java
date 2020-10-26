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

@Tag("10")
class Record_3033 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3033: FirstName is Esperanza")
	void FirstNameOfRecord3033() {
		assertEquals("Esperanza", customers.get(3032).getFirstName());
	}

	@Test
	@DisplayName("Record 3033: LastName is Peery")
	void LastNameOfRecord3033() {
		assertEquals("Peery", customers.get(3032).getLastName());
	}

	@Test
	@DisplayName("Record 3033: Company is Bennys Maine Seafood")
	void CompanyOfRecord3033() {
		assertEquals("Bennys Maine Seafood", customers.get(3032).getCompany());
	}

	@Test
	@DisplayName("Record 3033: Address is 108 Jetport Rd")
	void AddressOfRecord3033() {
		assertEquals("108 Jetport Rd", customers.get(3032).getAddress());
	}

	@Test
	@DisplayName("Record 3033: City is Pearl")
	void CityOfRecord3033() {
		assertEquals("Pearl", customers.get(3032).getCity());
	}

	@Test
	@DisplayName("Record 3033: County is Rankin")
	void CountyOfRecord3033() {
		assertEquals("Rankin", customers.get(3032).getCounty());
	}

	@Test
	@DisplayName("Record 3033: State is MS")
	void StateOfRecord3033() {
		assertEquals("MS", customers.get(3032).getState());
	}

	@Test
	@DisplayName("Record 3033: ZIP is 39208")
	void ZIPOfRecord3033() {
		assertEquals("39208", customers.get(3032).getZIP());
	}

	@Test
	@DisplayName("Record 3033: Phone is 601-932-5437")
	void PhoneOfRecord3033() {
		assertEquals("601-932-5437", customers.get(3032).getPhone());
	}

	@Test
	@DisplayName("Record 3033: Fax is 601-932-4288")
	void FaxOfRecord3033() {
		assertEquals("601-932-4288", customers.get(3032).getFax());
	}

	@Test
	@DisplayName("Record 3033: Email is esperanza@peery.com")
	void EmailOfRecord3033() {
		assertEquals("esperanza@peery.com", customers.get(3032).getEmail());
	}

	@Test
	@DisplayName("Record 3033: Web is http://www.esperanzapeery.com")
	void WebOfRecord3033() {
		assertEquals("http://www.esperanzapeery.com", customers.get(3032).getWeb());
	}
}
