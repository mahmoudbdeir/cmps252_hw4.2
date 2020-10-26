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

@Tag("16")
class Record_1801 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1801: FirstName is Edna")
	void FirstNameOfRecord1801() {
		assertEquals("Edna", customers.get(1800).getFirstName());
	}

	@Test
	@DisplayName("Record 1801: LastName is Lights")
	void LastNameOfRecord1801() {
		assertEquals("Lights", customers.get(1800).getLastName());
	}

	@Test
	@DisplayName("Record 1801: Company is Peppinos Ristorante")
	void CompanyOfRecord1801() {
		assertEquals("Peppinos Ristorante", customers.get(1800).getCompany());
	}

	@Test
	@DisplayName("Record 1801: Address is 184 Kent Ave")
	void AddressOfRecord1801() {
		assertEquals("184 Kent Ave", customers.get(1800).getAddress());
	}

	@Test
	@DisplayName("Record 1801: City is Brooklyn")
	void CityOfRecord1801() {
		assertEquals("Brooklyn", customers.get(1800).getCity());
	}

	@Test
	@DisplayName("Record 1801: County is Kings")
	void CountyOfRecord1801() {
		assertEquals("Kings", customers.get(1800).getCounty());
	}

	@Test
	@DisplayName("Record 1801: State is NY")
	void StateOfRecord1801() {
		assertEquals("NY", customers.get(1800).getState());
	}

	@Test
	@DisplayName("Record 1801: ZIP is 11211")
	void ZIPOfRecord1801() {
		assertEquals("11211", customers.get(1800).getZIP());
	}

	@Test
	@DisplayName("Record 1801: Phone is 718-387-2537")
	void PhoneOfRecord1801() {
		assertEquals("718-387-2537", customers.get(1800).getPhone());
	}

	@Test
	@DisplayName("Record 1801: Fax is 718-387-1352")
	void FaxOfRecord1801() {
		assertEquals("718-387-1352", customers.get(1800).getFax());
	}

	@Test
	@DisplayName("Record 1801: Email is edna@lights.com")
	void EmailOfRecord1801() {
		assertEquals("edna@lights.com", customers.get(1800).getEmail());
	}

	@Test
	@DisplayName("Record 1801: Web is http://www.ednalights.com")
	void WebOfRecord1801() {
		assertEquals("http://www.ednalights.com", customers.get(1800).getWeb());
	}
}
