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

@Tag("17")
class Record_1187 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1187: FirstName is Sybil")
	void FirstNameOfRecord1187() {
		assertEquals("Sybil", customers.get(1186).getFirstName());
	}

	@Test
	@DisplayName("Record 1187: LastName is Althauser")
	void LastNameOfRecord1187() {
		assertEquals("Althauser", customers.get(1186).getLastName());
	}

	@Test
	@DisplayName("Record 1187: Company is United National Rnbw Rlty Wa")
	void CompanyOfRecord1187() {
		assertEquals("United National Rnbw Rlty Wa", customers.get(1186).getCompany());
	}

	@Test
	@DisplayName("Record 1187: Address is 8 Craig Rd")
	void AddressOfRecord1187() {
		assertEquals("8 Craig Rd", customers.get(1186).getAddress());
	}

	@Test
	@DisplayName("Record 1187: City is Acton")
	void CityOfRecord1187() {
		assertEquals("Acton", customers.get(1186).getCity());
	}

	@Test
	@DisplayName("Record 1187: County is Middlesex")
	void CountyOfRecord1187() {
		assertEquals("Middlesex", customers.get(1186).getCounty());
	}

	@Test
	@DisplayName("Record 1187: State is MA")
	void StateOfRecord1187() {
		assertEquals("MA", customers.get(1186).getState());
	}

	@Test
	@DisplayName("Record 1187: ZIP is 1720")
	void ZIPOfRecord1187() {
		assertEquals("1720", customers.get(1186).getZIP());
	}

	@Test
	@DisplayName("Record 1187: Phone is 978-635-3227")
	void PhoneOfRecord1187() {
		assertEquals("978-635-3227", customers.get(1186).getPhone());
	}

	@Test
	@DisplayName("Record 1187: Fax is 978-635-3127")
	void FaxOfRecord1187() {
		assertEquals("978-635-3127", customers.get(1186).getFax());
	}

	@Test
	@DisplayName("Record 1187: Email is sybil@althauser.com")
	void EmailOfRecord1187() {
		assertEquals("sybil@althauser.com", customers.get(1186).getEmail());
	}

	@Test
	@DisplayName("Record 1187: Web is http://www.sybilalthauser.com")
	void WebOfRecord1187() {
		assertEquals("http://www.sybilalthauser.com", customers.get(1186).getWeb());
	}
}
