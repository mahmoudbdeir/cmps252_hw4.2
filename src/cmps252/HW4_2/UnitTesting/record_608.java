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

@Tag("10")
class Record_608 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 608: FirstName is Lacy")
	void FirstNameOfRecord608() {
		assertEquals("Lacy", customers.get(607).getFirstName());
	}

	@Test
	@DisplayName("Record 608: LastName is Fawson")
	void LastNameOfRecord608() {
		assertEquals("Fawson", customers.get(607).getLastName());
	}

	@Test
	@DisplayName("Record 608: Company is Mccracken, William R Esq")
	void CompanyOfRecord608() {
		assertEquals("Mccracken, William R Esq", customers.get(607).getCompany());
	}

	@Test
	@DisplayName("Record 608: Address is 396 La Mesa St")
	void AddressOfRecord608() {
		assertEquals("396 La Mesa St", customers.get(607).getAddress());
	}

	@Test
	@DisplayName("Record 608: City is Pomona")
	void CityOfRecord608() {
		assertEquals("Pomona", customers.get(607).getCity());
	}

	@Test
	@DisplayName("Record 608: County is Los Angeles")
	void CountyOfRecord608() {
		assertEquals("Los Angeles", customers.get(607).getCounty());
	}

	@Test
	@DisplayName("Record 608: State is CA")
	void StateOfRecord608() {
		assertEquals("CA", customers.get(607).getState());
	}

	@Test
	@DisplayName("Record 608: ZIP is 91766")
	void ZIPOfRecord608() {
		assertEquals("91766", customers.get(607).getZIP());
	}

	@Test
	@DisplayName("Record 608: Phone is 909-623-5204")
	void PhoneOfRecord608() {
		assertEquals("909-623-5204", customers.get(607).getPhone());
	}

	@Test
	@DisplayName("Record 608: Fax is 909-623-2792")
	void FaxOfRecord608() {
		assertEquals("909-623-2792", customers.get(607).getFax());
	}

	@Test
	@DisplayName("Record 608: Email is lacy@fawson.com")
	void EmailOfRecord608() {
		assertEquals("lacy@fawson.com", customers.get(607).getEmail());
	}

	@Test
	@DisplayName("Record 608: Web is http://www.lacyfawson.com")
	void WebOfRecord608() {
		assertEquals("http://www.lacyfawson.com", customers.get(607).getWeb());
	}
}
