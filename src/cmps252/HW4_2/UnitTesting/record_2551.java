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

@Tag("8")
class Record_2551 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2551: FirstName is Eldon")
	void FirstNameOfRecord2551() {
		assertEquals("Eldon", customers.get(2550).getFirstName());
	}

	@Test
	@DisplayName("Record 2551: LastName is Barvosa")
	void LastNameOfRecord2551() {
		assertEquals("Barvosa", customers.get(2550).getLastName());
	}

	@Test
	@DisplayName("Record 2551: Company is Peterson, Douglas R Esq")
	void CompanyOfRecord2551() {
		assertEquals("Peterson, Douglas R Esq", customers.get(2550).getCompany());
	}

	@Test
	@DisplayName("Record 2551: Address is 2842 Aiello Dr")
	void AddressOfRecord2551() {
		assertEquals("2842 Aiello Dr", customers.get(2550).getAddress());
	}

	@Test
	@DisplayName("Record 2551: City is San Jose")
	void CityOfRecord2551() {
		assertEquals("San Jose", customers.get(2550).getCity());
	}

	@Test
	@DisplayName("Record 2551: County is Santa Clara")
	void CountyOfRecord2551() {
		assertEquals("Santa Clara", customers.get(2550).getCounty());
	}

	@Test
	@DisplayName("Record 2551: State is CA")
	void StateOfRecord2551() {
		assertEquals("CA", customers.get(2550).getState());
	}

	@Test
	@DisplayName("Record 2551: ZIP is 95111")
	void ZIPOfRecord2551() {
		assertEquals("95111", customers.get(2550).getZIP());
	}

	@Test
	@DisplayName("Record 2551: Phone is 408-629-2602")
	void PhoneOfRecord2551() {
		assertEquals("408-629-2602", customers.get(2550).getPhone());
	}

	@Test
	@DisplayName("Record 2551: Fax is 408-629-4628")
	void FaxOfRecord2551() {
		assertEquals("408-629-4628", customers.get(2550).getFax());
	}

	@Test
	@DisplayName("Record 2551: Email is eldon@barvosa.com")
	void EmailOfRecord2551() {
		assertEquals("eldon@barvosa.com", customers.get(2550).getEmail());
	}

	@Test
	@DisplayName("Record 2551: Web is http://www.eldonbarvosa.com")
	void WebOfRecord2551() {
		assertEquals("http://www.eldonbarvosa.com", customers.get(2550).getWeb());
	}
}
