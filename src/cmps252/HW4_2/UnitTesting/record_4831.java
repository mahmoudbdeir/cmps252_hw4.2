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

@Tag("32")
class Record_4831 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4831: FirstName is Corinne")
	void FirstNameOfRecord4831() {
		assertEquals("Corinne", customers.get(4830).getFirstName());
	}

	@Test
	@DisplayName("Record 4831: LastName is Deuink")
	void LastNameOfRecord4831() {
		assertEquals("Deuink", customers.get(4830).getLastName());
	}

	@Test
	@DisplayName("Record 4831: Company is Delmar Enterprises Inc")
	void CompanyOfRecord4831() {
		assertEquals("Delmar Enterprises Inc", customers.get(4830).getCompany());
	}

	@Test
	@DisplayName("Record 4831: Address is 405 W Washington St  #-23")
	void AddressOfRecord4831() {
		assertEquals("405 W Washington St  #-23", customers.get(4830).getAddress());
	}

	@Test
	@DisplayName("Record 4831: City is San Diego")
	void CityOfRecord4831() {
		assertEquals("San Diego", customers.get(4830).getCity());
	}

	@Test
	@DisplayName("Record 4831: County is San Diego")
	void CountyOfRecord4831() {
		assertEquals("San Diego", customers.get(4830).getCounty());
	}

	@Test
	@DisplayName("Record 4831: State is CA")
	void StateOfRecord4831() {
		assertEquals("CA", customers.get(4830).getState());
	}

	@Test
	@DisplayName("Record 4831: ZIP is 92103")
	void ZIPOfRecord4831() {
		assertEquals("92103", customers.get(4830).getZIP());
	}

	@Test
	@DisplayName("Record 4831: Phone is 619-688-2131")
	void PhoneOfRecord4831() {
		assertEquals("619-688-2131", customers.get(4830).getPhone());
	}

	@Test
	@DisplayName("Record 4831: Fax is 619-688-5446")
	void FaxOfRecord4831() {
		assertEquals("619-688-5446", customers.get(4830).getFax());
	}

	@Test
	@DisplayName("Record 4831: Email is corinne@deuink.com")
	void EmailOfRecord4831() {
		assertEquals("corinne@deuink.com", customers.get(4830).getEmail());
	}

	@Test
	@DisplayName("Record 4831: Web is http://www.corinnedeuink.com")
	void WebOfRecord4831() {
		assertEquals("http://www.corinnedeuink.com", customers.get(4830).getWeb());
	}
}
