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

@Tag("37")
class Record_2060 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2060: FirstName is Marcy")
	void FirstNameOfRecord2060() {
		assertEquals("Marcy", customers.get(2059).getFirstName());
	}

	@Test
	@DisplayName("Record 2060: LastName is Deangelo")
	void LastNameOfRecord2060() {
		assertEquals("Deangelo", customers.get(2059).getLastName());
	}

	@Test
	@DisplayName("Record 2060: Company is National Sales Engrg Corp")
	void CompanyOfRecord2060() {
		assertEquals("National Sales Engrg Corp", customers.get(2059).getCompany());
	}

	@Test
	@DisplayName("Record 2060: Address is 60 Old Camplain Rd")
	void AddressOfRecord2060() {
		assertEquals("60 Old Camplain Rd", customers.get(2059).getAddress());
	}

	@Test
	@DisplayName("Record 2060: City is Somerville")
	void CityOfRecord2060() {
		assertEquals("Somerville", customers.get(2059).getCity());
	}

	@Test
	@DisplayName("Record 2060: County is Somerset")
	void CountyOfRecord2060() {
		assertEquals("Somerset", customers.get(2059).getCounty());
	}

	@Test
	@DisplayName("Record 2060: State is NJ")
	void StateOfRecord2060() {
		assertEquals("NJ", customers.get(2059).getState());
	}

	@Test
	@DisplayName("Record 2060: ZIP is 8876")
	void ZIPOfRecord2060() {
		assertEquals("8876", customers.get(2059).getZIP());
	}

	@Test
	@DisplayName("Record 2060: Phone is 908-725-8814")
	void PhoneOfRecord2060() {
		assertEquals("908-725-8814", customers.get(2059).getPhone());
	}

	@Test
	@DisplayName("Record 2060: Fax is 908-725-8178")
	void FaxOfRecord2060() {
		assertEquals("908-725-8178", customers.get(2059).getFax());
	}

	@Test
	@DisplayName("Record 2060: Email is marcy@deangelo.com")
	void EmailOfRecord2060() {
		assertEquals("marcy@deangelo.com", customers.get(2059).getEmail());
	}

	@Test
	@DisplayName("Record 2060: Web is http://www.marcydeangelo.com")
	void WebOfRecord2060() {
		assertEquals("http://www.marcydeangelo.com", customers.get(2059).getWeb());
	}
}
