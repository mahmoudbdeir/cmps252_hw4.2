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

@Tag("13")
class Record_2179 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2179: FirstName is Marisol")
	void FirstNameOfRecord2179() {
		assertEquals("Marisol", customers.get(2178).getFirstName());
	}

	@Test
	@DisplayName("Record 2179: LastName is Townes")
	void LastNameOfRecord2179() {
		assertEquals("Townes", customers.get(2178).getLastName());
	}

	@Test
	@DisplayName("Record 2179: Company is Tex Pack")
	void CompanyOfRecord2179() {
		assertEquals("Tex Pack", customers.get(2178).getCompany());
	}

	@Test
	@DisplayName("Record 2179: Address is 52 A O Smith Rd")
	void AddressOfRecord2179() {
		assertEquals("52 A O Smith Rd", customers.get(2178).getAddress());
	}

	@Test
	@DisplayName("Record 2179: City is Milan")
	void CityOfRecord2179() {
		assertEquals("Milan", customers.get(2178).getCity());
	}

	@Test
	@DisplayName("Record 2179: County is Gibson")
	void CountyOfRecord2179() {
		assertEquals("Gibson", customers.get(2178).getCounty());
	}

	@Test
	@DisplayName("Record 2179: State is TN")
	void StateOfRecord2179() {
		assertEquals("TN", customers.get(2178).getState());
	}

	@Test
	@DisplayName("Record 2179: ZIP is 38358")
	void ZIPOfRecord2179() {
		assertEquals("38358", customers.get(2178).getZIP());
	}

	@Test
	@DisplayName("Record 2179: Phone is 731-686-1365")
	void PhoneOfRecord2179() {
		assertEquals("731-686-1365", customers.get(2178).getPhone());
	}

	@Test
	@DisplayName("Record 2179: Fax is 731-686-5293")
	void FaxOfRecord2179() {
		assertEquals("731-686-5293", customers.get(2178).getFax());
	}

	@Test
	@DisplayName("Record 2179: Email is marisol@townes.com")
	void EmailOfRecord2179() {
		assertEquals("marisol@townes.com", customers.get(2178).getEmail());
	}

	@Test
	@DisplayName("Record 2179: Web is http://www.marisoltownes.com")
	void WebOfRecord2179() {
		assertEquals("http://www.marisoltownes.com", customers.get(2178).getWeb());
	}
}
