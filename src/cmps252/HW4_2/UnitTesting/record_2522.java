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

@Tag("28")
class Record_2522 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2522: FirstName is Filiberto")
	void FirstNameOfRecord2522() {
		assertEquals("Filiberto", customers.get(2521).getFirstName());
	}

	@Test
	@DisplayName("Record 2522: LastName is Moustafa")
	void LastNameOfRecord2522() {
		assertEquals("Moustafa", customers.get(2521).getLastName());
	}

	@Test
	@DisplayName("Record 2522: Company is Carle Arbours")
	void CompanyOfRecord2522() {
		assertEquals("Carle Arbours", customers.get(2521).getCompany());
	}

	@Test
	@DisplayName("Record 2522: Address is 106 Watchung Ave")
	void AddressOfRecord2522() {
		assertEquals("106 Watchung Ave", customers.get(2521).getAddress());
	}

	@Test
	@DisplayName("Record 2522: City is Plainfield")
	void CityOfRecord2522() {
		assertEquals("Plainfield", customers.get(2521).getCity());
	}

	@Test
	@DisplayName("Record 2522: County is Union")
	void CountyOfRecord2522() {
		assertEquals("Union", customers.get(2521).getCounty());
	}

	@Test
	@DisplayName("Record 2522: State is NJ")
	void StateOfRecord2522() {
		assertEquals("NJ", customers.get(2521).getState());
	}

	@Test
	@DisplayName("Record 2522: ZIP is 7060")
	void ZIPOfRecord2522() {
		assertEquals("7060", customers.get(2521).getZIP());
	}

	@Test
	@DisplayName("Record 2522: Phone is 908-561-1304")
	void PhoneOfRecord2522() {
		assertEquals("908-561-1304", customers.get(2521).getPhone());
	}

	@Test
	@DisplayName("Record 2522: Fax is 908-561-7443")
	void FaxOfRecord2522() {
		assertEquals("908-561-7443", customers.get(2521).getFax());
	}

	@Test
	@DisplayName("Record 2522: Email is filiberto@moustafa.com")
	void EmailOfRecord2522() {
		assertEquals("filiberto@moustafa.com", customers.get(2521).getEmail());
	}

	@Test
	@DisplayName("Record 2522: Web is http://www.filibertomoustafa.com")
	void WebOfRecord2522() {
		assertEquals("http://www.filibertomoustafa.com", customers.get(2521).getWeb());
	}
}
