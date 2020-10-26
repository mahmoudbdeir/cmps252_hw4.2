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
class Record_2265 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2265: FirstName is Stefanie")
	void FirstNameOfRecord2265() {
		assertEquals("Stefanie", customers.get(2264).getFirstName());
	}

	@Test
	@DisplayName("Record 2265: LastName is Skutnik")
	void LastNameOfRecord2265() {
		assertEquals("Skutnik", customers.get(2264).getLastName());
	}

	@Test
	@DisplayName("Record 2265: Company is Tanis, Paul H Jr")
	void CompanyOfRecord2265() {
		assertEquals("Tanis, Paul H Jr", customers.get(2264).getCompany());
	}

	@Test
	@DisplayName("Record 2265: Address is Routes")
	void AddressOfRecord2265() {
		assertEquals("Routes", customers.get(2264).getAddress());
	}

	@Test
	@DisplayName("Record 2265: City is Clarks Summit")
	void CityOfRecord2265() {
		assertEquals("Clarks Summit", customers.get(2264).getCity());
	}

	@Test
	@DisplayName("Record 2265: County is Lackawanna")
	void CountyOfRecord2265() {
		assertEquals("Lackawanna", customers.get(2264).getCounty());
	}

	@Test
	@DisplayName("Record 2265: State is PA")
	void StateOfRecord2265() {
		assertEquals("PA", customers.get(2264).getState());
	}

	@Test
	@DisplayName("Record 2265: ZIP is 18411")
	void ZIPOfRecord2265() {
		assertEquals("18411", customers.get(2264).getZIP());
	}

	@Test
	@DisplayName("Record 2265: Phone is 570-586-6637")
	void PhoneOfRecord2265() {
		assertEquals("570-586-6637", customers.get(2264).getPhone());
	}

	@Test
	@DisplayName("Record 2265: Fax is 570-586-1081")
	void FaxOfRecord2265() {
		assertEquals("570-586-1081", customers.get(2264).getFax());
	}

	@Test
	@DisplayName("Record 2265: Email is stefanie@skutnik.com")
	void EmailOfRecord2265() {
		assertEquals("stefanie@skutnik.com", customers.get(2264).getEmail());
	}

	@Test
	@DisplayName("Record 2265: Web is http://www.stefanieskutnik.com")
	void WebOfRecord2265() {
		assertEquals("http://www.stefanieskutnik.com", customers.get(2264).getWeb());
	}
}
