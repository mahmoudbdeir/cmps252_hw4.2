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

@Tag("16")
class Record_3495 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3495: FirstName is Denise")
	void FirstNameOfRecord3495() {
		assertEquals("Denise", customers.get(3494).getFirstName());
	}

	@Test
	@DisplayName("Record 3495: LastName is Bagby")
	void LastNameOfRecord3495() {
		assertEquals("Bagby", customers.get(3494).getLastName());
	}

	@Test
	@DisplayName("Record 3495: Company is Nolte & Associates")
	void CompanyOfRecord3495() {
		assertEquals("Nolte & Associates", customers.get(3494).getCompany());
	}

	@Test
	@DisplayName("Record 3495: Address is 40 Main St")
	void AddressOfRecord3495() {
		assertEquals("40 Main St", customers.get(3494).getAddress());
	}

	@Test
	@DisplayName("Record 3495: City is Ashland")
	void CityOfRecord3495() {
		assertEquals("Ashland", customers.get(3494).getCity());
	}

	@Test
	@DisplayName("Record 3495: County is Middlesex")
	void CountyOfRecord3495() {
		assertEquals("Middlesex", customers.get(3494).getCounty());
	}

	@Test
	@DisplayName("Record 3495: State is MA")
	void StateOfRecord3495() {
		assertEquals("MA", customers.get(3494).getState());
	}

	@Test
	@DisplayName("Record 3495: ZIP is 1721")
	void ZIPOfRecord3495() {
		assertEquals("1721", customers.get(3494).getZIP());
	}

	@Test
	@DisplayName("Record 3495: Phone is 508-881-5809")
	void PhoneOfRecord3495() {
		assertEquals("508-881-5809", customers.get(3494).getPhone());
	}

	@Test
	@DisplayName("Record 3495: Fax is 508-881-2966")
	void FaxOfRecord3495() {
		assertEquals("508-881-2966", customers.get(3494).getFax());
	}

	@Test
	@DisplayName("Record 3495: Email is denise@bagby.com")
	void EmailOfRecord3495() {
		assertEquals("denise@bagby.com", customers.get(3494).getEmail());
	}

	@Test
	@DisplayName("Record 3495: Web is http://www.denisebagby.com")
	void WebOfRecord3495() {
		assertEquals("http://www.denisebagby.com", customers.get(3494).getWeb());
	}
}
