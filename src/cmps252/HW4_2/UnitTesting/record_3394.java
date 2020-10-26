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

@Tag("31")
class Record_3394 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3394: FirstName is Christen")
	void FirstNameOfRecord3394() {
		assertEquals("Christen", customers.get(3393).getFirstName());
	}

	@Test
	@DisplayName("Record 3394: LastName is Meachum")
	void LastNameOfRecord3394() {
		assertEquals("Meachum", customers.get(3393).getLastName());
	}

	@Test
	@DisplayName("Record 3394: Company is West Michigan Poured Walls Inc")
	void CompanyOfRecord3394() {
		assertEquals("West Michigan Poured Walls Inc", customers.get(3393).getCompany());
	}

	@Test
	@DisplayName("Record 3394: Address is 1451 Drum Hill Rd")
	void AddressOfRecord3394() {
		assertEquals("1451 Drum Hill Rd", customers.get(3393).getAddress());
	}

	@Test
	@DisplayName("Record 3394: City is Martinsville")
	void CityOfRecord3394() {
		assertEquals("Martinsville", customers.get(3393).getCity());
	}

	@Test
	@DisplayName("Record 3394: County is Somerset")
	void CountyOfRecord3394() {
		assertEquals("Somerset", customers.get(3393).getCounty());
	}

	@Test
	@DisplayName("Record 3394: State is NJ")
	void StateOfRecord3394() {
		assertEquals("NJ", customers.get(3393).getState());
	}

	@Test
	@DisplayName("Record 3394: ZIP is 8836")
	void ZIPOfRecord3394() {
		assertEquals("8836", customers.get(3393).getZIP());
	}

	@Test
	@DisplayName("Record 3394: Phone is 908-271-4054")
	void PhoneOfRecord3394() {
		assertEquals("908-271-4054", customers.get(3393).getPhone());
	}

	@Test
	@DisplayName("Record 3394: Fax is 908-271-5368")
	void FaxOfRecord3394() {
		assertEquals("908-271-5368", customers.get(3393).getFax());
	}

	@Test
	@DisplayName("Record 3394: Email is christen@meachum.com")
	void EmailOfRecord3394() {
		assertEquals("christen@meachum.com", customers.get(3393).getEmail());
	}

	@Test
	@DisplayName("Record 3394: Web is http://www.christenmeachum.com")
	void WebOfRecord3394() {
		assertEquals("http://www.christenmeachum.com", customers.get(3393).getWeb());
	}
}
