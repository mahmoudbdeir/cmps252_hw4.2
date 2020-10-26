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

@Tag("24")
class Record_4656 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4656: FirstName is Micheal")
	void FirstNameOfRecord4656() {
		assertEquals("Micheal", customers.get(4655).getFirstName());
	}

	@Test
	@DisplayName("Record 4656: LastName is Gorton")
	void LastNameOfRecord4656() {
		assertEquals("Gorton", customers.get(4655).getLastName());
	}

	@Test
	@DisplayName("Record 4656: Company is Mezzo, Louis J")
	void CompanyOfRecord4656() {
		assertEquals("Mezzo, Louis J", customers.get(4655).getCompany());
	}

	@Test
	@DisplayName("Record 4656: Address is 628 Decatur Ave")
	void AddressOfRecord4656() {
		assertEquals("628 Decatur Ave", customers.get(4655).getAddress());
	}

	@Test
	@DisplayName("Record 4656: City is Brooksville")
	void CityOfRecord4656() {
		assertEquals("Brooksville", customers.get(4655).getCity());
	}

	@Test
	@DisplayName("Record 4656: County is Hernando")
	void CountyOfRecord4656() {
		assertEquals("Hernando", customers.get(4655).getCounty());
	}

	@Test
	@DisplayName("Record 4656: State is FL")
	void StateOfRecord4656() {
		assertEquals("FL", customers.get(4655).getState());
	}

	@Test
	@DisplayName("Record 4656: ZIP is 34601")
	void ZIPOfRecord4656() {
		assertEquals("34601", customers.get(4655).getZIP());
	}

	@Test
	@DisplayName("Record 4656: Phone is 352-799-3461")
	void PhoneOfRecord4656() {
		assertEquals("352-799-3461", customers.get(4655).getPhone());
	}

	@Test
	@DisplayName("Record 4656: Fax is 352-799-2881")
	void FaxOfRecord4656() {
		assertEquals("352-799-2881", customers.get(4655).getFax());
	}

	@Test
	@DisplayName("Record 4656: Email is micheal@gorton.com")
	void EmailOfRecord4656() {
		assertEquals("micheal@gorton.com", customers.get(4655).getEmail());
	}

	@Test
	@DisplayName("Record 4656: Web is http://www.michealgorton.com")
	void WebOfRecord4656() {
		assertEquals("http://www.michealgorton.com", customers.get(4655).getWeb());
	}
}
