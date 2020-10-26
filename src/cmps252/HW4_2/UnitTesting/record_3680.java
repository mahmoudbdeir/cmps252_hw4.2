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
class Record_3680 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3680: FirstName is Freddy")
	void FirstNameOfRecord3680() {
		assertEquals("Freddy", customers.get(3679).getFirstName());
	}

	@Test
	@DisplayName("Record 3680: LastName is Leeker")
	void LastNameOfRecord3680() {
		assertEquals("Leeker", customers.get(3679).getLastName());
	}

	@Test
	@DisplayName("Record 3680: Company is Hays Daily News")
	void CompanyOfRecord3680() {
		assertEquals("Hays Daily News", customers.get(3679).getCompany());
	}

	@Test
	@DisplayName("Record 3680: Address is Box #-724")
	void AddressOfRecord3680() {
		assertEquals("Box #-724", customers.get(3679).getAddress());
	}

	@Test
	@DisplayName("Record 3680: City is Inverness")
	void CityOfRecord3680() {
		assertEquals("Inverness", customers.get(3679).getCity());
	}

	@Test
	@DisplayName("Record 3680: County is Citrus")
	void CountyOfRecord3680() {
		assertEquals("Citrus", customers.get(3679).getCounty());
	}

	@Test
	@DisplayName("Record 3680: State is FL")
	void StateOfRecord3680() {
		assertEquals("FL", customers.get(3679).getState());
	}

	@Test
	@DisplayName("Record 3680: ZIP is 34451")
	void ZIPOfRecord3680() {
		assertEquals("34451", customers.get(3679).getZIP());
	}

	@Test
	@DisplayName("Record 3680: Phone is 352-726-9249")
	void PhoneOfRecord3680() {
		assertEquals("352-726-9249", customers.get(3679).getPhone());
	}

	@Test
	@DisplayName("Record 3680: Fax is 352-726-4371")
	void FaxOfRecord3680() {
		assertEquals("352-726-4371", customers.get(3679).getFax());
	}

	@Test
	@DisplayName("Record 3680: Email is freddy@leeker.com")
	void EmailOfRecord3680() {
		assertEquals("freddy@leeker.com", customers.get(3679).getEmail());
	}

	@Test
	@DisplayName("Record 3680: Web is http://www.freddyleeker.com")
	void WebOfRecord3680() {
		assertEquals("http://www.freddyleeker.com", customers.get(3679).getWeb());
	}
}
