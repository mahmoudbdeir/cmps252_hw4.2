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
class Record_393 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 393: FirstName is Delmer")
	void FirstNameOfRecord393() {
		assertEquals("Delmer", customers.get(392).getFirstName());
	}

	@Test
	@DisplayName("Record 393: LastName is Tilton")
	void LastNameOfRecord393() {
		assertEquals("Tilton", customers.get(392).getLastName());
	}

	@Test
	@DisplayName("Record 393: Company is Shamrock Marketing")
	void CompanyOfRecord393() {
		assertEquals("Shamrock Marketing", customers.get(392).getCompany());
	}

	@Test
	@DisplayName("Record 393: Address is 1152 2nd Ave")
	void AddressOfRecord393() {
		assertEquals("1152 2nd Ave", customers.get(392).getAddress());
	}

	@Test
	@DisplayName("Record 393: City is New York")
	void CityOfRecord393() {
		assertEquals("New York", customers.get(392).getCity());
	}

	@Test
	@DisplayName("Record 393: County is New York")
	void CountyOfRecord393() {
		assertEquals("New York", customers.get(392).getCounty());
	}

	@Test
	@DisplayName("Record 393: State is NY")
	void StateOfRecord393() {
		assertEquals("NY", customers.get(392).getState());
	}

	@Test
	@DisplayName("Record 393: ZIP is 10021")
	void ZIPOfRecord393() {
		assertEquals("10021", customers.get(392).getZIP());
	}

	@Test
	@DisplayName("Record 393: Phone is 212-751-1148")
	void PhoneOfRecord393() {
		assertEquals("212-751-1148", customers.get(392).getPhone());
	}

	@Test
	@DisplayName("Record 393: Fax is 212-751-5302")
	void FaxOfRecord393() {
		assertEquals("212-751-5302", customers.get(392).getFax());
	}

	@Test
	@DisplayName("Record 393: Email is delmer@tilton.com")
	void EmailOfRecord393() {
		assertEquals("delmer@tilton.com", customers.get(392).getEmail());
	}

	@Test
	@DisplayName("Record 393: Web is http://www.delmertilton.com")
	void WebOfRecord393() {
		assertEquals("http://www.delmertilton.com", customers.get(392).getWeb());
	}
}
