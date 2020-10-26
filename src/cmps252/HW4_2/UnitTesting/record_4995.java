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
class Record_4995 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4995: FirstName is Cora")
	void FirstNameOfRecord4995() {
		assertEquals("Cora", customers.get(4994).getFirstName());
	}

	@Test
	@DisplayName("Record 4995: LastName is Boydston")
	void LastNameOfRecord4995() {
		assertEquals("Boydston", customers.get(4994).getLastName());
	}

	@Test
	@DisplayName("Record 4995: Company is Grosz, Richard W Esq")
	void CompanyOfRecord4995() {
		assertEquals("Grosz, Richard W Esq", customers.get(4994).getCompany());
	}

	@Test
	@DisplayName("Record 4995: Address is 555 Van Reed Rd")
	void AddressOfRecord4995() {
		assertEquals("555 Van Reed Rd", customers.get(4994).getAddress());
	}

	@Test
	@DisplayName("Record 4995: City is Reading")
	void CityOfRecord4995() {
		assertEquals("Reading", customers.get(4994).getCity());
	}

	@Test
	@DisplayName("Record 4995: County is Berks")
	void CountyOfRecord4995() {
		assertEquals("Berks", customers.get(4994).getCounty());
	}

	@Test
	@DisplayName("Record 4995: State is PA")
	void StateOfRecord4995() {
		assertEquals("PA", customers.get(4994).getState());
	}

	@Test
	@DisplayName("Record 4995: ZIP is 19610")
	void ZIPOfRecord4995() {
		assertEquals("19610", customers.get(4994).getZIP());
	}

	@Test
	@DisplayName("Record 4995: Phone is 610-378-1813")
	void PhoneOfRecord4995() {
		assertEquals("610-378-1813", customers.get(4994).getPhone());
	}

	@Test
	@DisplayName("Record 4995: Fax is 610-378-2378")
	void FaxOfRecord4995() {
		assertEquals("610-378-2378", customers.get(4994).getFax());
	}

	@Test
	@DisplayName("Record 4995: Email is cora@boydston.com")
	void EmailOfRecord4995() {
		assertEquals("cora@boydston.com", customers.get(4994).getEmail());
	}

	@Test
	@DisplayName("Record 4995: Web is http://www.coraboydston.com")
	void WebOfRecord4995() {
		assertEquals("http://www.coraboydston.com", customers.get(4994).getWeb());
	}
}
