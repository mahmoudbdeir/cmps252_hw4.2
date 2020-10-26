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

@Tag("34")
class Record_3990 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3990: FirstName is Miriam")
	void FirstNameOfRecord3990() {
		assertEquals("Miriam", customers.get(3989).getFirstName());
	}

	@Test
	@DisplayName("Record 3990: LastName is Maltby")
	void LastNameOfRecord3990() {
		assertEquals("Maltby", customers.get(3989).getLastName());
	}

	@Test
	@DisplayName("Record 3990: Company is Depaul Planning & Design")
	void CompanyOfRecord3990() {
		assertEquals("Depaul Planning & Design", customers.get(3989).getCompany());
	}

	@Test
	@DisplayName("Record 3990: Address is 2704 Market St")
	void AddressOfRecord3990() {
		assertEquals("2704 Market St", customers.get(3989).getAddress());
	}

	@Test
	@DisplayName("Record 3990: City is Aston")
	void CityOfRecord3990() {
		assertEquals("Aston", customers.get(3989).getCity());
	}

	@Test
	@DisplayName("Record 3990: County is Delaware")
	void CountyOfRecord3990() {
		assertEquals("Delaware", customers.get(3989).getCounty());
	}

	@Test
	@DisplayName("Record 3990: State is PA")
	void StateOfRecord3990() {
		assertEquals("PA", customers.get(3989).getState());
	}

	@Test
	@DisplayName("Record 3990: ZIP is 19014")
	void ZIPOfRecord3990() {
		assertEquals("19014", customers.get(3989).getZIP());
	}

	@Test
	@DisplayName("Record 3990: Phone is 610-494-0875")
	void PhoneOfRecord3990() {
		assertEquals("610-494-0875", customers.get(3989).getPhone());
	}

	@Test
	@DisplayName("Record 3990: Fax is 610-494-7307")
	void FaxOfRecord3990() {
		assertEquals("610-494-7307", customers.get(3989).getFax());
	}

	@Test
	@DisplayName("Record 3990: Email is miriam@maltby.com")
	void EmailOfRecord3990() {
		assertEquals("miriam@maltby.com", customers.get(3989).getEmail());
	}

	@Test
	@DisplayName("Record 3990: Web is http://www.miriammaltby.com")
	void WebOfRecord3990() {
		assertEquals("http://www.miriammaltby.com", customers.get(3989).getWeb());
	}
}
