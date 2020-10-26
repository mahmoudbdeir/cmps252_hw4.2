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

@Tag("24")
class Record_548 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 548: FirstName is Blanca")
	void FirstNameOfRecord548() {
		assertEquals("Blanca", customers.get(547).getFirstName());
	}

	@Test
	@DisplayName("Record 548: LastName is Monte")
	void LastNameOfRecord548() {
		assertEquals("Monte", customers.get(547).getLastName());
	}

	@Test
	@DisplayName("Record 548: Company is Crossing Rstrnt & Bnqt Facil")
	void CompanyOfRecord548() {
		assertEquals("Crossing Rstrnt & Bnqt Facil", customers.get(547).getCompany());
	}

	@Test
	@DisplayName("Record 548: Address is 6670 Federal Blvd")
	void AddressOfRecord548() {
		assertEquals("6670 Federal Blvd", customers.get(547).getAddress());
	}

	@Test
	@DisplayName("Record 548: City is Lemon Grove")
	void CityOfRecord548() {
		assertEquals("Lemon Grove", customers.get(547).getCity());
	}

	@Test
	@DisplayName("Record 548: County is San Diego")
	void CountyOfRecord548() {
		assertEquals("San Diego", customers.get(547).getCounty());
	}

	@Test
	@DisplayName("Record 548: State is CA")
	void StateOfRecord548() {
		assertEquals("CA", customers.get(547).getState());
	}

	@Test
	@DisplayName("Record 548: ZIP is 91945")
	void ZIPOfRecord548() {
		assertEquals("91945", customers.get(547).getZIP());
	}

	@Test
	@DisplayName("Record 548: Phone is 619-287-7793")
	void PhoneOfRecord548() {
		assertEquals("619-287-7793", customers.get(547).getPhone());
	}

	@Test
	@DisplayName("Record 548: Fax is 619-287-2697")
	void FaxOfRecord548() {
		assertEquals("619-287-2697", customers.get(547).getFax());
	}

	@Test
	@DisplayName("Record 548: Email is blanca@monte.com")
	void EmailOfRecord548() {
		assertEquals("blanca@monte.com", customers.get(547).getEmail());
	}

	@Test
	@DisplayName("Record 548: Web is http://www.blancamonte.com")
	void WebOfRecord548() {
		assertEquals("http://www.blancamonte.com", customers.get(547).getWeb());
	}
}
