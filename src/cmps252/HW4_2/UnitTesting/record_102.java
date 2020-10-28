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

@Tag("24")
class Record_102 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 102: FirstName is Marcel")
	void FirstNameOfRecord102() {
		assertEquals("Marcel", customers.get(101).getFirstName());
	}

	@Test
	@DisplayName("Record 102: LastName is Kolodziej")
	void LastNameOfRecord102() {
		assertEquals("Kolodziej", customers.get(101).getLastName());
	}

	@Test
	@DisplayName("Record 102: Company is Harvill, F Evans Esq")
	void CompanyOfRecord102() {
		assertEquals("Harvill, F Evans Esq", customers.get(101).getCompany());
	}

	@Test
	@DisplayName("Record 102: Address is 560 Allyn St")
	void AddressOfRecord102() {
		assertEquals("560 Allyn St", customers.get(101).getAddress());
	}

	@Test
	@DisplayName("Record 102: City is Akron")
	void CityOfRecord102() {
		assertEquals("Akron", customers.get(101).getCity());
	}

	@Test
	@DisplayName("Record 102: County is Summit")
	void CountyOfRecord102() {
		assertEquals("Summit", customers.get(101).getCountry());
	}

	@Test
	@DisplayName("Record 102: State is OH")
	void StateOfRecord102() {
		assertEquals("OH", customers.get(101).getState());
	}

	@Test
	@DisplayName("Record 102: ZIP is 44311")
	void ZIPOfRecord102() {
		assertEquals("44311", customers.get(101).getZIP());
	}

	@Test
	@DisplayName("Record 102: Phone is 330-535-4097")
	void PhoneOfRecord102() {
		assertEquals("330-535-4097", customers.get(101).getPhone());
	}

	@Test
	@DisplayName("Record 102: Fax is 330-535-8447")
	void FaxOfRecord102() {
		assertEquals("330-535-8447", customers.get(101).getFax());
	}

	@Test
	@DisplayName("Record 102: Email is marcel@kolodziej.com")
	void EmailOfRecord102() {
		assertEquals("marcel@kolodziej.com", customers.get(101).getEmail());
	}

	@Test
	@DisplayName("Record 102: Web is http://www.marcelkolodziej.com")
	void WebOfRecord102() {
		assertEquals("http://www.marcelkolodziej.com", customers.get(101).getWeb());
	}
}
