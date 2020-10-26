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

@Tag("7")
class Record_3760 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3760: FirstName is Vaughn")
	void FirstNameOfRecord3760() {
		assertEquals("Vaughn", customers.get(3759).getFirstName());
	}

	@Test
	@DisplayName("Record 3760: LastName is Iodice")
	void LastNameOfRecord3760() {
		assertEquals("Iodice", customers.get(3759).getLastName());
	}

	@Test
	@DisplayName("Record 3760: Company is Prints & Paints Inc")
	void CompanyOfRecord3760() {
		assertEquals("Prints & Paints Inc", customers.get(3759).getCompany());
	}

	@Test
	@DisplayName("Record 3760: Address is 192 Mohonua Pl")
	void AddressOfRecord3760() {
		assertEquals("192 Mohonua Pl", customers.get(3759).getAddress());
	}

	@Test
	@DisplayName("Record 3760: City is Honolulu")
	void CityOfRecord3760() {
		assertEquals("Honolulu", customers.get(3759).getCity());
	}

	@Test
	@DisplayName("Record 3760: County is Honolulu")
	void CountyOfRecord3760() {
		assertEquals("Honolulu", customers.get(3759).getCounty());
	}

	@Test
	@DisplayName("Record 3760: State is HI")
	void StateOfRecord3760() {
		assertEquals("HI", customers.get(3759).getState());
	}

	@Test
	@DisplayName("Record 3760: ZIP is 96819")
	void ZIPOfRecord3760() {
		assertEquals("96819", customers.get(3759).getZIP());
	}

	@Test
	@DisplayName("Record 3760: Phone is 808-848-7990")
	void PhoneOfRecord3760() {
		assertEquals("808-848-7990", customers.get(3759).getPhone());
	}

	@Test
	@DisplayName("Record 3760: Fax is 808-848-9868")
	void FaxOfRecord3760() {
		assertEquals("808-848-9868", customers.get(3759).getFax());
	}

	@Test
	@DisplayName("Record 3760: Email is vaughn@iodice.com")
	void EmailOfRecord3760() {
		assertEquals("vaughn@iodice.com", customers.get(3759).getEmail());
	}

	@Test
	@DisplayName("Record 3760: Web is http://www.vaughniodice.com")
	void WebOfRecord3760() {
		assertEquals("http://www.vaughniodice.com", customers.get(3759).getWeb());
	}
}
