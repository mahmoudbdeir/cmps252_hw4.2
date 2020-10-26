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

@Tag("20")
class Record_61 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 61: FirstName is Leslie")
	void FirstNameOfRecord61() {
		assertEquals("Leslie", customers.get(60).getFirstName());
	}

	@Test
	@DisplayName("Record 61: LastName is Gestether")
	void LastNameOfRecord61() {
		assertEquals("Gestether", customers.get(60).getLastName());
	}

	@Test
	@DisplayName("Record 61: Company is Inlingua Language Center")
	void CompanyOfRecord61() {
		assertEquals("Inlingua Language Center", customers.get(60).getCompany());
	}

	@Test
	@DisplayName("Record 61: Address is 45 Waldo St")
	void AddressOfRecord61() {
		assertEquals("45 Waldo St", customers.get(60).getAddress());
	}

	@Test
	@DisplayName("Record 61: City is Providence")
	void CityOfRecord61() {
		assertEquals("Providence", customers.get(60).getCity());
	}

	@Test
	@DisplayName("Record 61: County is Providence")
	void CountyOfRecord61() {
		assertEquals("Providence", customers.get(60).getCounty());
	}

	@Test
	@DisplayName("Record 61: State is RI")
	void StateOfRecord61() {
		assertEquals("RI", customers.get(60).getState());
	}

	@Test
	@DisplayName("Record 61: ZIP is 2904")
	void ZIPOfRecord61() {
		assertEquals("2904", customers.get(60).getZIP());
	}

	@Test
	@DisplayName("Record 61: Phone is 401-461-1998")
	void PhoneOfRecord61() {
		assertEquals("401-461-1998", customers.get(60).getPhone());
	}

	@Test
	@DisplayName("Record 61: Fax is 401-461-3586")
	void FaxOfRecord61() {
		assertEquals("401-461-3586", customers.get(60).getFax());
	}

	@Test
	@DisplayName("Record 61: Email is leslie@gestether.com")
	void EmailOfRecord61() {
		assertEquals("leslie@gestether.com", customers.get(60).getEmail());
	}

	@Test
	@DisplayName("Record 61: Web is http://www.lesliegestether.com")
	void WebOfRecord61() {
		assertEquals("http://www.lesliegestether.com", customers.get(60).getWeb());
	}
}
