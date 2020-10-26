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

@Tag("23")
class Record_1658 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1658: FirstName is Fryda")
	void FirstNameOfRecord1658() {
		assertEquals("Fryda", customers.get(1657).getFirstName());
	}

	@Test
	@DisplayName("Record 1658: LastName is Kushiner")
	void LastNameOfRecord1658() {
		assertEquals("Kushiner", customers.get(1657).getLastName());
	}

	@Test
	@DisplayName("Record 1658: Company is Borts Servistar Hardware Co")
	void CompanyOfRecord1658() {
		assertEquals("Borts Servistar Hardware Co", customers.get(1657).getCompany());
	}

	@Test
	@DisplayName("Record 1658: Address is 6634 Statesville Rd")
	void AddressOfRecord1658() {
		assertEquals("6634 Statesville Rd", customers.get(1657).getAddress());
	}

	@Test
	@DisplayName("Record 1658: City is Charlotte")
	void CityOfRecord1658() {
		assertEquals("Charlotte", customers.get(1657).getCity());
	}

	@Test
	@DisplayName("Record 1658: County is Mecklenburg")
	void CountyOfRecord1658() {
		assertEquals("Mecklenburg", customers.get(1657).getCounty());
	}

	@Test
	@DisplayName("Record 1658: State is NC")
	void StateOfRecord1658() {
		assertEquals("NC", customers.get(1657).getState());
	}

	@Test
	@DisplayName("Record 1658: ZIP is 28269")
	void ZIPOfRecord1658() {
		assertEquals("28269", customers.get(1657).getZIP());
	}

	@Test
	@DisplayName("Record 1658: Phone is 704-597-0192")
	void PhoneOfRecord1658() {
		assertEquals("704-597-0192", customers.get(1657).getPhone());
	}

	@Test
	@DisplayName("Record 1658: Fax is 704-597-4312")
	void FaxOfRecord1658() {
		assertEquals("704-597-4312", customers.get(1657).getFax());
	}

	@Test
	@DisplayName("Record 1658: Email is fryda@kushiner.com")
	void EmailOfRecord1658() {
		assertEquals("fryda@kushiner.com", customers.get(1657).getEmail());
	}

	@Test
	@DisplayName("Record 1658: Web is http://www.frydakushiner.com")
	void WebOfRecord1658() {
		assertEquals("http://www.frydakushiner.com", customers.get(1657).getWeb());
	}
}
