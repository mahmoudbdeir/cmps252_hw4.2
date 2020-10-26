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

@Tag("11")
class Record_2723 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2723: FirstName is Brant")
	void FirstNameOfRecord2723() {
		assertEquals("Brant", customers.get(2722).getFirstName());
	}

	@Test
	@DisplayName("Record 2723: LastName is Englehart")
	void LastNameOfRecord2723() {
		assertEquals("Englehart", customers.get(2722).getLastName());
	}

	@Test
	@DisplayName("Record 2723: Company is Afl Cio Of New Jersey")
	void CompanyOfRecord2723() {
		assertEquals("Afl Cio Of New Jersey", customers.get(2722).getCompany());
	}

	@Test
	@DisplayName("Record 2723: Address is 7525 Metropolitan Dr")
	void AddressOfRecord2723() {
		assertEquals("7525 Metropolitan Dr", customers.get(2722).getAddress());
	}

	@Test
	@DisplayName("Record 2723: City is San Diego")
	void CityOfRecord2723() {
		assertEquals("San Diego", customers.get(2722).getCity());
	}

	@Test
	@DisplayName("Record 2723: County is San Diego")
	void CountyOfRecord2723() {
		assertEquals("San Diego", customers.get(2722).getCounty());
	}

	@Test
	@DisplayName("Record 2723: State is CA")
	void StateOfRecord2723() {
		assertEquals("CA", customers.get(2722).getState());
	}

	@Test
	@DisplayName("Record 2723: ZIP is 92108")
	void ZIPOfRecord2723() {
		assertEquals("92108", customers.get(2722).getZIP());
	}

	@Test
	@DisplayName("Record 2723: Phone is 619-296-6405")
	void PhoneOfRecord2723() {
		assertEquals("619-296-6405", customers.get(2722).getPhone());
	}

	@Test
	@DisplayName("Record 2723: Fax is 619-296-2269")
	void FaxOfRecord2723() {
		assertEquals("619-296-2269", customers.get(2722).getFax());
	}

	@Test
	@DisplayName("Record 2723: Email is brant@englehart.com")
	void EmailOfRecord2723() {
		assertEquals("brant@englehart.com", customers.get(2722).getEmail());
	}

	@Test
	@DisplayName("Record 2723: Web is http://www.brantenglehart.com")
	void WebOfRecord2723() {
		assertEquals("http://www.brantenglehart.com", customers.get(2722).getWeb());
	}
}
