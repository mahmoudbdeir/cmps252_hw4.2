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

@Tag("16")
class Record_2310 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2310: FirstName is Deangelo")
	void FirstNameOfRecord2310() {
		assertEquals("Deangelo", customers.get(2309).getFirstName());
	}

	@Test
	@DisplayName("Record 2310: LastName is Kassam")
	void LastNameOfRecord2310() {
		assertEquals("Kassam", customers.get(2309).getLastName());
	}

	@Test
	@DisplayName("Record 2310: Company is Wilbur, Warren A Iii")
	void CompanyOfRecord2310() {
		assertEquals("Wilbur, Warren A Iii", customers.get(2309).getCompany());
	}

	@Test
	@DisplayName("Record 2310: Address is 9191 Old Seward Hwy")
	void AddressOfRecord2310() {
		assertEquals("9191 Old Seward Hwy", customers.get(2309).getAddress());
	}

	@Test
	@DisplayName("Record 2310: City is Anchorage")
	void CityOfRecord2310() {
		assertEquals("Anchorage", customers.get(2309).getCity());
	}

	@Test
	@DisplayName("Record 2310: County is Anchorage")
	void CountyOfRecord2310() {
		assertEquals("Anchorage", customers.get(2309).getCounty());
	}

	@Test
	@DisplayName("Record 2310: State is AK")
	void StateOfRecord2310() {
		assertEquals("AK", customers.get(2309).getState());
	}

	@Test
	@DisplayName("Record 2310: ZIP is 99515")
	void ZIPOfRecord2310() {
		assertEquals("99515", customers.get(2309).getZIP());
	}

	@Test
	@DisplayName("Record 2310: Phone is 907-522-0076")
	void PhoneOfRecord2310() {
		assertEquals("907-522-0076", customers.get(2309).getPhone());
	}

	@Test
	@DisplayName("Record 2310: Fax is 907-522-9818")
	void FaxOfRecord2310() {
		assertEquals("907-522-9818", customers.get(2309).getFax());
	}

	@Test
	@DisplayName("Record 2310: Email is deangelo@kassam.com")
	void EmailOfRecord2310() {
		assertEquals("deangelo@kassam.com", customers.get(2309).getEmail());
	}

	@Test
	@DisplayName("Record 2310: Web is http://www.deangelokassam.com")
	void WebOfRecord2310() {
		assertEquals("http://www.deangelokassam.com", customers.get(2309).getWeb());
	}
}
