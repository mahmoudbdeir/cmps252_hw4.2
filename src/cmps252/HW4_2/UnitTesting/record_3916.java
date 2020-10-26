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
class Record_3916 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3916: FirstName is Sebastian")
	void FirstNameOfRecord3916() {
		assertEquals("Sebastian", customers.get(3915).getFirstName());
	}

	@Test
	@DisplayName("Record 3916: LastName is Hollenbach")
	void LastNameOfRecord3916() {
		assertEquals("Hollenbach", customers.get(3915).getLastName());
	}

	@Test
	@DisplayName("Record 3916: Company is Ansewn Shoe Co")
	void CompanyOfRecord3916() {
		assertEquals("Ansewn Shoe Co", customers.get(3915).getCompany());
	}

	@Test
	@DisplayName("Record 3916: Address is 2003 Mount Holly Rd")
	void AddressOfRecord3916() {
		assertEquals("2003 Mount Holly Rd", customers.get(3915).getAddress());
	}

	@Test
	@DisplayName("Record 3916: City is Burlington")
	void CityOfRecord3916() {
		assertEquals("Burlington", customers.get(3915).getCity());
	}

	@Test
	@DisplayName("Record 3916: County is Burlington")
	void CountyOfRecord3916() {
		assertEquals("Burlington", customers.get(3915).getCounty());
	}

	@Test
	@DisplayName("Record 3916: State is NJ")
	void StateOfRecord3916() {
		assertEquals("NJ", customers.get(3915).getState());
	}

	@Test
	@DisplayName("Record 3916: ZIP is 8016")
	void ZIPOfRecord3916() {
		assertEquals("8016", customers.get(3915).getZIP());
	}

	@Test
	@DisplayName("Record 3916: Phone is 609-387-8938")
	void PhoneOfRecord3916() {
		assertEquals("609-387-8938", customers.get(3915).getPhone());
	}

	@Test
	@DisplayName("Record 3916: Fax is 609-387-1551")
	void FaxOfRecord3916() {
		assertEquals("609-387-1551", customers.get(3915).getFax());
	}

	@Test
	@DisplayName("Record 3916: Email is sebastian@hollenbach.com")
	void EmailOfRecord3916() {
		assertEquals("sebastian@hollenbach.com", customers.get(3915).getEmail());
	}

	@Test
	@DisplayName("Record 3916: Web is http://www.sebastianhollenbach.com")
	void WebOfRecord3916() {
		assertEquals("http://www.sebastianhollenbach.com", customers.get(3915).getWeb());
	}
}
