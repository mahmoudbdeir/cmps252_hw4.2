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

@Tag("3")
class Record_4491 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4491: FirstName is Rich")
	void FirstNameOfRecord4491() {
		assertEquals("Rich", customers.get(4490).getFirstName());
	}

	@Test
	@DisplayName("Record 4491: LastName is Dohnal")
	void LastNameOfRecord4491() {
		assertEquals("Dohnal", customers.get(4490).getLastName());
	}

	@Test
	@DisplayName("Record 4491: Company is Jackson Hole Racquet Club")
	void CompanyOfRecord4491() {
		assertEquals("Jackson Hole Racquet Club", customers.get(4490).getCompany());
	}

	@Test
	@DisplayName("Record 4491: Address is 1266 Ardmore Hwy")
	void AddressOfRecord4491() {
		assertEquals("1266 Ardmore Hwy", customers.get(4490).getAddress());
	}

	@Test
	@DisplayName("Record 4491: City is Taft")
	void CityOfRecord4491() {
		assertEquals("Taft", customers.get(4490).getCity());
	}

	@Test
	@DisplayName("Record 4491: County is Lincoln")
	void CountyOfRecord4491() {
		assertEquals("Lincoln", customers.get(4490).getCounty());
	}

	@Test
	@DisplayName("Record 4491: State is TN")
	void StateOfRecord4491() {
		assertEquals("TN", customers.get(4490).getState());
	}

	@Test
	@DisplayName("Record 4491: ZIP is 38488")
	void ZIPOfRecord4491() {
		assertEquals("38488", customers.get(4490).getZIP());
	}

	@Test
	@DisplayName("Record 4491: Phone is 931-425-1902")
	void PhoneOfRecord4491() {
		assertEquals("931-425-1902", customers.get(4490).getPhone());
	}

	@Test
	@DisplayName("Record 4491: Fax is 931-425-2845")
	void FaxOfRecord4491() {
		assertEquals("931-425-2845", customers.get(4490).getFax());
	}

	@Test
	@DisplayName("Record 4491: Email is rich@dohnal.com")
	void EmailOfRecord4491() {
		assertEquals("rich@dohnal.com", customers.get(4490).getEmail());
	}

	@Test
	@DisplayName("Record 4491: Web is http://www.richdohnal.com")
	void WebOfRecord4491() {
		assertEquals("http://www.richdohnal.com", customers.get(4490).getWeb());
	}
}
