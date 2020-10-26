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

@Tag("36")
class Record_4612 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4612: FirstName is Florencio")
	void FirstNameOfRecord4612() {
		assertEquals("Florencio", customers.get(4611).getFirstName());
	}

	@Test
	@DisplayName("Record 4612: LastName is Bartlow")
	void LastNameOfRecord4612() {
		assertEquals("Bartlow", customers.get(4611).getLastName());
	}

	@Test
	@DisplayName("Record 4612: Company is Uehlinger, Gerard P Esq")
	void CompanyOfRecord4612() {
		assertEquals("Uehlinger, Gerard P Esq", customers.get(4611).getCompany());
	}

	@Test
	@DisplayName("Record 4612: Address is 1920 Spruce St")
	void AddressOfRecord4612() {
		assertEquals("1920 Spruce St", customers.get(4611).getAddress());
	}

	@Test
	@DisplayName("Record 4612: City is Philadelphia")
	void CityOfRecord4612() {
		assertEquals("Philadelphia", customers.get(4611).getCity());
	}

	@Test
	@DisplayName("Record 4612: County is Philadelphia")
	void CountyOfRecord4612() {
		assertEquals("Philadelphia", customers.get(4611).getCounty());
	}

	@Test
	@DisplayName("Record 4612: State is PA")
	void StateOfRecord4612() {
		assertEquals("PA", customers.get(4611).getState());
	}

	@Test
	@DisplayName("Record 4612: ZIP is 19103")
	void ZIPOfRecord4612() {
		assertEquals("19103", customers.get(4611).getZIP());
	}

	@Test
	@DisplayName("Record 4612: Phone is 215-732-9141")
	void PhoneOfRecord4612() {
		assertEquals("215-732-9141", customers.get(4611).getPhone());
	}

	@Test
	@DisplayName("Record 4612: Fax is 215-732-9147")
	void FaxOfRecord4612() {
		assertEquals("215-732-9147", customers.get(4611).getFax());
	}

	@Test
	@DisplayName("Record 4612: Email is florencio@bartlow.com")
	void EmailOfRecord4612() {
		assertEquals("florencio@bartlow.com", customers.get(4611).getEmail());
	}

	@Test
	@DisplayName("Record 4612: Web is http://www.florenciobartlow.com")
	void WebOfRecord4612() {
		assertEquals("http://www.florenciobartlow.com", customers.get(4611).getWeb());
	}
}
