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

@Tag("18")
class Record_690 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 690: FirstName is Garland")
	void FirstNameOfRecord690() {
		assertEquals("Garland", customers.get(689).getFirstName());
	}

	@Test
	@DisplayName("Record 690: LastName is Seaborn")
	void LastNameOfRecord690() {
		assertEquals("Seaborn", customers.get(689).getLastName());
	}

	@Test
	@DisplayName("Record 690: Company is Kdsm Fox 17")
	void CompanyOfRecord690() {
		assertEquals("Kdsm Fox 17", customers.get(689).getCompany());
	}

	@Test
	@DisplayName("Record 690: Address is 2630 S Virginia St")
	void AddressOfRecord690() {
		assertEquals("2630 S Virginia St", customers.get(689).getAddress());
	}

	@Test
	@DisplayName("Record 690: City is Reno")
	void CityOfRecord690() {
		assertEquals("Reno", customers.get(689).getCity());
	}

	@Test
	@DisplayName("Record 690: County is Washoe")
	void CountyOfRecord690() {
		assertEquals("Washoe", customers.get(689).getCounty());
	}

	@Test
	@DisplayName("Record 690: State is NV")
	void StateOfRecord690() {
		assertEquals("NV", customers.get(689).getState());
	}

	@Test
	@DisplayName("Record 690: ZIP is 89502")
	void ZIPOfRecord690() {
		assertEquals("89502", customers.get(689).getZIP());
	}

	@Test
	@DisplayName("Record 690: Phone is 775-828-8053")
	void PhoneOfRecord690() {
		assertEquals("775-828-8053", customers.get(689).getPhone());
	}

	@Test
	@DisplayName("Record 690: Fax is 775-828-2253")
	void FaxOfRecord690() {
		assertEquals("775-828-2253", customers.get(689).getFax());
	}

	@Test
	@DisplayName("Record 690: Email is garland@seaborn.com")
	void EmailOfRecord690() {
		assertEquals("garland@seaborn.com", customers.get(689).getEmail());
	}

	@Test
	@DisplayName("Record 690: Web is http://www.garlandseaborn.com")
	void WebOfRecord690() {
		assertEquals("http://www.garlandseaborn.com", customers.get(689).getWeb());
	}
}
