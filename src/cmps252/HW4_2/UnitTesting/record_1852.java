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

@Tag("44")
class Record_1852 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1852: FirstName is Nicky")
	void FirstNameOfRecord1852() {
		assertEquals("Nicky", customers.get(1851).getFirstName());
	}

	@Test
	@DisplayName("Record 1852: LastName is Hartsler")
	void LastNameOfRecord1852() {
		assertEquals("Hartsler", customers.get(1851).getLastName());
	}

	@Test
	@DisplayName("Record 1852: Company is Mattes & Mattes Pc")
	void CompanyOfRecord1852() {
		assertEquals("Mattes & Mattes Pc", customers.get(1851).getCompany());
	}

	@Test
	@DisplayName("Record 1852: Address is 76 W Carey St")
	void AddressOfRecord1852() {
		assertEquals("76 W Carey St", customers.get(1851).getAddress());
	}

	@Test
	@DisplayName("Record 1852: City is Wilkes Barre")
	void CityOfRecord1852() {
		assertEquals("Wilkes Barre", customers.get(1851).getCity());
	}

	@Test
	@DisplayName("Record 1852: County is Luzerne")
	void CountyOfRecord1852() {
		assertEquals("Luzerne", customers.get(1851).getCounty());
	}

	@Test
	@DisplayName("Record 1852: State is PA")
	void StateOfRecord1852() {
		assertEquals("PA", customers.get(1851).getState());
	}

	@Test
	@DisplayName("Record 1852: ZIP is 18705")
	void ZIPOfRecord1852() {
		assertEquals("18705", customers.get(1851).getZIP());
	}

	@Test
	@DisplayName("Record 1852: Phone is 570-825-8093")
	void PhoneOfRecord1852() {
		assertEquals("570-825-8093", customers.get(1851).getPhone());
	}

	@Test
	@DisplayName("Record 1852: Fax is 570-825-0109")
	void FaxOfRecord1852() {
		assertEquals("570-825-0109", customers.get(1851).getFax());
	}

	@Test
	@DisplayName("Record 1852: Email is nicky@hartsler.com")
	void EmailOfRecord1852() {
		assertEquals("nicky@hartsler.com", customers.get(1851).getEmail());
	}

	@Test
	@DisplayName("Record 1852: Web is http://www.nickyhartsler.com")
	void WebOfRecord1852() {
		assertEquals("http://www.nickyhartsler.com", customers.get(1851).getWeb());
	}
}
