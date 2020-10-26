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

@Tag("19")
class Record_3618 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3618: FirstName is Arthur")
	void FirstNameOfRecord3618() {
		assertEquals("Arthur", customers.get(3617).getFirstName());
	}

	@Test
	@DisplayName("Record 3618: LastName is Jarrett")
	void LastNameOfRecord3618() {
		assertEquals("Jarrett", customers.get(3617).getLastName());
	}

	@Test
	@DisplayName("Record 3618: Company is Pinsky & Skandalis")
	void CompanyOfRecord3618() {
		assertEquals("Pinsky & Skandalis", customers.get(3617).getCompany());
	}

	@Test
	@DisplayName("Record 3618: Address is 1 Monarch Pl")
	void AddressOfRecord3618() {
		assertEquals("1 Monarch Pl", customers.get(3617).getAddress());
	}

	@Test
	@DisplayName("Record 3618: City is Springfield")
	void CityOfRecord3618() {
		assertEquals("Springfield", customers.get(3617).getCity());
	}

	@Test
	@DisplayName("Record 3618: County is Hampden")
	void CountyOfRecord3618() {
		assertEquals("Hampden", customers.get(3617).getCounty());
	}

	@Test
	@DisplayName("Record 3618: State is MA")
	void StateOfRecord3618() {
		assertEquals("MA", customers.get(3617).getState());
	}

	@Test
	@DisplayName("Record 3618: ZIP is 1144")
	void ZIPOfRecord3618() {
		assertEquals("1144", customers.get(3617).getZIP());
	}

	@Test
	@DisplayName("Record 3618: Phone is 413-787-6720")
	void PhoneOfRecord3618() {
		assertEquals("413-787-6720", customers.get(3617).getPhone());
	}

	@Test
	@DisplayName("Record 3618: Fax is 413-787-2469")
	void FaxOfRecord3618() {
		assertEquals("413-787-2469", customers.get(3617).getFax());
	}

	@Test
	@DisplayName("Record 3618: Email is arthur@jarrett.com")
	void EmailOfRecord3618() {
		assertEquals("arthur@jarrett.com", customers.get(3617).getEmail());
	}

	@Test
	@DisplayName("Record 3618: Web is http://www.arthurjarrett.com")
	void WebOfRecord3618() {
		assertEquals("http://www.arthurjarrett.com", customers.get(3617).getWeb());
	}
}
