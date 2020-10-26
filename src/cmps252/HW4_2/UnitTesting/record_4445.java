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

@Tag("18")
class Record_4445 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4445: FirstName is Ricardo")
	void FirstNameOfRecord4445() {
		assertEquals("Ricardo", customers.get(4444).getFirstName());
	}

	@Test
	@DisplayName("Record 4445: LastName is Wear")
	void LastNameOfRecord4445() {
		assertEquals("Wear", customers.get(4444).getLastName());
	}

	@Test
	@DisplayName("Record 4445: Company is Vinita Flag & Apron Co")
	void CompanyOfRecord4445() {
		assertEquals("Vinita Flag & Apron Co", customers.get(4444).getCompany());
	}

	@Test
	@DisplayName("Record 4445: Address is 2630 Steve Dr")
	void AddressOfRecord4445() {
		assertEquals("2630 Steve Dr", customers.get(4444).getAddress());
	}

	@Test
	@DisplayName("Record 4445: City is Atlanta")
	void CityOfRecord4445() {
		assertEquals("Atlanta", customers.get(4444).getCity());
	}

	@Test
	@DisplayName("Record 4445: County is Dekalb")
	void CountyOfRecord4445() {
		assertEquals("Dekalb", customers.get(4444).getCounty());
	}

	@Test
	@DisplayName("Record 4445: State is GA")
	void StateOfRecord4445() {
		assertEquals("GA", customers.get(4444).getState());
	}

	@Test
	@DisplayName("Record 4445: ZIP is 30340")
	void ZIPOfRecord4445() {
		assertEquals("30340", customers.get(4444).getZIP());
	}

	@Test
	@DisplayName("Record 4445: Phone is 770-449-6917")
	void PhoneOfRecord4445() {
		assertEquals("770-449-6917", customers.get(4444).getPhone());
	}

	@Test
	@DisplayName("Record 4445: Fax is 770-449-1893")
	void FaxOfRecord4445() {
		assertEquals("770-449-1893", customers.get(4444).getFax());
	}

	@Test
	@DisplayName("Record 4445: Email is ricardo@wear.com")
	void EmailOfRecord4445() {
		assertEquals("ricardo@wear.com", customers.get(4444).getEmail());
	}

	@Test
	@DisplayName("Record 4445: Web is http://www.ricardowear.com")
	void WebOfRecord4445() {
		assertEquals("http://www.ricardowear.com", customers.get(4444).getWeb());
	}
}
