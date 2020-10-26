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

@Tag("27")
class Record_107 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 107: FirstName is Celia")
	void FirstNameOfRecord107() {
		assertEquals("Celia", customers.get(106).getFirstName());
	}

	@Test
	@DisplayName("Record 107: LastName is Yerico")
	void LastNameOfRecord107() {
		assertEquals("Yerico", customers.get(106).getLastName());
	}

	@Test
	@DisplayName("Record 107: Company is School")
	void CompanyOfRecord107() {
		assertEquals("School", customers.get(106).getCompany());
	}

	@Test
	@DisplayName("Record 107: Address is 612 S Ayon Ave")
	void AddressOfRecord107() {
		assertEquals("612 S Ayon Ave", customers.get(106).getAddress());
	}

	@Test
	@DisplayName("Record 107: City is Azusa")
	void CityOfRecord107() {
		assertEquals("Azusa", customers.get(106).getCity());
	}

	@Test
	@DisplayName("Record 107: County is Los Angeles")
	void CountyOfRecord107() {
		assertEquals("Los Angeles", customers.get(106).getCounty());
	}

	@Test
	@DisplayName("Record 107: State is CA")
	void StateOfRecord107() {
		assertEquals("CA", customers.get(106).getState());
	}

	@Test
	@DisplayName("Record 107: ZIP is 91702")
	void ZIPOfRecord107() {
		assertEquals("91702", customers.get(106).getZIP());
	}

	@Test
	@DisplayName("Record 107: Phone is 626-334-2788")
	void PhoneOfRecord107() {
		assertEquals("626-334-2788", customers.get(106).getPhone());
	}

	@Test
	@DisplayName("Record 107: Fax is 626-334-1245")
	void FaxOfRecord107() {
		assertEquals("626-334-1245", customers.get(106).getFax());
	}

	@Test
	@DisplayName("Record 107: Email is celia@yerico.com")
	void EmailOfRecord107() {
		assertEquals("celia@yerico.com", customers.get(106).getEmail());
	}

	@Test
	@DisplayName("Record 107: Web is http://www.celiayerico.com")
	void WebOfRecord107() {
		assertEquals("http://www.celiayerico.com", customers.get(106).getWeb());
	}
}
