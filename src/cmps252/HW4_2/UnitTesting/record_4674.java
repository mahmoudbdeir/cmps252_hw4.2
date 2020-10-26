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

@Tag("42")
class Record_4674 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4674: FirstName is Rosemarie")
	void FirstNameOfRecord4674() {
		assertEquals("Rosemarie", customers.get(4673).getFirstName());
	}

	@Test
	@DisplayName("Record 4674: LastName is Schomer")
	void LastNameOfRecord4674() {
		assertEquals("Schomer", customers.get(4673).getLastName());
	}

	@Test
	@DisplayName("Record 4674: Company is Mierzwa & Associates")
	void CompanyOfRecord4674() {
		assertEquals("Mierzwa & Associates", customers.get(4673).getCompany());
	}

	@Test
	@DisplayName("Record 4674: Address is 6825 Flanders Dr")
	void AddressOfRecord4674() {
		assertEquals("6825 Flanders Dr", customers.get(4673).getAddress());
	}

	@Test
	@DisplayName("Record 4674: City is San Diego")
	void CityOfRecord4674() {
		assertEquals("San Diego", customers.get(4673).getCity());
	}

	@Test
	@DisplayName("Record 4674: County is San Diego")
	void CountyOfRecord4674() {
		assertEquals("San Diego", customers.get(4673).getCounty());
	}

	@Test
	@DisplayName("Record 4674: State is CA")
	void StateOfRecord4674() {
		assertEquals("CA", customers.get(4673).getState());
	}

	@Test
	@DisplayName("Record 4674: ZIP is 92121")
	void ZIPOfRecord4674() {
		assertEquals("92121", customers.get(4673).getZIP());
	}

	@Test
	@DisplayName("Record 4674: Phone is 858-554-4175")
	void PhoneOfRecord4674() {
		assertEquals("858-554-4175", customers.get(4673).getPhone());
	}

	@Test
	@DisplayName("Record 4674: Fax is 858-554-7332")
	void FaxOfRecord4674() {
		assertEquals("858-554-7332", customers.get(4673).getFax());
	}

	@Test
	@DisplayName("Record 4674: Email is rosemarie@schomer.com")
	void EmailOfRecord4674() {
		assertEquals("rosemarie@schomer.com", customers.get(4673).getEmail());
	}

	@Test
	@DisplayName("Record 4674: Web is http://www.rosemarieschomer.com")
	void WebOfRecord4674() {
		assertEquals("http://www.rosemarieschomer.com", customers.get(4673).getWeb());
	}
}
