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

@Tag("12")
class Record_4921 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4921: FirstName is Ollie")
	void FirstNameOfRecord4921() {
		assertEquals("Ollie", customers.get(4920).getFirstName());
	}

	@Test
	@DisplayName("Record 4921: LastName is Fiacco")
	void LastNameOfRecord4921() {
		assertEquals("Fiacco", customers.get(4920).getLastName());
	}

	@Test
	@DisplayName("Record 4921: Company is Mazza Railing Co Inc")
	void CompanyOfRecord4921() {
		assertEquals("Mazza Railing Co Inc", customers.get(4920).getCompany());
	}

	@Test
	@DisplayName("Record 4921: Address is 505 Thornall St")
	void AddressOfRecord4921() {
		assertEquals("505 Thornall St", customers.get(4920).getAddress());
	}

	@Test
	@DisplayName("Record 4921: City is Edison")
	void CityOfRecord4921() {
		assertEquals("Edison", customers.get(4920).getCity());
	}

	@Test
	@DisplayName("Record 4921: County is Middlesex")
	void CountyOfRecord4921() {
		assertEquals("Middlesex", customers.get(4920).getCounty());
	}

	@Test
	@DisplayName("Record 4921: State is NJ")
	void StateOfRecord4921() {
		assertEquals("NJ", customers.get(4920).getState());
	}

	@Test
	@DisplayName("Record 4921: ZIP is 8837")
	void ZIPOfRecord4921() {
		assertEquals("8837", customers.get(4920).getZIP());
	}

	@Test
	@DisplayName("Record 4921: Phone is 732-494-9709")
	void PhoneOfRecord4921() {
		assertEquals("732-494-9709", customers.get(4920).getPhone());
	}

	@Test
	@DisplayName("Record 4921: Fax is 732-494-3383")
	void FaxOfRecord4921() {
		assertEquals("732-494-3383", customers.get(4920).getFax());
	}

	@Test
	@DisplayName("Record 4921: Email is ollie@fiacco.com")
	void EmailOfRecord4921() {
		assertEquals("ollie@fiacco.com", customers.get(4920).getEmail());
	}

	@Test
	@DisplayName("Record 4921: Web is http://www.olliefiacco.com")
	void WebOfRecord4921() {
		assertEquals("http://www.olliefiacco.com", customers.get(4920).getWeb());
	}
}
