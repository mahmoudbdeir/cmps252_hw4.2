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

@Tag("7")
class Record_988 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 988: FirstName is Silvia")
	void FirstNameOfRecord988() {
		assertEquals("Silvia", customers.get(987).getFirstName());
	}

	@Test
	@DisplayName("Record 988: LastName is Macintyre")
	void LastNameOfRecord988() {
		assertEquals("Macintyre", customers.get(987).getLastName());
	}

	@Test
	@DisplayName("Record 988: Company is General Filtration Corp")
	void CompanyOfRecord988() {
		assertEquals("General Filtration Corp", customers.get(987).getCompany());
	}

	@Test
	@DisplayName("Record 988: Address is Landmark")
	void AddressOfRecord988() {
		assertEquals("Landmark", customers.get(987).getAddress());
	}

	@Test
	@DisplayName("Record 988: City is Rysterstown")
	void CityOfRecord988() {
		assertEquals("Rysterstown", customers.get(987).getCity());
	}

	@Test
	@DisplayName("Record 988: County is Baltimore")
	void CountyOfRecord988() {
		assertEquals("Baltimore", customers.get(987).getCounty());
	}

	@Test
	@DisplayName("Record 988: State is MD")
	void StateOfRecord988() {
		assertEquals("MD", customers.get(987).getState());
	}

	@Test
	@DisplayName("Record 988: ZIP is 21136")
	void ZIPOfRecord988() {
		assertEquals("21136", customers.get(987).getZIP());
	}

	@Test
	@DisplayName("Record 988: Phone is 410-833-0139")
	void PhoneOfRecord988() {
		assertEquals("410-833-0139", customers.get(987).getPhone());
	}

	@Test
	@DisplayName("Record 988: Fax is 410-833-9097")
	void FaxOfRecord988() {
		assertEquals("410-833-9097", customers.get(987).getFax());
	}

	@Test
	@DisplayName("Record 988: Email is silvia@macintyre.com")
	void EmailOfRecord988() {
		assertEquals("silvia@macintyre.com", customers.get(987).getEmail());
	}

	@Test
	@DisplayName("Record 988: Web is http://www.silviamacintyre.com")
	void WebOfRecord988() {
		assertEquals("http://www.silviamacintyre.com", customers.get(987).getWeb());
	}
}
