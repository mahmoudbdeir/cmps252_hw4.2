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
class Record_1971 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1971: FirstName is Santos")
	void FirstNameOfRecord1971() {
		assertEquals("Santos", customers.get(1970).getFirstName());
	}

	@Test
	@DisplayName("Record 1971: LastName is Evaristo")
	void LastNameOfRecord1971() {
		assertEquals("Evaristo", customers.get(1970).getLastName());
	}

	@Test
	@DisplayName("Record 1971: Company is Rios, Irene Alarcon Esq")
	void CompanyOfRecord1971() {
		assertEquals("Rios, Irene Alarcon Esq", customers.get(1970).getCompany());
	}

	@Test
	@DisplayName("Record 1971: Address is 331 S Kresson St")
	void AddressOfRecord1971() {
		assertEquals("331 S Kresson St", customers.get(1970).getAddress());
	}

	@Test
	@DisplayName("Record 1971: City is Baltimore")
	void CityOfRecord1971() {
		assertEquals("Baltimore", customers.get(1970).getCity());
	}

	@Test
	@DisplayName("Record 1971: County is Baltimore City")
	void CountyOfRecord1971() {
		assertEquals("Baltimore City", customers.get(1970).getCounty());
	}

	@Test
	@DisplayName("Record 1971: State is MD")
	void StateOfRecord1971() {
		assertEquals("MD", customers.get(1970).getState());
	}

	@Test
	@DisplayName("Record 1971: ZIP is 21224")
	void ZIPOfRecord1971() {
		assertEquals("21224", customers.get(1970).getZIP());
	}

	@Test
	@DisplayName("Record 1971: Phone is 410-327-8049")
	void PhoneOfRecord1971() {
		assertEquals("410-327-8049", customers.get(1970).getPhone());
	}

	@Test
	@DisplayName("Record 1971: Fax is 410-327-3879")
	void FaxOfRecord1971() {
		assertEquals("410-327-3879", customers.get(1970).getFax());
	}

	@Test
	@DisplayName("Record 1971: Email is santos@evaristo.com")
	void EmailOfRecord1971() {
		assertEquals("santos@evaristo.com", customers.get(1970).getEmail());
	}

	@Test
	@DisplayName("Record 1971: Web is http://www.santosevaristo.com")
	void WebOfRecord1971() {
		assertEquals("http://www.santosevaristo.com", customers.get(1970).getWeb());
	}
}
