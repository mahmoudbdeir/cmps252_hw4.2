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
class Record_4019 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4019: FirstName is Rita")
	void FirstNameOfRecord4019() {
		assertEquals("Rita", customers.get(4018).getFirstName());
	}

	@Test
	@DisplayName("Record 4019: LastName is Wolbeck")
	void LastNameOfRecord4019() {
		assertEquals("Wolbeck", customers.get(4018).getLastName());
	}

	@Test
	@DisplayName("Record 4019: Company is Naxos Of America Inc")
	void CompanyOfRecord4019() {
		assertEquals("Naxos Of America Inc", customers.get(4018).getCompany());
	}

	@Test
	@DisplayName("Record 4019: Address is 2025 Industrial Blvd")
	void AddressOfRecord4019() {
		assertEquals("2025 Industrial Blvd", customers.get(4018).getAddress());
	}

	@Test
	@DisplayName("Record 4019: City is Abilene")
	void CityOfRecord4019() {
		assertEquals("Abilene", customers.get(4018).getCity());
	}

	@Test
	@DisplayName("Record 4019: County is Taylor")
	void CountyOfRecord4019() {
		assertEquals("Taylor", customers.get(4018).getCounty());
	}

	@Test
	@DisplayName("Record 4019: State is TX")
	void StateOfRecord4019() {
		assertEquals("TX", customers.get(4018).getState());
	}

	@Test
	@DisplayName("Record 4019: ZIP is 79602")
	void ZIPOfRecord4019() {
		assertEquals("79602", customers.get(4018).getZIP());
	}

	@Test
	@DisplayName("Record 4019: Phone is 325-695-6887")
	void PhoneOfRecord4019() {
		assertEquals("325-695-6887", customers.get(4018).getPhone());
	}

	@Test
	@DisplayName("Record 4019: Fax is 325-695-4226")
	void FaxOfRecord4019() {
		assertEquals("325-695-4226", customers.get(4018).getFax());
	}

	@Test
	@DisplayName("Record 4019: Email is rita@wolbeck.com")
	void EmailOfRecord4019() {
		assertEquals("rita@wolbeck.com", customers.get(4018).getEmail());
	}

	@Test
	@DisplayName("Record 4019: Web is http://www.ritawolbeck.com")
	void WebOfRecord4019() {
		assertEquals("http://www.ritawolbeck.com", customers.get(4018).getWeb());
	}
}
