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
class Record_2956 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2956: FirstName is Chang")
	void FirstNameOfRecord2956() {
		assertEquals("Chang", customers.get(2955).getFirstName());
	}

	@Test
	@DisplayName("Record 2956: LastName is Tramell")
	void LastNameOfRecord2956() {
		assertEquals("Tramell", customers.get(2955).getLastName());
	}

	@Test
	@DisplayName("Record 2956: Company is Sandy Point Inn")
	void CompanyOfRecord2956() {
		assertEquals("Sandy Point Inn", customers.get(2955).getCompany());
	}

	@Test
	@DisplayName("Record 2956: Address is 7308 Saint Claude Ave")
	void AddressOfRecord2956() {
		assertEquals("7308 Saint Claude Ave", customers.get(2955).getAddress());
	}

	@Test
	@DisplayName("Record 2956: City is Arabi")
	void CityOfRecord2956() {
		assertEquals("Arabi", customers.get(2955).getCity());
	}

	@Test
	@DisplayName("Record 2956: County is Saint Bernard")
	void CountyOfRecord2956() {
		assertEquals("Saint Bernard", customers.get(2955).getCounty());
	}

	@Test
	@DisplayName("Record 2956: State is LA")
	void StateOfRecord2956() {
		assertEquals("LA", customers.get(2955).getState());
	}

	@Test
	@DisplayName("Record 2956: ZIP is 70032")
	void ZIPOfRecord2956() {
		assertEquals("70032", customers.get(2955).getZIP());
	}

	@Test
	@DisplayName("Record 2956: Phone is 504-277-6803")
	void PhoneOfRecord2956() {
		assertEquals("504-277-6803", customers.get(2955).getPhone());
	}

	@Test
	@DisplayName("Record 2956: Fax is 504-277-7882")
	void FaxOfRecord2956() {
		assertEquals("504-277-7882", customers.get(2955).getFax());
	}

	@Test
	@DisplayName("Record 2956: Email is chang@tramell.com")
	void EmailOfRecord2956() {
		assertEquals("chang@tramell.com", customers.get(2955).getEmail());
	}

	@Test
	@DisplayName("Record 2956: Web is http://www.changtramell.com")
	void WebOfRecord2956() {
		assertEquals("http://www.changtramell.com", customers.get(2955).getWeb());
	}
}
