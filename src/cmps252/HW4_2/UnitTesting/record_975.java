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

@Tag("43")
class Record_975 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 975: FirstName is Andre")
	void FirstNameOfRecord975() {
		assertEquals("Andre", customers.get(974).getFirstName());
	}

	@Test
	@DisplayName("Record 975: LastName is Ribble")
	void LastNameOfRecord975() {
		assertEquals("Ribble", customers.get(974).getLastName());
	}

	@Test
	@DisplayName("Record 975: Company is American Hackney Horse Society")
	void CompanyOfRecord975() {
		assertEquals("American Hackney Horse Society", customers.get(974).getCompany());
	}

	@Test
	@DisplayName("Record 975: Address is 900 Grand St")
	void AddressOfRecord975() {
		assertEquals("900 Grand St", customers.get(974).getAddress());
	}

	@Test
	@DisplayName("Record 975: City is Brooklyn")
	void CityOfRecord975() {
		assertEquals("Brooklyn", customers.get(974).getCity());
	}

	@Test
	@DisplayName("Record 975: County is Kings")
	void CountyOfRecord975() {
		assertEquals("Kings", customers.get(974).getCounty());
	}

	@Test
	@DisplayName("Record 975: State is NY")
	void StateOfRecord975() {
		assertEquals("NY", customers.get(974).getState());
	}

	@Test
	@DisplayName("Record 975: ZIP is 11211")
	void ZIPOfRecord975() {
		assertEquals("11211", customers.get(974).getZIP());
	}

	@Test
	@DisplayName("Record 975: Phone is 718-782-2065")
	void PhoneOfRecord975() {
		assertEquals("718-782-2065", customers.get(974).getPhone());
	}

	@Test
	@DisplayName("Record 975: Fax is 718-782-0036")
	void FaxOfRecord975() {
		assertEquals("718-782-0036", customers.get(974).getFax());
	}

	@Test
	@DisplayName("Record 975: Email is andre@ribble.com")
	void EmailOfRecord975() {
		assertEquals("andre@ribble.com", customers.get(974).getEmail());
	}

	@Test
	@DisplayName("Record 975: Web is http://www.andreribble.com")
	void WebOfRecord975() {
		assertEquals("http://www.andreribble.com", customers.get(974).getWeb());
	}
}
