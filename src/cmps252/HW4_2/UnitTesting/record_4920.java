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

@Tag("2")
class Record_4920 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4920: FirstName is Sidney")
	void FirstNameOfRecord4920() {
		assertEquals("Sidney", customers.get(4919).getFirstName());
	}

	@Test
	@DisplayName("Record 4920: LastName is Hitch")
	void LastNameOfRecord4920() {
		assertEquals("Hitch", customers.get(4919).getLastName());
	}

	@Test
	@DisplayName("Record 4920: Company is Shryner, J Marlin Esq")
	void CompanyOfRecord4920() {
		assertEquals("Shryner, J Marlin Esq", customers.get(4919).getCompany());
	}

	@Test
	@DisplayName("Record 4920: Address is 6th Stt Paul Stre")
	void AddressOfRecord4920() {
		assertEquals("6th Stt Paul Stre", customers.get(4919).getAddress());
	}

	@Test
	@DisplayName("Record 4920: City is Baltimore")
	void CityOfRecord4920() {
		assertEquals("Baltimore", customers.get(4919).getCity());
	}

	@Test
	@DisplayName("Record 4920: County is Baltimore City")
	void CountyOfRecord4920() {
		assertEquals("Baltimore City", customers.get(4919).getCounty());
	}

	@Test
	@DisplayName("Record 4920: State is MD")
	void StateOfRecord4920() {
		assertEquals("MD", customers.get(4919).getState());
	}

	@Test
	@DisplayName("Record 4920: ZIP is 21202")
	void ZIPOfRecord4920() {
		assertEquals("21202", customers.get(4919).getZIP());
	}

	@Test
	@DisplayName("Record 4920: Phone is 410-685-4789")
	void PhoneOfRecord4920() {
		assertEquals("410-685-4789", customers.get(4919).getPhone());
	}

	@Test
	@DisplayName("Record 4920: Fax is 410-685-9645")
	void FaxOfRecord4920() {
		assertEquals("410-685-9645", customers.get(4919).getFax());
	}

	@Test
	@DisplayName("Record 4920: Email is sidney@hitch.com")
	void EmailOfRecord4920() {
		assertEquals("sidney@hitch.com", customers.get(4919).getEmail());
	}

	@Test
	@DisplayName("Record 4920: Web is http://www.sidneyhitch.com")
	void WebOfRecord4920() {
		assertEquals("http://www.sidneyhitch.com", customers.get(4919).getWeb());
	}
}
