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

@Tag("22")
class Record_4018 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4018: FirstName is Marlin")
	void FirstNameOfRecord4018() {
		assertEquals("Marlin", customers.get(4017).getFirstName());
	}

	@Test
	@DisplayName("Record 4018: LastName is Cicconi")
	void LastNameOfRecord4018() {
		assertEquals("Cicconi", customers.get(4017).getLastName());
	}

	@Test
	@DisplayName("Record 4018: Company is Burnett, J A Cpa")
	void CompanyOfRecord4018() {
		assertEquals("Burnett, J A Cpa", customers.get(4017).getCompany());
	}

	@Test
	@DisplayName("Record 4018: Address is 1234 N 4th St")
	void AddressOfRecord4018() {
		assertEquals("1234 N 4th St", customers.get(4017).getAddress());
	}

	@Test
	@DisplayName("Record 4018: City is Abilene")
	void CityOfRecord4018() {
		assertEquals("Abilene", customers.get(4017).getCity());
	}

	@Test
	@DisplayName("Record 4018: County is Taylor")
	void CountyOfRecord4018() {
		assertEquals("Taylor", customers.get(4017).getCounty());
	}

	@Test
	@DisplayName("Record 4018: State is TX")
	void StateOfRecord4018() {
		assertEquals("TX", customers.get(4017).getState());
	}

	@Test
	@DisplayName("Record 4018: ZIP is 79601")
	void ZIPOfRecord4018() {
		assertEquals("79601", customers.get(4017).getZIP());
	}

	@Test
	@DisplayName("Record 4018: Phone is 325-677-5721")
	void PhoneOfRecord4018() {
		assertEquals("325-677-5721", customers.get(4017).getPhone());
	}

	@Test
	@DisplayName("Record 4018: Fax is 325-677-3531")
	void FaxOfRecord4018() {
		assertEquals("325-677-3531", customers.get(4017).getFax());
	}

	@Test
	@DisplayName("Record 4018: Email is marlin@cicconi.com")
	void EmailOfRecord4018() {
		assertEquals("marlin@cicconi.com", customers.get(4017).getEmail());
	}

	@Test
	@DisplayName("Record 4018: Web is http://www.marlincicconi.com")
	void WebOfRecord4018() {
		assertEquals("http://www.marlincicconi.com", customers.get(4017).getWeb());
	}
}
