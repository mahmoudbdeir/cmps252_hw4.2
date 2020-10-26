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

@Tag("0")
class Record_3873 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3873: FirstName is Salvador")
	void FirstNameOfRecord3873() {
		assertEquals("Salvador", customers.get(3872).getFirstName());
	}

	@Test
	@DisplayName("Record 3873: LastName is Rudy")
	void LastNameOfRecord3873() {
		assertEquals("Rudy", customers.get(3872).getLastName());
	}

	@Test
	@DisplayName("Record 3873: Company is United Marble & Mica Ltd")
	void CompanyOfRecord3873() {
		assertEquals("United Marble & Mica Ltd", customers.get(3872).getCompany());
	}

	@Test
	@DisplayName("Record 3873: Address is 588 Court St")
	void AddressOfRecord3873() {
		assertEquals("588 Court St", customers.get(3872).getAddress());
	}

	@Test
	@DisplayName("Record 3873: City is Brooklyn")
	void CityOfRecord3873() {
		assertEquals("Brooklyn", customers.get(3872).getCity());
	}

	@Test
	@DisplayName("Record 3873: County is Kings")
	void CountyOfRecord3873() {
		assertEquals("Kings", customers.get(3872).getCounty());
	}

	@Test
	@DisplayName("Record 3873: State is NY")
	void StateOfRecord3873() {
		assertEquals("NY", customers.get(3872).getState());
	}

	@Test
	@DisplayName("Record 3873: ZIP is 11231")
	void ZIPOfRecord3873() {
		assertEquals("11231", customers.get(3872).getZIP());
	}

	@Test
	@DisplayName("Record 3873: Phone is 718-645-8967")
	void PhoneOfRecord3873() {
		assertEquals("718-645-8967", customers.get(3872).getPhone());
	}

	@Test
	@DisplayName("Record 3873: Fax is 718-645-0653")
	void FaxOfRecord3873() {
		assertEquals("718-645-0653", customers.get(3872).getFax());
	}

	@Test
	@DisplayName("Record 3873: Email is salvador@rudy.com")
	void EmailOfRecord3873() {
		assertEquals("salvador@rudy.com", customers.get(3872).getEmail());
	}

	@Test
	@DisplayName("Record 3873: Web is http://www.salvadorrudy.com")
	void WebOfRecord3873() {
		assertEquals("http://www.salvadorrudy.com", customers.get(3872).getWeb());
	}
}
