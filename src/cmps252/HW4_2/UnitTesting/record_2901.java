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
class Record_2901 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2901: FirstName is Patricia")
	void FirstNameOfRecord2901() {
		assertEquals("Patricia", customers.get(2900).getFirstName());
	}

	@Test
	@DisplayName("Record 2901: LastName is Mehtani")
	void LastNameOfRecord2901() {
		assertEquals("Mehtani", customers.get(2900).getLastName());
	}

	@Test
	@DisplayName("Record 2901: Company is Germania")
	void CompanyOfRecord2901() {
		assertEquals("Germania", customers.get(2900).getCompany());
	}

	@Test
	@DisplayName("Record 2901: Address is 128 S Maple Ave")
	void AddressOfRecord2901() {
		assertEquals("128 S Maple Ave", customers.get(2900).getAddress());
	}

	@Test
	@DisplayName("Record 2901: City is South San Francisco")
	void CityOfRecord2901() {
		assertEquals("South San Francisco", customers.get(2900).getCity());
	}

	@Test
	@DisplayName("Record 2901: County is San Mateo")
	void CountyOfRecord2901() {
		assertEquals("San Mateo", customers.get(2900).getCounty());
	}

	@Test
	@DisplayName("Record 2901: State is CA")
	void StateOfRecord2901() {
		assertEquals("CA", customers.get(2900).getState());
	}

	@Test
	@DisplayName("Record 2901: ZIP is 94080")
	void ZIPOfRecord2901() {
		assertEquals("94080", customers.get(2900).getZIP());
	}

	@Test
	@DisplayName("Record 2901: Phone is 650-583-0788")
	void PhoneOfRecord2901() {
		assertEquals("650-583-0788", customers.get(2900).getPhone());
	}

	@Test
	@DisplayName("Record 2901: Fax is 650-583-2817")
	void FaxOfRecord2901() {
		assertEquals("650-583-2817", customers.get(2900).getFax());
	}

	@Test
	@DisplayName("Record 2901: Email is patricia@mehtani.com")
	void EmailOfRecord2901() {
		assertEquals("patricia@mehtani.com", customers.get(2900).getEmail());
	}

	@Test
	@DisplayName("Record 2901: Web is http://www.patriciamehtani.com")
	void WebOfRecord2901() {
		assertEquals("http://www.patriciamehtani.com", customers.get(2900).getWeb());
	}
}
