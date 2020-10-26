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

@Tag("31")
class Record_3800 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3800: FirstName is Waylon")
	void FirstNameOfRecord3800() {
		assertEquals("Waylon", customers.get(3799).getFirstName());
	}

	@Test
	@DisplayName("Record 3800: LastName is Bawden")
	void LastNameOfRecord3800() {
		assertEquals("Bawden", customers.get(3799).getLastName());
	}

	@Test
	@DisplayName("Record 3800: Company is Flash Printing Corp")
	void CompanyOfRecord3800() {
		assertEquals("Flash Printing Corp", customers.get(3799).getCompany());
	}

	@Test
	@DisplayName("Record 3800: Address is 2680 Abco Ct")
	void AddressOfRecord3800() {
		assertEquals("2680 Abco Ct", customers.get(3799).getAddress());
	}

	@Test
	@DisplayName("Record 3800: City is Lithonia")
	void CityOfRecord3800() {
		assertEquals("Lithonia", customers.get(3799).getCity());
	}

	@Test
	@DisplayName("Record 3800: County is Dekalb")
	void CountyOfRecord3800() {
		assertEquals("Dekalb", customers.get(3799).getCounty());
	}

	@Test
	@DisplayName("Record 3800: State is GA")
	void StateOfRecord3800() {
		assertEquals("GA", customers.get(3799).getState());
	}

	@Test
	@DisplayName("Record 3800: ZIP is 30058")
	void ZIPOfRecord3800() {
		assertEquals("30058", customers.get(3799).getZIP());
	}

	@Test
	@DisplayName("Record 3800: Phone is 770-981-8840")
	void PhoneOfRecord3800() {
		assertEquals("770-981-8840", customers.get(3799).getPhone());
	}

	@Test
	@DisplayName("Record 3800: Fax is 770-981-2741")
	void FaxOfRecord3800() {
		assertEquals("770-981-2741", customers.get(3799).getFax());
	}

	@Test
	@DisplayName("Record 3800: Email is waylon@bawden.com")
	void EmailOfRecord3800() {
		assertEquals("waylon@bawden.com", customers.get(3799).getEmail());
	}

	@Test
	@DisplayName("Record 3800: Web is http://www.waylonbawden.com")
	void WebOfRecord3800() {
		assertEquals("http://www.waylonbawden.com", customers.get(3799).getWeb());
	}
}
