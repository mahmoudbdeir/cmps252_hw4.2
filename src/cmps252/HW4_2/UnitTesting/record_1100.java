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

@Tag("14")
class Record_1100 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1100: FirstName is Delphine")
	void FirstNameOfRecord1100() {
		assertEquals("Delphine", customers.get(1099).getFirstName());
	}

	@Test
	@DisplayName("Record 1100: LastName is Olcott")
	void LastNameOfRecord1100() {
		assertEquals("Olcott", customers.get(1099).getLastName());
	}

	@Test
	@DisplayName("Record 1100: Company is Pnc Bank")
	void CompanyOfRecord1100() {
		assertEquals("Pnc Bank", customers.get(1099).getCompany());
	}

	@Test
	@DisplayName("Record 1100: Address is 1957 Friendship Dr")
	void AddressOfRecord1100() {
		assertEquals("1957 Friendship Dr", customers.get(1099).getAddress());
	}

	@Test
	@DisplayName("Record 1100: City is El Cajon")
	void CityOfRecord1100() {
		assertEquals("El Cajon", customers.get(1099).getCity());
	}

	@Test
	@DisplayName("Record 1100: County is San Diego")
	void CountyOfRecord1100() {
		assertEquals("San Diego", customers.get(1099).getCounty());
	}

	@Test
	@DisplayName("Record 1100: State is CA")
	void StateOfRecord1100() {
		assertEquals("CA", customers.get(1099).getState());
	}

	@Test
	@DisplayName("Record 1100: ZIP is 92020")
	void ZIPOfRecord1100() {
		assertEquals("92020", customers.get(1099).getZIP());
	}

	@Test
	@DisplayName("Record 1100: Phone is 619-258-9337")
	void PhoneOfRecord1100() {
		assertEquals("619-258-9337", customers.get(1099).getPhone());
	}

	@Test
	@DisplayName("Record 1100: Fax is 619-258-1864")
	void FaxOfRecord1100() {
		assertEquals("619-258-1864", customers.get(1099).getFax());
	}

	@Test
	@DisplayName("Record 1100: Email is delphine@olcott.com")
	void EmailOfRecord1100() {
		assertEquals("delphine@olcott.com", customers.get(1099).getEmail());
	}

	@Test
	@DisplayName("Record 1100: Web is http://www.delphineolcott.com")
	void WebOfRecord1100() {
		assertEquals("http://www.delphineolcott.com", customers.get(1099).getWeb());
	}
}
