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

@Tag("38")
class Record_2024 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2024: FirstName is Sidney")
	void FirstNameOfRecord2024() {
		assertEquals("Sidney", customers.get(2023).getFirstName());
	}

	@Test
	@DisplayName("Record 2024: LastName is Rinnert")
	void LastNameOfRecord2024() {
		assertEquals("Rinnert", customers.get(2023).getLastName());
	}

	@Test
	@DisplayName("Record 2024: Company is Hocott Implement Co Inc")
	void CompanyOfRecord2024() {
		assertEquals("Hocott Implement Co Inc", customers.get(2023).getCompany());
	}

	@Test
	@DisplayName("Record 2024: Address is 2950 Hamilton Blvd")
	void AddressOfRecord2024() {
		assertEquals("2950 Hamilton Blvd", customers.get(2023).getAddress());
	}

	@Test
	@DisplayName("Record 2024: City is South Plainfield")
	void CityOfRecord2024() {
		assertEquals("South Plainfield", customers.get(2023).getCity());
	}

	@Test
	@DisplayName("Record 2024: County is Middlesex")
	void CountyOfRecord2024() {
		assertEquals("Middlesex", customers.get(2023).getCounty());
	}

	@Test
	@DisplayName("Record 2024: State is NJ")
	void StateOfRecord2024() {
		assertEquals("NJ", customers.get(2023).getState());
	}

	@Test
	@DisplayName("Record 2024: ZIP is 7080")
	void ZIPOfRecord2024() {
		assertEquals("7080", customers.get(2023).getZIP());
	}

	@Test
	@DisplayName("Record 2024: Phone is 908-755-2719")
	void PhoneOfRecord2024() {
		assertEquals("908-755-2719", customers.get(2023).getPhone());
	}

	@Test
	@DisplayName("Record 2024: Fax is 908-755-9366")
	void FaxOfRecord2024() {
		assertEquals("908-755-9366", customers.get(2023).getFax());
	}

	@Test
	@DisplayName("Record 2024: Email is sidney@rinnert.com")
	void EmailOfRecord2024() {
		assertEquals("sidney@rinnert.com", customers.get(2023).getEmail());
	}

	@Test
	@DisplayName("Record 2024: Web is http://www.sidneyrinnert.com")
	void WebOfRecord2024() {
		assertEquals("http://www.sidneyrinnert.com", customers.get(2023).getWeb());
	}
}
