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

@Tag("15")
class Record_753 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 753: FirstName is Albert")
	void FirstNameOfRecord753() {
		assertEquals("Albert", customers.get(752).getFirstName());
	}

	@Test
	@DisplayName("Record 753: LastName is Reuter")
	void LastNameOfRecord753() {
		assertEquals("Reuter", customers.get(752).getLastName());
	}

	@Test
	@DisplayName("Record 753: Company is Grandmas Deli & Bake Shop")
	void CompanyOfRecord753() {
		assertEquals("Grandmas Deli & Bake Shop", customers.get(752).getCompany());
	}

	@Test
	@DisplayName("Record 753: Address is 14635 Joanbridge St")
	void AddressOfRecord753() {
		assertEquals("14635 Joanbridge St", customers.get(752).getAddress());
	}

	@Test
	@DisplayName("Record 753: City is Baldwin Park")
	void CityOfRecord753() {
		assertEquals("Baldwin Park", customers.get(752).getCity());
	}

	@Test
	@DisplayName("Record 753: County is Los Angeles")
	void CountyOfRecord753() {
		assertEquals("Los Angeles", customers.get(752).getCounty());
	}

	@Test
	@DisplayName("Record 753: State is CA")
	void StateOfRecord753() {
		assertEquals("CA", customers.get(752).getState());
	}

	@Test
	@DisplayName("Record 753: ZIP is 91706")
	void ZIPOfRecord753() {
		assertEquals("91706", customers.get(752).getZIP());
	}

	@Test
	@DisplayName("Record 753: Phone is 626-962-7949")
	void PhoneOfRecord753() {
		assertEquals("626-962-7949", customers.get(752).getPhone());
	}

	@Test
	@DisplayName("Record 753: Fax is 626-962-6658")
	void FaxOfRecord753() {
		assertEquals("626-962-6658", customers.get(752).getFax());
	}

	@Test
	@DisplayName("Record 753: Email is albert@reuter.com")
	void EmailOfRecord753() {
		assertEquals("albert@reuter.com", customers.get(752).getEmail());
	}

	@Test
	@DisplayName("Record 753: Web is http://www.albertreuter.com")
	void WebOfRecord753() {
		assertEquals("http://www.albertreuter.com", customers.get(752).getWeb());
	}
}
