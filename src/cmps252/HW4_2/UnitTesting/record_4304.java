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

@Tag("1")
class Record_4304 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4304: FirstName is Kennith")
	void FirstNameOfRecord4304() {
		assertEquals("Kennith", customers.get(4303).getFirstName());
	}

	@Test
	@DisplayName("Record 4304: LastName is Ivan")
	void LastNameOfRecord4304() {
		assertEquals("Ivan", customers.get(4303).getLastName());
	}

	@Test
	@DisplayName("Record 4304: Company is Thermoil")
	void CompanyOfRecord4304() {
		assertEquals("Thermoil", customers.get(4303).getCompany());
	}

	@Test
	@DisplayName("Record 4304: Address is 40 Park Pl")
	void AddressOfRecord4304() {
		assertEquals("40 Park Pl", customers.get(4303).getAddress());
	}

	@Test
	@DisplayName("Record 4304: City is Newton")
	void CityOfRecord4304() {
		assertEquals("Newton", customers.get(4303).getCity());
	}

	@Test
	@DisplayName("Record 4304: County is Sussex")
	void CountyOfRecord4304() {
		assertEquals("Sussex", customers.get(4303).getCounty());
	}

	@Test
	@DisplayName("Record 4304: State is NJ")
	void StateOfRecord4304() {
		assertEquals("NJ", customers.get(4303).getState());
	}

	@Test
	@DisplayName("Record 4304: ZIP is 7860")
	void ZIPOfRecord4304() {
		assertEquals("7860", customers.get(4303).getZIP());
	}

	@Test
	@DisplayName("Record 4304: Phone is 973-383-3487")
	void PhoneOfRecord4304() {
		assertEquals("973-383-3487", customers.get(4303).getPhone());
	}

	@Test
	@DisplayName("Record 4304: Fax is 973-383-3047")
	void FaxOfRecord4304() {
		assertEquals("973-383-3047", customers.get(4303).getFax());
	}

	@Test
	@DisplayName("Record 4304: Email is kennith@ivan.com")
	void EmailOfRecord4304() {
		assertEquals("kennith@ivan.com", customers.get(4303).getEmail());
	}

	@Test
	@DisplayName("Record 4304: Web is http://www.kennithivan.com")
	void WebOfRecord4304() {
		assertEquals("http://www.kennithivan.com", customers.get(4303).getWeb());
	}
}
