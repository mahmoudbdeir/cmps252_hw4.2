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

@Tag("13")
class Record_2118 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2118: FirstName is Samual")
	void FirstNameOfRecord2118() {
		assertEquals("Samual", customers.get(2117).getFirstName());
	}

	@Test
	@DisplayName("Record 2118: LastName is Erceg")
	void LastNameOfRecord2118() {
		assertEquals("Erceg", customers.get(2117).getLastName());
	}

	@Test
	@DisplayName("Record 2118: Company is Nehrbass, Seth M")
	void CompanyOfRecord2118() {
		assertEquals("Nehrbass, Seth M", customers.get(2117).getCompany());
	}

	@Test
	@DisplayName("Record 2118: Address is 2942 E Tioga St")
	void AddressOfRecord2118() {
		assertEquals("2942 E Tioga St", customers.get(2117).getAddress());
	}

	@Test
	@DisplayName("Record 2118: City is Philadelphia")
	void CityOfRecord2118() {
		assertEquals("Philadelphia", customers.get(2117).getCity());
	}

	@Test
	@DisplayName("Record 2118: County is Philadelphia")
	void CountyOfRecord2118() {
		assertEquals("Philadelphia", customers.get(2117).getCounty());
	}

	@Test
	@DisplayName("Record 2118: State is PA")
	void StateOfRecord2118() {
		assertEquals("PA", customers.get(2117).getState());
	}

	@Test
	@DisplayName("Record 2118: ZIP is 19134")
	void ZIPOfRecord2118() {
		assertEquals("19134", customers.get(2117).getZIP());
	}

	@Test
	@DisplayName("Record 2118: Phone is 215-634-4112")
	void PhoneOfRecord2118() {
		assertEquals("215-634-4112", customers.get(2117).getPhone());
	}

	@Test
	@DisplayName("Record 2118: Fax is 215-634-6683")
	void FaxOfRecord2118() {
		assertEquals("215-634-6683", customers.get(2117).getFax());
	}

	@Test
	@DisplayName("Record 2118: Email is samual@erceg.com")
	void EmailOfRecord2118() {
		assertEquals("samual@erceg.com", customers.get(2117).getEmail());
	}

	@Test
	@DisplayName("Record 2118: Web is http://www.samualerceg.com")
	void WebOfRecord2118() {
		assertEquals("http://www.samualerceg.com", customers.get(2117).getWeb());
	}
}
