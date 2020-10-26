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

@Tag("36")
class Record_4387 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4387: FirstName is Benita")
	void FirstNameOfRecord4387() {
		assertEquals("Benita", customers.get(4386).getFirstName());
	}

	@Test
	@DisplayName("Record 4387: LastName is Hinds")
	void LastNameOfRecord4387() {
		assertEquals("Hinds", customers.get(4386).getLastName());
	}

	@Test
	@DisplayName("Record 4387: Company is Frazier Masonry Corp")
	void CompanyOfRecord4387() {
		assertEquals("Frazier Masonry Corp", customers.get(4386).getCompany());
	}

	@Test
	@DisplayName("Record 4387: Address is 30231 Stephenson Hwy")
	void AddressOfRecord4387() {
		assertEquals("30231 Stephenson Hwy", customers.get(4386).getAddress());
	}

	@Test
	@DisplayName("Record 4387: City is Madison Hyghts")
	void CityOfRecord4387() {
		assertEquals("Madison Hyghts", customers.get(4386).getCity());
	}

	@Test
	@DisplayName("Record 4387: County is Oakland")
	void CountyOfRecord4387() {
		assertEquals("Oakland", customers.get(4386).getCounty());
	}

	@Test
	@DisplayName("Record 4387: State is MI")
	void StateOfRecord4387() {
		assertEquals("MI", customers.get(4386).getState());
	}

	@Test
	@DisplayName("Record 4387: ZIP is 48071")
	void ZIPOfRecord4387() {
		assertEquals("48071", customers.get(4386).getZIP());
	}

	@Test
	@DisplayName("Record 4387: Phone is 248-589-6018")
	void PhoneOfRecord4387() {
		assertEquals("248-589-6018", customers.get(4386).getPhone());
	}

	@Test
	@DisplayName("Record 4387: Fax is 248-589-9992")
	void FaxOfRecord4387() {
		assertEquals("248-589-9992", customers.get(4386).getFax());
	}

	@Test
	@DisplayName("Record 4387: Email is benita@hinds.com")
	void EmailOfRecord4387() {
		assertEquals("benita@hinds.com", customers.get(4386).getEmail());
	}

	@Test
	@DisplayName("Record 4387: Web is http://www.benitahinds.com")
	void WebOfRecord4387() {
		assertEquals("http://www.benitahinds.com", customers.get(4386).getWeb());
	}
}
