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
class Record_2840 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2840: FirstName is Eldridge")
	void FirstNameOfRecord2840() {
		assertEquals("Eldridge", customers.get(2839).getFirstName());
	}

	@Test
	@DisplayName("Record 2840: LastName is Wesolick")
	void LastNameOfRecord2840() {
		assertEquals("Wesolick", customers.get(2839).getLastName());
	}

	@Test
	@DisplayName("Record 2840: Company is P N & D Inc Engrg Cnslnts")
	void CompanyOfRecord2840() {
		assertEquals("P N & D Inc Engrg Cnslnts", customers.get(2839).getCompany());
	}

	@Test
	@DisplayName("Record 2840: Address is 15733 Crabbs Branch Way")
	void AddressOfRecord2840() {
		assertEquals("15733 Crabbs Branch Way", customers.get(2839).getAddress());
	}

	@Test
	@DisplayName("Record 2840: City is Derwood")
	void CityOfRecord2840() {
		assertEquals("Derwood", customers.get(2839).getCity());
	}

	@Test
	@DisplayName("Record 2840: County is Montgomery")
	void CountyOfRecord2840() {
		assertEquals("Montgomery", customers.get(2839).getCounty());
	}

	@Test
	@DisplayName("Record 2840: State is MD")
	void StateOfRecord2840() {
		assertEquals("MD", customers.get(2839).getState());
	}

	@Test
	@DisplayName("Record 2840: ZIP is 20855")
	void ZIPOfRecord2840() {
		assertEquals("20855", customers.get(2839).getZIP());
	}

	@Test
	@DisplayName("Record 2840: Phone is 301-921-2399")
	void PhoneOfRecord2840() {
		assertEquals("301-921-2399", customers.get(2839).getPhone());
	}

	@Test
	@DisplayName("Record 2840: Fax is 301-921-9674")
	void FaxOfRecord2840() {
		assertEquals("301-921-9674", customers.get(2839).getFax());
	}

	@Test
	@DisplayName("Record 2840: Email is eldridge@wesolick.com")
	void EmailOfRecord2840() {
		assertEquals("eldridge@wesolick.com", customers.get(2839).getEmail());
	}

	@Test
	@DisplayName("Record 2840: Web is http://www.eldridgewesolick.com")
	void WebOfRecord2840() {
		assertEquals("http://www.eldridgewesolick.com", customers.get(2839).getWeb());
	}
}
