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

@Tag("28")
class Record_4590 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4590: FirstName is Simone")
	void FirstNameOfRecord4590() {
		assertEquals("Simone", customers.get(4589).getFirstName());
	}

	@Test
	@DisplayName("Record 4590: LastName is Muhn")
	void LastNameOfRecord4590() {
		assertEquals("Muhn", customers.get(4589).getLastName());
	}

	@Test
	@DisplayName("Record 4590: Company is Holiday Inn")
	void CompanyOfRecord4590() {
		assertEquals("Holiday Inn", customers.get(4589).getCompany());
	}

	@Test
	@DisplayName("Record 4590: Address is 9140 Academy Rd")
	void AddressOfRecord4590() {
		assertEquals("9140 Academy Rd", customers.get(4589).getAddress());
	}

	@Test
	@DisplayName("Record 4590: City is Philadelphia")
	void CityOfRecord4590() {
		assertEquals("Philadelphia", customers.get(4589).getCity());
	}

	@Test
	@DisplayName("Record 4590: County is Philadelphia")
	void CountyOfRecord4590() {
		assertEquals("Philadelphia", customers.get(4589).getCounty());
	}

	@Test
	@DisplayName("Record 4590: State is PA")
	void StateOfRecord4590() {
		assertEquals("PA", customers.get(4589).getState());
	}

	@Test
	@DisplayName("Record 4590: ZIP is 19114")
	void ZIPOfRecord4590() {
		assertEquals("19114", customers.get(4589).getZIP());
	}

	@Test
	@DisplayName("Record 4590: Phone is 215-335-3789")
	void PhoneOfRecord4590() {
		assertEquals("215-335-3789", customers.get(4589).getPhone());
	}

	@Test
	@DisplayName("Record 4590: Fax is 215-335-8674")
	void FaxOfRecord4590() {
		assertEquals("215-335-8674", customers.get(4589).getFax());
	}

	@Test
	@DisplayName("Record 4590: Email is simone@muhn.com")
	void EmailOfRecord4590() {
		assertEquals("simone@muhn.com", customers.get(4589).getEmail());
	}

	@Test
	@DisplayName("Record 4590: Web is http://www.simonemuhn.com")
	void WebOfRecord4590() {
		assertEquals("http://www.simonemuhn.com", customers.get(4589).getWeb());
	}
}
