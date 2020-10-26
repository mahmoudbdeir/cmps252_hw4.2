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

@Tag("11")
class Record_4026 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4026: FirstName is Kirby")
	void FirstNameOfRecord4026() {
		assertEquals("Kirby", customers.get(4025).getFirstName());
	}

	@Test
	@DisplayName("Record 4026: LastName is Zic")
	void LastNameOfRecord4026() {
		assertEquals("Zic", customers.get(4025).getLastName());
	}

	@Test
	@DisplayName("Record 4026: Company is Val U Inn Motel")
	void CompanyOfRecord4026() {
		assertEquals("Val U Inn Motel", customers.get(4025).getCompany());
	}

	@Test
	@DisplayName("Record 4026: Address is 790 Delsea Dr")
	void AddressOfRecord4026() {
		assertEquals("790 Delsea Dr", customers.get(4025).getAddress());
	}

	@Test
	@DisplayName("Record 4026: City is Westville")
	void CityOfRecord4026() {
		assertEquals("Westville", customers.get(4025).getCity());
	}

	@Test
	@DisplayName("Record 4026: County is Gloucester")
	void CountyOfRecord4026() {
		assertEquals("Gloucester", customers.get(4025).getCounty());
	}

	@Test
	@DisplayName("Record 4026: State is NJ")
	void StateOfRecord4026() {
		assertEquals("NJ", customers.get(4025).getState());
	}

	@Test
	@DisplayName("Record 4026: ZIP is 8093")
	void ZIPOfRecord4026() {
		assertEquals("8093", customers.get(4025).getZIP());
	}

	@Test
	@DisplayName("Record 4026: Phone is 856-848-4627")
	void PhoneOfRecord4026() {
		assertEquals("856-848-4627", customers.get(4025).getPhone());
	}

	@Test
	@DisplayName("Record 4026: Fax is 856-848-4834")
	void FaxOfRecord4026() {
		assertEquals("856-848-4834", customers.get(4025).getFax());
	}

	@Test
	@DisplayName("Record 4026: Email is kirby@zic.com")
	void EmailOfRecord4026() {
		assertEquals("kirby@zic.com", customers.get(4025).getEmail());
	}

	@Test
	@DisplayName("Record 4026: Web is http://www.kirbyzic.com")
	void WebOfRecord4026() {
		assertEquals("http://www.kirbyzic.com", customers.get(4025).getWeb());
	}
}
