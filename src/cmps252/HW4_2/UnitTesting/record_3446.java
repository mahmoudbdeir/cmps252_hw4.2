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

@Tag("4")
class Record_3446 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3446: FirstName is Michel")
	void FirstNameOfRecord3446() {
		assertEquals("Michel", customers.get(3445).getFirstName());
	}

	@Test
	@DisplayName("Record 3446: LastName is Shover")
	void LastNameOfRecord3446() {
		assertEquals("Shover", customers.get(3445).getLastName());
	}

	@Test
	@DisplayName("Record 3446: Company is Fairfield Executive Inn")
	void CompanyOfRecord3446() {
		assertEquals("Fairfield Executive Inn", customers.get(3445).getCompany());
	}

	@Test
	@DisplayName("Record 3446: Address is Charles")
	void AddressOfRecord3446() {
		assertEquals("Charles", customers.get(3445).getAddress());
	}

	@Test
	@DisplayName("Record 3446: City is Baltimore")
	void CityOfRecord3446() {
		assertEquals("Baltimore", customers.get(3445).getCity());
	}

	@Test
	@DisplayName("Record 3446: County is Baltimore City")
	void CountyOfRecord3446() {
		assertEquals("Baltimore City", customers.get(3445).getCounty());
	}

	@Test
	@DisplayName("Record 3446: State is MD")
	void StateOfRecord3446() {
		assertEquals("MD", customers.get(3445).getState());
	}

	@Test
	@DisplayName("Record 3446: ZIP is 21201")
	void ZIPOfRecord3446() {
		assertEquals("21201", customers.get(3445).getZIP());
	}

	@Test
	@DisplayName("Record 3446: Phone is 410-659-4590")
	void PhoneOfRecord3446() {
		assertEquals("410-659-4590", customers.get(3445).getPhone());
	}

	@Test
	@DisplayName("Record 3446: Fax is 410-659-7273")
	void FaxOfRecord3446() {
		assertEquals("410-659-7273", customers.get(3445).getFax());
	}

	@Test
	@DisplayName("Record 3446: Email is michel@shover.com")
	void EmailOfRecord3446() {
		assertEquals("michel@shover.com", customers.get(3445).getEmail());
	}

	@Test
	@DisplayName("Record 3446: Web is http://www.michelshover.com")
	void WebOfRecord3446() {
		assertEquals("http://www.michelshover.com", customers.get(3445).getWeb());
	}
}
